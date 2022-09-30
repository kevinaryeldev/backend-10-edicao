package aula3;

public class Main {
    public static void main(String[] args) {
        Foguete spaceX = new Foguete();
        spaceX.fabricante = "Space X";
        spaceX.cor = "Branco";
        spaceX.nivelCombustivel = 50.5;

//        String minhaCor = spaceX.cor;
//        System.out.println(minhaCor);
//        System.out.println(spaceX.cor);

        spaceX.ligarMusica();

        spaceX.decolar(0.5);
        System.out.println(spaceX.nivelCombustivel);
    }
}
