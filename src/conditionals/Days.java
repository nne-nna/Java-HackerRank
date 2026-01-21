package conditionals;

public class Days {
    public static void main(String args[]) {
        String days[] = {
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        };

        for (String day : days) {
            System.out.println(day);
            for (int hour=9;hour<=17;hour++) {
                int nextHour = hour + 1;

                String startTime = formatTime(hour);
                String endTime = formatTime(nextHour);

                System.out.println(day + " " + startTime + "-" + endTime);
            }
        }
    }
    static String formatTime(int hour) {
        if(hour==12) {
            return hour + " PM";
        } else if (hour>12) {
            return (hour-12) + " PM";
        } else {
            return hour + " AM";
        }
    }
}