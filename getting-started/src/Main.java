import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 7: ");
        var option = scanner.nextInt();
        var message = switch (option) {
            case 1, 7  -> "Fim de Semana";
            case 2  -> "Segunda";
            case 3  -> "Terça";
            case 4  -> "Quarta";
            case 5  -> "Quinta";
            case 6  -> "Sexta";
            default -> "Opção Invalida";
        };
        System.out.println(message);
    }
}
