package aula1;

public class Agregadores {
    public static void main(String[] args) {
        /*
          AGREGADORES
          ! = não ... !ehSolteiro (não ehSolteiro) PS: se a variável estiver como TRUE, ela se torna FALSE. e vice-versa
          && = e ... ehSolteiro e temVidaSocial
          || = ou ... ehSolteiro ou ehCasado
          */

        // ! = não ... !ehSolteiro (não ehSolteiro) PS: se a variável estiver como TRUE, ela se torna FALSE. e vice-versa
//        boolean ehSolteiro = true;
//        System.out.println(!ehSolteiro);
//        System.out.println(!(1 == 2));

        // && = E ... ehSolteiro e temVidaSocial
        // as duas condições tem que ser verdadeira para o && ser verdadeiro...
//        boolean ehSolteiro = true;
//        boolean temVidaSocial = true;
//        System.out.println(ehSolteiro && temVidaSocial);

//        boolean ehSolteiro = true;
//        boolean temVidaSocial = false;
//        System.out.println(ehSolteiro && temVidaSocial);
        // || = OU ... ehSolteiro ou ehCasado
        // uma das duas condições tem que ser verdadeira para o || ser verdadeiro...
//        boolean ehSolteiro = true;
//        boolean ehCasado = false;
//        System.out.println(ehSolteiro || ehCasado);

        boolean ehSolteiro = false;
        boolean ehCasado = false;
        System.out.println(ehSolteiro || ehCasado);
    }
}
