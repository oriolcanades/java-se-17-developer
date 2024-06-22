package chapter3;

// Add any necessary import statements here
public class TestClass2 {

    /*
        Example of a `switch` statement:

        switch(variableToTest) {
            case constantExpression1
                // Branch for case1
                break;
            case constantExpression2, constantExpression3
                // Branch for case2 and case3
                break;
            ...
            default:
            // Branch for default
        }
     */

    public static void main(String[] args) {
        int dayOfTheWeek = 7;

        switch(dayOfTheWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6, 7: // combined case since Java 14, equivalent to case 6: case: 7
                System.out.println("Weekend");
                break;
            default:
                System.out.println(dayOfTheWeek + " is not a valid day of the week.");
        }

    }

}
