package HomeWork1;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Спать ли дальше?");
        sleepIn(false);
    }
    static boolean weekday;
    static boolean vacation;
    static boolean sleepIn (boolean isDay) {
        if (isDay == weekday) {
            System.out.println("Пора идти на работу");
            return false;
        } else if (isDay == vacation || isDay != weekday);{
            System.out.println("Можем спать дальше");
            return true;
        }
    }
}