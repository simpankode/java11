package OOP;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dates {

    public static void main(String[] args) {
        
        //date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //time
        LocalTime time = LocalTime.now();
        System.out.println(time);

        //datetime
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        //datetime formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Sebelum diformat: " + datetime);
        String formattedDate = datetime.format(formatter);
        System.out.println("Sesudah diformat: " + formattedDate);

    }
}