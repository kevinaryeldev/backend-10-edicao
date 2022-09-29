package aula2;

public class VetoresEMatrizes {
    public static void main(String[] args) {
//        int[] numeros = new int[5]; // 5 elementos
//        numeros[0] = 12;
//        numeros[4] = 45;
//
//        System.out.println(numeros[0]);
//        System.out.println(numeros[1]);
//        System.out.println(numeros[2]);
//        System.out.println(numeros[4]);


//        String[] vetorStr = new String[2];
//        System.out.println(vetorStr[1]);
//
//        String[] meuVetor = {"Maicon", "Rafael", "Pedro", "Cleber", "Eduardo"};
//        System.out.println(meuVetor[3]);
//        System.out.println(meuVetor.length);
//        System.out.println(meuVetor[meuVetor.length - 1]); // 5 - 1 = 4
//        System.out.println(meuVetor[4]);

        int matriz[][] = new int[2][2];
        matriz[0][1] = 15;
        matriz[1][1] = 10;
        matriz[matriz.length -1][matriz[0].length - 1] = 99;
//        System.out.println(matriz[0][1]);

        int[][] outraMatriz = {
                //0  1
                {10, 8}, //0
                {15, 20}  //1
        };

//        System.out.println(outraMatriz[0][1]);
        System.out.println(outraMatriz[1][1]);

    }
}
