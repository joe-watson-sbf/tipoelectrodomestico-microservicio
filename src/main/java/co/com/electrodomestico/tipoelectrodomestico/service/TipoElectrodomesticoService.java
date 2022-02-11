package co.com.electrodomestico.tipoelectrodomestico.service;

import co.com.electrodomestico.tipoelectrodomestico.command.TipoElectrodomesticoCommand;

import java.util.List;

public interface TipoElectrodomesticoService {
    List<TipoElectrodomesticoCommand> findAll();

    void registrar(TipoElectrodomesticoCommand tipoElectrodomesticoCommand);

    TipoElectrodomesticoCommand findById(String id);
}
