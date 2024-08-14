import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int parametroum = scanner.nextInt();
        System.out.println("Insira outro número (este deve ser maior que o primeiro): ");
        int parametrodois = scanner.nextInt();
        
        try{
            contar(parametroum, parametrodois);
        } catch (ParametroInvalidoException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    static void contar(int parametroum, int parametrodois) throws ParametroInvalidoException {
        if(parametroum >= parametrodois){
            throw new ParametroInvalidoException();
        }
        int contagem = parametrodois - parametroum;
        for(int i = 0; i<contagem; i++){
            System.out.println(i+1);
        }
    }
}
