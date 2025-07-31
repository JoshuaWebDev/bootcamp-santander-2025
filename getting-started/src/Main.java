import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        var name = scanner.next();
        System.out.print("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.print("Você é emancipado? (S/N): ");
        var isEmancipated = scanner.next().equalsIgnoreCase("S");

        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
        var message = canDrive ?
                name +", você pode dirigir." :
                name +", você não pode dirigir.";
        /*if (canDrive) {
            message = name +", você pode dirigir.";
        } else {
            message = name +", você não pode dirigir.";
        }*/

        System.out.println(message);
    }
}
