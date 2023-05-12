public class Suma {
    public int num1;
    public int num2;

    public Suma(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return this.num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // Mètode per retornar la suma del valor absolut de dos nombres
    public static int sumaValorAbsolut(int num1, int num2) {
        int valorAbsolutNum1 = Math.abs(num1); // Obtenenim el valor absolut de num1
        int valorAbsolutNum2 = Math.abs(num2); // Obtenenim el valor absolut de num2
        int suma = valorAbsolutNum1 + valorAbsolutNum2; // Calculem la suma dels valors absoluts
        return suma; // Retornem el resultat
    }

    // Mètode per retornar el num1
    public int getNumero1() {
        return num1;

    }

    // Mètode per sumar i retornar el resultat
    public int suma(int num1, int num2) {
        return num1 + num2;
    }
}
