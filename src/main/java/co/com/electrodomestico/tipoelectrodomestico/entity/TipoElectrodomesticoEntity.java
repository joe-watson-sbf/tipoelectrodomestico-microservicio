package co.com.electrodomestico.tipoelectrodomestico.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "TipoElectrodomestico")
@NoArgsConstructor

public class TipoElectrodomesticoEntity {
    @Id
    @Column(name = "idTipoElectrodomestico")
    private String idTipoElectrodomestico;
    @Column(name = "nombreTipoElectrodomestico")
    private String nombreTipoElectrodomestico;
    @Column(name = "tarifaMantenimiento")
    private double tarifaMantenimiento;
    @Column(name = "activo")
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
