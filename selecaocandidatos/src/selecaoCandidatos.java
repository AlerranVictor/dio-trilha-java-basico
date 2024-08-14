import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class selecaoCandidatos {
    public static void main(String[] args) throws Exception {
        List<String> devolotivaPositiva = filtroSalariosPretendidos();
        for(String candidato : devolotivaPositiva){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentanto = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentanto = !atendeu;
            if(continuarTentanto){
                tentativasRealizadas++;
            } else{
                System.out.println("Contato realizado com sucesso!");
            }
        }while(continuarTentanto && tentativasRealizadas<3);

        if(atendeu){
            System.out.println("Conseguimos contato na " + tentativasRealizadas + " tentativa com o(a) candidato(a): " + candidato);
        } else {
            System.out.println("Não conseguimos contato com o(a) candidato(a): " + candidato);
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static List<String> filtroSalariosPretendidos(){
        String [] candidatos = {"Felipe", "João", "Maria", "Fernando", "Augusto", "Diego", "José", "Márcia", "Finéias", "Flávia", "Fernanda", "Luis"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        List<String> selecionados = new ArrayList<>();

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O(a) candidato(a) " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O(a) candidato(a) " + candidato + " foi selecionado(a) para a vaga");
                selecionados.add(candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        return selecionados;
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
