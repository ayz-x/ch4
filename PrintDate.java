public class PrintDate {
    public static void main(String[] args) {
        printNA("Thursday", "June", 7, 2067);
        printEU("Thursday", "June", 7, 2067);

    }public static void printNA (String weekday, String month, int day, int year){
        System.out.println(weekday + ", " + month + " " + day +", " + year);
    }
    public static void printEU (String weekday, String month, int day, int year){
        System.out.println(weekday + " " + day + " " + month + " " + year);
    }
}
