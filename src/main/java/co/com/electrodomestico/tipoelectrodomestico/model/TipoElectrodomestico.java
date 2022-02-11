package co.com.electrodomestico.tipoelectrodomestico.model;

import co.com.electrodomestico.tipoelectrodomestico.model.exception.BusinessException;
import co.com.electrodomestico.tipoelectrodomestico.util.Validar;

public class TipoElectrodomestico {
    public static final String ID_TIPO_ELECTRODOMESTICO_VACIO = "El ID del tipo de electrodomestico no puede estar vacio!";
    public static final String NOMBRE_TIPO_ELECTRODOMESTICO_VACIO = "El nombre del tipo de electrodomestico no puede estar vacio!";
    public static final String TARIFA_MANTENIMIENTO_CERO = "La tarifa no puede ser menor o igual a valor 0";

    private String idTipoElectrodomestico;
    private String nombreTipoElectrodomestico;
    private double tarifaMantenimiento;
    private boolean activo;

    private TipoElectrodomestico() {
        super();
    }

    public static class TipoElectrodomesticoBuilder{
        private String idTipoElectrodomestico;
        private String nombreTipoElectrodomestico;
        private double tarifaMantenimiento;
        private boolean activo;

        public TipoElectrodomesticoBuilder setIdTipoElectrodomestico(String idTipoElectrodomestico) {
            this.idTipoElectrodomestico = idTipoElectrodomestico;
            return this;
        }

        public TipoElectrodomesticoBuilder setNombreTipoElectrodomestico(String nombreTipoElectrodomestico) {
            this.nombreTipoElectrodomestico = nombreTipoElectrodomestico;
            return this;
        }


        public TipoElectrodomesticoBuilder setActivo(boolean activo) {
            this.activo = activo;
            return this;
        }

        public TipoElectrodomesticoBuilder setTarifaMantenimiento(double tarifaMantenimiento) {
            this.tarifaMantenimiento = tarifaMantenimiento;
            return this;
        }

        public TipoElectrodomestico build() throws BusinessException {
            TipoElectrodomestico tipoElectrodomestico = new TipoElectrodomestico();

            tipoElectrodomestico.idTipoElectrodomestico=this.idTipoElectrodomestico;
            Validar.estaVacia(idTipoElectrodomestico, ID_TIPO_ELECTRODOMESTICO_VACIO);
            tipoElectrodomestico.nombreTipoElectrodomestico=this.nombreTipoElectrodomestico;
            Validar.estaVacia(nombreTipoElectrodomestico, NOMBRE_TIPO_ELECTRODOMESTICO_VACIO);
            tipoElectrodomestico.activo=this.activo;
            tipoElectrodomestico.tarifaMantenimiento = this.tarifaMantenimiento;
            Validar.encontrarCero(tarifaMantenimiento, TARIFA_MANTENIMIENTO_CERO);

            return tipoElectrodomestico;
        }
    }

    public double getTarifaMantenimiento() {
        return tarifaMantenimiento;
    }

    public String getIdTipoElectrodomestico() {
        return idTipoElectrodomestico;
    }

    public String getNombreTipoElectrodomestico() {
        return nombreTipoElectrodomestico;
    }

    public boolean isActivo() {
        return activo;
    }
}
