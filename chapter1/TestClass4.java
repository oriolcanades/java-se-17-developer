package chapter1;

public class TestClass4 {

    public static void main(String[] args) {
        // fully qualified class names avoid conflicts
        java.util.Date date;
        java.sql.Date sqlDate;
        System.out.println("No conflicts");
    }

}

