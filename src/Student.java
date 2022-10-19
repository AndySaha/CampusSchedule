import java.time.LocalTime;
import java.util.ArrayList;

public class Student {
    ArrayList<CalendarEvent> events;
    String name;

    public Student(String name){
        this.name = name;
        events = new ArrayList<>();
    }
    public void addEvent(CalendarEvent event){
        events.add(event);
    }
    public void removeEvent(CalendarEvent event){
        events.remove(event);
    }
}
