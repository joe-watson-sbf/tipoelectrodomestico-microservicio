package co.com.electrodomestico.tipoelectrodomestico.util;

import co.com.electrodomestico.tipoelectrodomestico.model.exception.BusinessException;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("ALL")
public class Validar {

    public static String unSoloEspacio(String cadena) {
        String regex = "\\s{2,}";
        Pattern patron = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher validador = patron.matcher(cadena);

        return validador.replaceAll(" ").trim();
    }


    public static String quitarEspacios(String cadena) {
        String regex = "\\s+";
        Pattern patron = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher validador = patron.matcher(cadena);
        return validador.replaceAll("").trim();
    }


    public static void email(String email, String vacio, String invalido) {

        if (email == null) {
            throw new BusinessException(vacio);
        } else {
            if (!(email.contains(".") && email.contains("@"))) {
                throw new BusinessException(invalido);
            }
        }
    }

    public static void estaVacia(String identificador, String mensaje) {

        if (identificador == null || identificador.isEmpty()) {
            throw new BusinessException(mensaje);
        }
    }

    public static void fechaNula(Date fechaInicio, String mensaje) throws BusinessException {
        if(fechaInicio == null){
            throw new BusinessException(mensaje);
        }
    }

    public static void encontrarCero(Double valor, String mensaje){
        if (valor <= 0){
            throw new BusinessException(mensaje);
        }
    }

    public static void ObjetoNulo(Object object, String mensaje) throws BusinessException {
        if(object == null){
            throw new BusinessException(mensaje);
        }
    }

}
