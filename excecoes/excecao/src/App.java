import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Insira o seu nome abaixo:");
        String nome = scanner.nextLine();
        System.out.println("Insira o seu sobrenome:");
        String sobrenome = scanner.nextLine();
        System.out.println("Insira a sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Insira a sua altura:");
        double altura = scanner.nextDouble();
        }
        catch (InputMismatchException e){
            System.out.println("Os campos de idade e altura precisam ser numéricos!");
        }
        
    }
}
