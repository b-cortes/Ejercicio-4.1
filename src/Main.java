public class Main {
    // Método principal para probar el funcionamiento de la clase
    public static void main(String[] args) {
        // Creamos un objeto de nuestra clase
        MiniCalculadora calculadora = new MiniCalculadora();

        // Variables de prueba
        double numeroNegativo = -27.5;
        double numeroPositivo = 144.0;

        // Probamos el método valorAbsoluto
        double resultadoAbsoluto = calculadora.valorAbsoluto(numeroNegativo);
        System.out.println("El valor absoluto de " + numeroNegativo + " es: " + resultadoAbsoluto);

        // Probamos el método raizCuadrada
        double resultadoRaiz = calculadora.raizCuadrada(numeroPositivo);
        System.out.println("La raíz cuadrada de " + numeroPositivo + " es: " + resultadoRaiz);
    }
}
