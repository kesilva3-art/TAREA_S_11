public class E20_Ambito_Globales {

    // estas son las variables de toda la clase, las pongo arriba para no perderme
    static int llamadas = 0;
    static int suma = 0;

    // este metodo hace el cuadrado
    static int cuadrado(int n) {
        llamadas = llamadas + 1; // cada vez que entro aqui sumo 1
        int resultado = n * n; // esto solo sirve aqui adentro
        return resultado;
    }

    // este metodo es solo para mostrar al final
    static void mostrar() {
        System.out.println("Suma: " + suma);
        System.out.println("Llamadas: " + llamadas);
    }

    public static void main(String[] args) {
        // hago el for del 1 al 3
        for (int i = 1; i <= 3; i++) {
            int c = cuadrado(i); // guardo lo que me devuelve
            suma = suma + c; // lo voy sumando
        }

        mostrar(); // muestro todo
    }
}


