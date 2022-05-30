package cz.davsoncze;

public class TimeUtils {
    public static long getTimeInMillis(String time) {
        // 1:20.557
        String[] data = time.split(":");
        int minutes = Integer.parseInt(data[0]);
        double seconds = Double.parseDouble(data[1]);

        return (long) (minutes * 60_000L + seconds * 1_000L);
    }
}
