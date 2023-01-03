public class FormatadorDeNome {
    public static void main (String [] args){
        String primeiroNome = "Anderson";
        String segundoNome = "Amantino";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Nome formatado ficou: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}