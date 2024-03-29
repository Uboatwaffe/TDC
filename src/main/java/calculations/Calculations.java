package calculations;

/**
 * Created on 28.12.2023
 *
 * @author Maciej
 * @version 4.1
 */
public class Calculations {

    /**
     * Function that calculates distance to the target
     *
     * @param mast_height            height of the target
     * @param height_in_milliradians height of the target in milliradians
     * @param zoom                   used zoom
     * @return distance to the target in meters
     */
    public static String distance(String mast_height, String height_in_milliradians, int zoom) {
        try {
            double mast = Double.parseDouble(mast_height);
            double milliradians = Double.parseDouble(height_in_milliradians);

            double answer = (mast * 1000) / milliradians;

            if (zoom == 2) {
                answer *= 4;
            }
            return String.valueOf(answer);
        } catch (NumberFormatException e) {
            return null;
        }

    }

    /**
     * Function that calculates visual length of the target
     * @param Distance distance to the target
     * @param length_in_degrees length of the target in degrees (in periscope)
     * @param zoom used zoom
     * @return visual length of the target in meters
     */
    public static String Length(String Distance, String length_in_degrees, int zoom) {
        try {
            double distance = Double.parseDouble(Distance);
            double length = Double.parseDouble(length_in_degrees);

            if (zoom == 2) length /= 4;

            double answer = distance * Math.tan(Math.toRadians((length * 100) / 105));

            return String.valueOf(answer);
        } catch (NumberFormatException e) {
            return null;
        }
    }


    /**
     * Function that calculates speed of the target
     * @param length_in_meters length of the target
     * @param time_in_seconds how much time it took target to cross its length
     * @return speed in knots
     */
    public static String Speed(String length_in_meters, String time_in_seconds) {
        try {
            double length = Double.parseDouble(length_in_meters);
            double time = Double.parseDouble(time_in_seconds);

            double answer = length / time;

            answer *= 1.94384449412;

            return String.valueOf(answer);
        } catch (NumberFormatException e) {
            return null;
        }
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
        try {
            double visual = Double.parseDouble(visual_length);
            double real = Double.parseDouble(real_length);

            double pre = visual / real;

            double aob = Math.toDegrees(Math.asin(pre));

            if (away) {
                aob = 180 - aob;
            }

            return String.valueOf(aob);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
