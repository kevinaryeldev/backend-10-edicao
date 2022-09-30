package aula3;

public class Wrappers {
    public static void main(String[] args) {
//        int[] valores = new int[2];
//        System.out.println(valores[0]);


//        int valor1 = 5;
//        Integer valor1Integer = null;
//        System.out.println(valor1);
//        System.out.println(valor1Integer);
//        Integer maxValue = Integer.MAX_VALUE;
//        Integer minValue = Integer.MIN_VALUE;
//        System.out.println(maxValue);
//        System.out.println(minValue);
//
//        long meuLong = 5;
//        Long meuLongWrapper = meuLong;
//        System.out.println(meuLong);
//        System.out.println(meuLongWrapper);
//        if (meuLongWrapper.equals(meuLong)){
//            System.out.println("é igual");
//        }
//
//        var teste = 23423423;

//        String minhaStr = "teste";
//        if(minhaStr.equals("teste")){
//            System.out.println("é teste");
//        }

//        int valor1 = 50; // 4 bytes
//        long valorLong = valor1; // 8 bytes
//        short valorShort = (short) valor1; // 2 bytes
//
//        Integer valorWrapper = 50;
//        Long valorWrapperLong = valorWrapper.longValue();

        String minhaString = "Teste do meu valor";
        passarValor(minhaString);
        System.out.println(minhaString);

        Foguete spaceX = new Foguete();
        spaceX.fabricante = "Space X";
        spaceX.cor = "Branco";
        spaceX.nivelCombustivel = 50.5;


        System.out.println(spaceX.fabricante);
        passarReferencia(spaceX);
        System.out.println(spaceX.fabricante);
    }

    public static void passarReferencia(Foguete foguete){
        foguete.fabricante = "Nasa";
    }

    public static void passarValor(String qualquerCoisa){ // wrapper, String...
        qualquerCoisa = "Não é mais um teste";
    }


}
