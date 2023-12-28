package calculations;

/**
 * Created on 28.12.2023
 *
 * @author Maciek
 * @version 0.1
 */
public class Calculations {

    /**
     * Constructor
     */
    Calculations() {

    }

    public static String distance(String mast_height, String height_in_milliradians, int zoom) {
        double mast = Integer.parseInt(mast_height);
        double milliradians = Integer.parseInt(height_in_milliradians);

        double answer = (mast * 1000) / milliradians;

        switch (zoom) {
            case 2 -> answer *= 2;
            case 3 -> answer *= 4;
        }

        return Double.toString(answer);
    }

    public static String Length(String Distance, String length_in_degrees, int zoom) {
        double distance = Double.parseDouble(Distance);
        double length = Double.parseDouble(length_in_degrees);

        double answer = 0;

        switch (zoom) {
            case 1 -> answer = distance / 110;
            case 2 -> answer = distance / 300;
            case 3 -> answer = distance / 1100;
        }

        answer *= length;

        return Double.toString(answer);
    }

    public static String Speed(String length_in_meters, String time_in_seconds) {
        double length = Integer.parseInt(length_in_meters);
        double time = Integer.parseInt(time_in_seconds);

        double answer = length / time;

        answer *= 0.51444;

        return Double.toString(answer);
    }

    public static String AoB(String visual_length, String real_length) {
        double visual = Double.parseDouble(visual_length);
        double real = Double.parseDouble(real_length);

        double pre = visual / real;

        return Double.toString(Math.toDegrees(Math.asin(pre)));
    }
}
