import java.time.*;
import java.util.ArrayList;

public class CalendarEvent {
    LocalTime startTime;
    LocalTime endTime;
    String description;
    ArrayList<DayOfWeek> days = new ArrayList<DayOfWeek>();

    public CalendarEvent(LocalTime startTime, LocalTime endTime, String description, ArrayList<DayOfWeek> dayOfWeek){
        this.description = description;
        this.endTime = endTime;
        this.startTime = startTime;
        days.addAll(dayOfWeek);
    }

    public boolean eventHappening(LocalTime time, DayOfWeek day){
        return days.contains(day) && time.isAfter(startTime) && time.isBefore(endTime);
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public ArrayList<DayOfWeek> getDays() {
        return days;
    }
}
