package aula3;

public class Foguete {
    //atributos
    String cor;
    String fabricante;
    double propulcao;
    String modelo;
    String tipoCombustivel;
    double nivelCombustivel;

    //metodos
    public void decolar(double combustivelGasto) { //0.5
        nivelCombustivel-=combustivelGasto;
        System.out.println("decolando...");
    }

    public void pousar() {
        System.out.println("pousar...");
    }

    public void ligarMusica() {
        System.out.println("ligarMusica...");
    }

    public void desligar(){
        System.out.println("desligar...");
    }
}
