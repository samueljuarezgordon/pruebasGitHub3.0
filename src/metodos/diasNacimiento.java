package metodos;
import java.time.LocalDate;
import java.time.Period;

public class diasNacimiento {
    public long calcular(LocalDate fecha){
        try {
            Period period = Period.between(fecha, LocalDate.now());
            long anyos = period.getYears();
            long meses = period.getMonths();
            long dias = period.getDays();
            long diasTotal = ((anyos*365)+(meses*30)+dias);
            System.out.println("Has vivido "+ diasTotal +" dias");
            return diasTotal;
        }
        catch (Exception e) {
            System.out.println("Error al convertir la fecha: "+e.getMessage());
            return 0;
        }


    }
}
