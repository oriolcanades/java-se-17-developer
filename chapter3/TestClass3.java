package chapter3;

// Add any necessary import statements here
public class TestClass3 {

    public static void main(String[] args) {
        int month = 4;

        switch (month) {
            case 1, 2, 3:
                System.out.print("Winter");
            case 4, 5, 6:
                System.out.print("Spring");
            default:
                System.out.print("Unknown");
            case 7, 8, 9:
                System.out.print("Summer");
            case 10, 11, 12:
                System.out.print("Fall");
        }

    }

}
