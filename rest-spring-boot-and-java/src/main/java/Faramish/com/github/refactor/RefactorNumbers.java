package Faramish.com.github.refactor;

import Faramish.com.github.exception.UnsupportedMathOperationException;

public class RefactorNumbers {

    public static Double convertToDouble(String strNumber) throws IllegalArgumentException {
        //Verifica se o numero é nulo ou vazio.
        if (strNumber == null || strNumber.isEmpty())
            throw new UnsupportedMathOperationException("Please set a numeric value!");

        String number = strNumber.replace(",", "."); //Troca a virgula para ponto.

        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty())  //Verifica se o numero é nulo ou vazio.
            return false;
        String number = strNumber.replace(",", "."); //Troca a virgula para ponto.

        return number.matches("[-+]?[0-9]*\\.?[0-9]+"); //Define se o que foi digitado está dentro do determinado
    }
}
