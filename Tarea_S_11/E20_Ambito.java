public class E20_Ambito {

    static int llamadas = 0;

    static int cuadrado(int n) {
        llamadas = llamadas + 1;
        int resultado = n * n;
        return resultado;
    }

    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 3; i++) {
            suma = suma + cuadrado(i);
        }

        System.out.println("Suma: " + suma);
        System.out.println("Llamadas: " + llamadas);
    }
}