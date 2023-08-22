package CodingBat.Logic1;

import java.time.DayOfWeek;
import java.time.MonthDay;

public class cigarParty {

    public boolean cigarParty(int cigars, boolean isWeekend) {


        if (isWeekend) {
            return cigars >= 40;
        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }

}
