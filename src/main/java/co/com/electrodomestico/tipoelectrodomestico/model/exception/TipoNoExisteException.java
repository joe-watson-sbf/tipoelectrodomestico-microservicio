package co.com.electrodomestico.tipoelectrodomestico.model.exception;

public class TipoNoExisteException extends RuntimeException {
    public TipoNoExisteException(String mensaje) {
        super(mensaje);
    }
}
