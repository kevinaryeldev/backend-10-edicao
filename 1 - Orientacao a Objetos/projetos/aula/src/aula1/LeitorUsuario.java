package aula1;

import java.util.*;
import br.com.minhaempresa.Moto;
import br.com.minhaempresa.Carro;
//import br.com.minhaoutraempresa.Carro;
//import br.com.*;

public class LeitorUsuario {
    public static void main(String[] args) {
        Scanner leitorDoUsuario = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = leitorDoUsuario.nextLine();
        System.out.println(nome);

        System.out.println("Informe a sua idade: ");
        int idade = leitorDoUsuario.nextInt();
        leitorDoUsuario.nextLine();
        System.out.println(idade);

        Moto moto = new Moto();

        Carro carro = new Carro();
        br.com.minhaoutraempresa.Carro carroMinhaOutraempresa = new br.com.minhaoutraempresa.Carro();

    }
}
