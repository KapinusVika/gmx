package java.automation.lab.fall.kapinus.core22.domain;

public class Reception {
    public boolean booking(Trainer trainer, UserBook userBook){
        int[][] schedule = trainer.getSchedule();
        int day = userBook.getDay();
        int hour = userBook.getHour();

        if(schedule[day][hour] == 1){
            return true;
        } else {
            return false;
        }
    }
}
