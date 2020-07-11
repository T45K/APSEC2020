public class Main {

    void fizzBuzz1(int i) {
        if (i % 15 == 0) {
            System.out.println("fizzbuzz");
        } else if (i % 3 == 0) {
            System.out.println("fizz");
        } else if (i % 5 == 0) {
            System.out.println("buzz");
        }else {
            System.out.println(i);
        }
    }

    void fizzBuzz2(int j) {
        if (j % 3 == 0) {
            System.out.println("fizz");
        } else if (j % 5 == 0) {
            System.out.println("buzz");
        } else if (j % 15 == 0) {
            System.out.println("fizzbuzz");
        }else {
            System.out.println(j);
        }
    }
}
