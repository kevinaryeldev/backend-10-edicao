public class VariaveisEConstantes {
    public static void main(String[] args){
        int idade = 30;
        String nome = "Maicon Machado Gerardi da Silva";
        boolean ehSolteiro = false;
        float altura = 1.73f;
        double peso = 80.02;
        final String MEU_NOME_EH = "Meu nome é ";
        nome = "Alison Ailson da silva santos";
        // MEU_NOME_EH = "My name is ";
        /*
            de maneira alguma mexa no código abaixo, ele foi desenvolvido
            e quando foi desenvolvido só eu e Deus sabiamos dele...
            agora só quem sabe é Deus... :) não mexa
        */
        // aqui é formatada a saída do console.
        String saidaConsole = MEU_NOME_EH+nome+" solteiro? "+ehSolteiro+" tem "+idade+" anos.";

        System.out.println(saidaConsole);
    }
}
