/**
 * classe main
 *
 * @author MerloFd
 */
public class Main {
    public static void main (String Args []){

        /**
         * Instanciando a classe MustangGt
         */
        MustangGt mustang = new MustangGt();

        /**
         * Definindo os valores usando os métodos
         */
        mustang.corMustang();
        mustang.motorMustang();
        mustang.modeloMustang();

        /**
         * Obtendo os valores usando os getters e imprimindo-os
         */
        System.out.println("Cor: " + mustang.getCor());
        System.out.println("Motor: " + mustang.getMotor());
        System.out.println("Modelo: " + mustang.getModelo());
    }
}
