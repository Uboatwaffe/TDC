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

    /**
     * Function that calculates distance to the target
     *
     * @param mast_height            height of the target
     * @param height_in_milliradians height of the target in milliradians
     * @param zoom                   used zoom
     * @return distance to the target in meters
     */
    public static String distance(String mast_height, String height_in_milliradians, int zoom) {
        double mast = Double.parseDouble(mast_height);
        double milliradians = Double.parseDouble(height_in_milliradians);

        double answer = (mast * 1000) / milliradians;

        switch (zoom) {
            case 2 -> answer *= 2;
            case 3 -> answer *= 4;
        }

        return String.valueOf(answer);
    }

    /**
     * Function that calculates visual length of the target
     * @param Distance distance to the target
     * @param length_in_degrees length of the target in degrees (in periscope)
     * @param zoom used zoom
     * @return visual length of the target in meters
     */
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

        return String.valueOf(answer);
    }


    /**
     * Function that calculates speed of the target
     * @param length_in_meters length of the target
     * @param time_in_seconds how much time it took target to cross its length
     * @return speed in knots
     */
    public static String Speed(String length_in_meters, String time_in_seconds) {
        double length = Double.parseDouble(length_in_meters);
        double time = Double.parseDouble(time_in_seconds);

        double answer = length / time;

        answer *= 1.943844;

        return String.valueOf(answer);
    }

    /**
     * Function that calculates AoB of the target
     *
     * @param visual_length visual length of the target (in meters)
     * @param real_length   real length of the target (in meters)
     * @param away          tells if target is going away or towards
     * @return AoB to your boat in degrees
     */
    public static String AoB(String visual_length, String real_length, boolean away) {
        double visual = Double.parseDouble(visual_length);
        double real = Double.parseDouble(real_length);

        double pre = visual / real;

        double aob = Math.toDegrees(Math.asin(pre));

        if (away) {
            aob = 180 - aob;
        }

        return String.valueOf(aob);
    }
}
