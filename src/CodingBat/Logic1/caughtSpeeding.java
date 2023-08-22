package CodingBat.Logic1;

public class caughtSpeeding {

    public int caughtSpeeding(int speed, boolean isBirthday) {

        int noTicket = 0;
        int smallTicket = 1;
        int bigTicket = 2;

        if (isBirthday) {
            if (speed <= 65) {
                return noTicket;
            } else if (speed <= 85) {
                return smallTicket;
            } else {
                return bigTicket;
            }
        } else {
            if (speed <= 60) {
                return noTicket;
            } else if (speed <= 80) {
                return smallTicket;
            } else {
                return bigTicket;
            }
        }
    }
}
