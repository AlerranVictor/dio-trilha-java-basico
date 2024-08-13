public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("6879000");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e){
            System.out.println("O cep não corresponde corretamente");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        //simulando um cep formatado
        return "68.790-000";
    }
}
