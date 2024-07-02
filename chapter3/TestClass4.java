package chapter3;

// Add any necessary import statements here
public class TestClass4 {

    public static void main(String[] args) {
        int month = 90;

        String result = switch (month) {
            case 1, 2, 3 -> "Winter";
            case 4, 5, 6 -> "Spring";
            case 7, 8, 9 -> "Summer";
            case 10, 11, 12 -> "Fall";
            default -> {
                System.out.println(month + " is not a valid month");
                // Required for case block if switch returns a value
                yield "Unknown";
            }
        };

        System.out.println(result);

    }

}
