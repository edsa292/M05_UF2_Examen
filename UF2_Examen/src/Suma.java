public class Suma {
    public int num1;
    public int num2;

    // Mètode per retornar la suma del valor absolut de dos nombres
    public static int sumaValorAbsolut(int num1, int num2) {
        int valorAbsolutNum1 = Math.abs(num1); // Obtenenim el valor absolut de num1
        int valorAbsolutNum2 = Math.abs(num2); // Obtenenim el valor absolut de num2
        int suma = valorAbsolutNum1 + valorAbsolutNum2; // Calculem la suma dels valors absoluts
        return suma; // Retornem el resultat
    }
}
