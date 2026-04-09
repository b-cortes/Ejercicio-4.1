

import java.io.Serializable;

/**
 * La clase miniCalculadoraEjemplo proporciona herramientas matemáticas básicas.
 * Esta clase implementa Serializable para demostrar el uso de etiquetas específicas.
 * * @author Tu Nombre
 * @version 2.0
 * @see java.lang.Math
 * @since Versión 1.0 de la Suite Educativa
 */
public class MiniCalculadora implements Serializable {

    /**
     * Identificador único para la serialización de la clase.
     * @serial Valor que asegura la compatibilidad entre versiones serializadas.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Calcula el valor absoluto de un número.
     * * @param numero El valor numérico de tipo double.
     * @return El valor absoluto del número ingresado.
     * @since Versión 1.0
     * @see #raizCuadrada(double)
     */
    public double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }

    /**
     * Calcula la raíz cuadrada de un número positivo.
     * * @param numero El número para calcular la raíz.
     * @return El resultado de la raíz cuadrada.
     * @throws IllegalArgumentException Si el número es negativo, ya que no tiene raíz real.
     * @since Versión 1.1
     */
    public double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        return Math.sqrt(numero);
    }

    /**
     * Método antiguo para mostrar mensajes.
     * * @deprecated Este método es ineficiente. Use el sistema de logs en su lugar.
     * @since Versión 1.0
     */
    @Deprecated
    public void imprimirMensajeViejo() {
        System.out.println("Este método ya no se recomienda.");
    }
}
