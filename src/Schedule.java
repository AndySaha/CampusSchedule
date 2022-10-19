import java.time.Duration;
import java.time.LocalTime;
import java.util.*;
public class Schedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println("A- Add Event, R- Remove Event, C- Check Events, Q- Quit\n");
        String command = scanner.nextLine();
        command = command.toLowerCase();

        switch(command){
            case "a":
                System.out.println("When does the event start? (Example: 16:30)");
                LocalTime start = LocalTime.parse(scanner.nextLine());
                System.out.println("When does the event end? (Example: 18:00)");
                LocalTime end = LocalTime.parse(scanner.nextLine());
                System.out.println("What kind of event is this? 1- Class, 2- On Campus, 3- Home (busy), 4- Home (free)");
                int eventType = scanner.nextInt();
        }
    }

}