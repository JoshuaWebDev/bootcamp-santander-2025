import java.util.Scanner;

public class Main {

    final static String WELCOME_MESSAGE = "Seja bem vindo!";

    public static void main(String... args) {
        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        System.out.print("Enter your name: ");
        var name = scanner.next();
        System.out.print("Enter your age: ");
        var age = scanner.nextInt();
        System.out.printf("Name: %s \nAge: %s", name, age);
    }

}
