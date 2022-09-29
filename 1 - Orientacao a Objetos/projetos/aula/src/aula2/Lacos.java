package aula2;

import java.util.Scanner;

public class Lacos {
    public static void main(String[] args) {
        // n vezes um trecho de código

//        for (int controle = 1; controle <= 5; controle++) { //controle=6
//            System.out.println("entrou aqui");
//        }

//        int[] valores = {2, 3, 5, 7, 11, 13};
//        for (int i = 0; i < valores.length; i++) {
//            System.out.println("posição=" + i + " | valor=" + valores[i]);
//        }
//
//        for (int minhaVariavelMagica : valores) {
//            System.out.println(minhaVariavelMagica);
//        }

//        int[][] outraMatriz = {
//                //0  1
//                {10, 8}, //0
//                {15, 20}  //1
//        };
//        for (int[] linha : outraMatriz) { // 1
//            for (int elemento : linha) { // 0 1
//                System.out.println(elemento);
//            }
//        }
//        for (int linha = 0; linha < outraMatriz.length; linha++) {
//            for (int coluna = 0; coluna < outraMatriz[linha].length; coluna++) {
//                System.out.println(outraMatriz[linha][coluna]);
//            }
//        }
//        Scanner leitor = new Scanner(System.in);
//        int valor = leitor.nextInt();

//        while(valor == 0){
//            System.out.println("é igual a zero");
//            valor = leitor.nextInt();
//        }
//        System.out.println("digitou um valor diferente de zero");

        Scanner leitor = new Scanner(System.in);
        int valor;
        do {
            valor = leitor.nextInt();
            if(valor == 0){
                System.out.println("é igual a zero");
            }
        } while(valor == 0);
        System.out.println("digitou um valor diferente de zero");
    }
}
