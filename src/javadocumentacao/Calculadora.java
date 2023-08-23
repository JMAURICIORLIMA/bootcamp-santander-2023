package javadocumentacao;
/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author  Gleyson Sampaio
 * @version 1.0
 * @since   01/01/2022
 */
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }

    /**
     * Calculadora Simples
     * @author Gleyson Sampaio
     */
    public class CalculadoraExemplo2 {
        /**
         * Realiza a divisão entre dois números inteiros
         *
         * @param dividendo     Número que será dividido
         * @param divisor       Número que irá dividir o dividendo
         * @return              O resultado da divisão entre o dividendo e o divisor
         * @author              Gleyson Sampaio
         * @exception 	        java.lang.ArithmeticException em caso de passar o divisor igual a zero 0.
         */
        static Integer dividir(Integer dividendo, Integer divisor){
            return dividendo / divisor;
        }
    }

}
