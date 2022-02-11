package co.com.electrodomestico.tipoelectrodomestico.command;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class TipoElectrodomesticoCommand {

    private String idTipoElectrodomestico;
    private String nombreTipoElectrodomestico;
    private double tarifaMantenimiento;
    private boolean activo;
    
	public String getIdTipoElectrodomestico() {
		return idTipoElectrodomestico;
	}
	public void setIdTipoElectrodomestico(String idTipoElectrodomestico) {
		this.idTipoElectrodomestico = idTipoElectrodomestico;
	}
	public String getNombreTipoElectrodomestico() {
		return nombreTipoElectrodomestico;
	}
	public void setNombreTipoElectrodomestico(String nombreTipoElectrodomestico) {
		this.nombreTipoElectrodomestico = nombreTipoElectrodomestico;
	}
	public double getTarifaMantenimiento() {
		return tarifaMantenimiento;
	}
	public void setTarifaMantenimiento(double tarifaMantenimiento) {
		this.tarifaMantenimiento = tarifaMantenimiento;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
    
    
}
