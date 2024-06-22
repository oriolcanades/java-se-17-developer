package chapter3;

import java.util.List;

public class TestClass {

    public static void main(String[] args) {
        Number number = 5;
        compareIntegers(number);
        compareIntegers2(number);
        compareIntegers3(number);
        compareIntegers4(number);

        number = 4; // Lower use case
        printIntegersGreaterThan5(number);
        number = 5; // Equal use case
        printIntegersGreaterThan5(number);
        number = 10; // Greater use case
        printIntegersGreaterThan5(number);

        classesAndInterfacesWithPatternMatching();
    }

    static void compareIntegers(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;
            System.out.println("compareIntegers: " + data.compareTo(5));
        }
    }

    static void compareIntegers2(Number number) {
        if (number instanceof Integer data) {
            System.out.println("compareIntegers2: " + data.compareTo(5));
        }
    }

    // While possible, it is a bad practice to reassign a pattern variable since doing so can lead to
    // ambiguity about what is and is not in scope.
    static void compareIntegers3(Number number) {
        if (number instanceof Integer data) {
            data = 10;
            System.out.println("compareIntegers3: " + data.compareTo(5));
        }
    }

    // The reassignment can be prevented with a final modifier, but it is better not to reassign
    // the variable at all.
    static void compareIntegers4(Number number) {
        if (number instanceof final Integer data) {
//            data = 10; // DOES NOT COMPILE because 'data' is set final
            System.out.println("compareIntegers4: " + data.compareTo(5));
        }
    }

    static void printIntegersGreaterThan5(Number number) {
        if(number instanceof Integer data && data.compareTo(5)>0)
            System.out.print("Filtered data - Greater than 5: " + data);
    }

    static void printIntegers2GreaterThan5(Number number) {
        if(number instanceof Integer data && data.compareTo(5)>0)
            System.out.print("Filtered data - Greater than 5: " + data);
//        } else {
//            System.out.print(data); // DOES NOT COMPILE, data is assigned in if statement not in the else
//        }
    }

    static void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data)) {
            return;
        } else {
            System.out.print(data.intValue());
        }
    }

//    static void printIntegers2GreaterThan5(Number number) {
//        if(number instanceof Integer data) {
//            return;
//        } else {
//            System.out.print(data); // DOES NOT COMPILE
//        }
//    }


    // Classes and interfaces
    static void classesAndInterfacesWithPatternMatching() {
        Number value = 123;
        if (value instanceof List) {
            System.out.println("Is a list");
        }
        if (value instanceof List data) {
            System.out.println("Is a list: " + data);
        }
    }

}
