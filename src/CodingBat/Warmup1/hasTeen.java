package CodingBat.Warmup1;

import org.w3c.dom.ranges.Range;

import java.awt.font.NumericShaper;
import java.io.Serializable;
import java.time.temporal.ValueRange;

public class hasTeen {

    public boolean hasTeen(int a, int b, int c) {

        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        }
        return false;

    }

}
