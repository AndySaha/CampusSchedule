import java.time.Duration;
import java.time.LocalTime;
import java.util.*;
public class Schedule {
    ArrayList<Student> students;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?\n");
        String name = scanner.nextLine();
        System.out.println("What would you like to do?\n");
        System.out.println("A- Add Event, R- Remove Event, C- Check Events, Q- Quit\n");
        String command = scanner.nextLine();
        command = command.toLowerCase();

        switch(command){
            case "a":
                System.out.println("When does the event start? (Example: 16:30): \n");
                LocalTime start = LocalTime.parse(scanner.nextLine());
                System.out.println("When does the event end? (Example: 18:00): \n");
                LocalTime end = LocalTime.parse(scanner.nextLine());
                System.out.println("What kind of event is this? 1- Class, 2- On Campus, 3- External - Busy, 4- Home (free): \n");
                int eventType = scanner.nextInt();
                System.out.println("Give a short description of your event: \n");
                String description = scanner.nextLine();
            case "r":
                System.out.println("What event do you want to remove?\n");
                String remove = scanner.nextLine();
        }
    }
}