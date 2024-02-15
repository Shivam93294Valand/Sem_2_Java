import java.util.Scanner;

class time {
    int hour;
    int minute;

    public time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public static time timeAddition(time t1, time t2) {
        int newHour = t1.hour + t2.hour;
        int newMinute = t1.minute + t2.minute;

        if (newMinute >= 60) {
            newHour += newMinute / 60;
            newMinute %= 60;
        }

        return new time(newHour, newMinute);
    }
}

public class timeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st time hour");
        int h1 = sc.nextInt();
        System.out.println("Enter 1st time minute");
        int m1 = sc.nextInt();
        System.out.println("Enter 2nd time hour");
        int h2 = sc.nextInt();
        System.out.println("Enter 2nd time minute");
        int m2 = sc.nextInt();
        sc.close();
        time t1 = new time(h1, m1);
        time t2 = new time(h2, m2);
        time result = time.timeAddition(t1, t2);

        System.out.println("Total hour =" + result.hour + " and minute =" + result.minute);
    }
}