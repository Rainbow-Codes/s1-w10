public class LeapYear {

    public boolean isLeapYear(int year) {
        boolean four = year % 4 == 0;
        boolean hundred = year % 100 == 0;
        boolean fourHundred = year % 400 == 0;

        return fourHundred || (four && !hundred);
    }
}
