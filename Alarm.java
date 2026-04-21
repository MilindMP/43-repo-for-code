import java.time.LocalTime;

public class AlarmClock {
    public static void main(String[] args) throws InterruptedException {
        // Set alarm time (HH:MM:SS)
        LocalTime alarmTime = LocalTime.of(10, 30, 0);

        System.out.println("Alarm set for: " + alarmTime);

        while (true) {
            LocalTime now = LocalTime.now();

            if (now.getHour() == alarmTime.getHour() &&
                now.getMinute() == alarmTime.getMinute() &&
                now.getSecond() == alarmTime.getSecond()) {

                System.out.println("⏰ Alarm! Wake up!");
                
                // Beep sound
                for (int i = 0; i < 5; i++) {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    Thread.sleep(1000);
                }
                break;
            }

            Thread.sleep(1000); // check every second
        }
    }
}
