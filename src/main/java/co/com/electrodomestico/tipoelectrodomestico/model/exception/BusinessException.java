package co.com.electrodomestico.tipoelectrodomestico.model.exception;

public class BusinessException extends RuntimeException{

    public BusinessException(String mensaje){
        super(mensaje);
    }

}
