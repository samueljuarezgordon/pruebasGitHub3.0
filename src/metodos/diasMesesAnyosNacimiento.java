package metodos;
import java.time.LocalDate;
import java.time.Period;

public class diasMesesAnyosNacimiento {
    public long calcular(LocalDate fecha){
        try {
            Period period = Period.between(fecha, LocalDate.now());
            int anyos = period.getYears();
            int meses = period.getMonths();
            int dias = period.getDays();
            System.out.println("Has vivido "+ anyos +" anyos, "+ meses +" meses y "+ dias +" dias.");
            return anyos;
        }
        catch (Exception e) {
            System.out.println("Error al convertir la fecha: "+e.getMessage());
            return 0;
        }


    }
}
