public class TestClass8 {

    public static void main(String args[]) {
        var test = "Hello";
        // var can be reasigned to null value
        test = null;
        System.out.println("result: " + test);
        // but cannot be initialized as null
        // var test2 = null // Does not compile
    }

}
