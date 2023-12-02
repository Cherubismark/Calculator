//The "this" keyword is used when a variable name is used twice. It specifies //the version of the variable is the one that belongs to the class. 

public class Date {
    private String day;
    private String month;
    private String year;

    Date(String d, String m, String y) {
        day = d;
        month = m;
        year = y;

    }

    public String getDayOfMonth() {
        return day;
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String toString() {
        return ("It is day number " + day + " of " + month + " of year " + year + ".");
    }

    public static void main(String[] args) {

        Date myDate = new Date("19", "March", "1945");
        String x = myDate.toString();
        System.out.println(x);

    }
}