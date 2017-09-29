package _06_conditions._01_switch;

public class Switch {

    public static void main(String[] args) {
        int month = 5;
        int year = 2017;
        int daysInMonth = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;

            case 2:
                switch (year) {
                    case 2012:
                        daysInMonth = 29;
                        break;

                    case 2017:
                        daysInMonth = 28;
                        break;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;

            default:
                System.out.println("Invalid month.");
        }

        System.out.println("month = " + month + ", days in month: " + daysInMonth);
    }

}
