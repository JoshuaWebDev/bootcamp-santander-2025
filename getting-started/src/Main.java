import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        var scanner = new Scanner(System.in);
        for(var i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

}
