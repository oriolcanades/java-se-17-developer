package chapter1;

public class TestClass1 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("bird");
        System.out.println(animal.getName());
    }

}

class Animal {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}
