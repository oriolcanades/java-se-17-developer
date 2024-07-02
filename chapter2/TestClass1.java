public class TestClass1 {
    public static void main(String args[]) {
        //Duck duck = new Duck(4);
        Duck duck = null;
        if(duck!=null && duck.age()<3) {   
            System.out.println("Duck has: " + duck.age() );
        }
      
    }
}

record Duck(int age) {}
