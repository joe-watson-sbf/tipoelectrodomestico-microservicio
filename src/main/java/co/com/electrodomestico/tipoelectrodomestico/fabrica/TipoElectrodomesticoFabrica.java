package co.com.electrodomestico.tipoelectrodomestico.fabrica;

import co.com.electrodomestico.tipoelectrodomestico.command.TipoElectrodomesticoCommand;
import co.com.electrodomestico.tipoelectrodomestico.entity.TipoElectrodomesticoEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component // para que sea un BEAN para hacer inversion de dependencia
public class TipoElectrodomesticoFabrica {
    public List<TipoElectrodomesticoCommand> entityToCommand(List<TipoElectrodomesticoEntity> listatipoElectrodomesticoEntity){
        List<TipoElectrodomesticoCommand> listaTipoElectrodomesticoCommand = new ArrayList<>();
        listatipoElectrodomesticoEntity.forEach(e-> listaTipoElectrodomesticoCommand.add(entityToCommand(e)));
        return listaTipoElectrodomesticoCommand;
    }

    public TipoElectrodomesticoCommand entityToCommand(TipoElectrodomesticoEntity tipoElectrodomesticoEntity){
        TipoElectrodomesticoCommand tipoElectrodomesticoCommand = new TipoElectrodomesticoCommand();
        tipoElectrodomesticoCommand.setIdTipoElectrodomestico(tipoElectrodomesticoEntity.getIdTipoElectrodomestico());
        tipoElectrodomesticoCommand.setNombreTipoElectrodomestico(tipoElectrodomesticoEntity.getNombreTipoElectrodomestico());
        tipoElectrodomesticoCommand.setTarifaMantenimiento(tipoElectrodomesticoEntity.getTarifaMantenimiento());
        tipoElectrodomesticoCommand.setActivo(tipoElectrodomesticoEntity.isActivo());
        return  tipoElectrodomesticoCommand;
    }

    public TipoElectrodomesticoEntity CommandToEntity(TipoElectrodomesticoCommand tipoElectrodomesticoCommand) {
        TipoElectrodomesticoEntity tipoElectrodomesticoEntity = new TipoElectrodomesticoEntity();
        tipoElectrodomesticoEntity.setIdTipoElectrodomestico(tipoElectrodomesticoCommand.getIdTipoElectrodomestico());
        tipoElectrodomesticoEntity.setNombreTipoElectrodomestico(tipoElectrodomesticoCommand.getNombreTipoElectrodomestico());
        tipoElectrodomesticoEntity.setTarifaMantenimiento(tipoElectrodomesticoCommand.getTarifaMantenimiento());
        tipoElectrodomesticoEntity.setActivo(tipoElectrodomesticoCommand.isActivo());
        return  tipoElectrodomesticoEntity;
    }
}
