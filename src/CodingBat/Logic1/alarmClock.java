package CodingBat.Logic1;

public class alarmClock {

    public String alarmClock(int day, boolean vacation) {

        String alarmEarly = "7:00";
        String alarmLate = "10:00";
        String noAlarm = "off";

        if (!vacation) {
            if (day > 0 && day <= 5) {
                return alarmEarly;
            } return alarmLate;
        } else {
            if (day > 0 && day <= 5) {
                return alarmLate;
            } return noAlarm;
        }
    }
}
