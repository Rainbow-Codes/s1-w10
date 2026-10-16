public class leapYearMain {
    public static void main(String Args[]) {
        LeapYear p = new LeapYear();
        System.out.println(p.isLeapYear(2000));
        System.out.println(p.isLeapYear(2001));
        System.out.println(p.isLeapYear(2004));
        System.out.println(p.isLeapYear(2100));
        System.out.println(p.isLeapYear(2400));
    }
}