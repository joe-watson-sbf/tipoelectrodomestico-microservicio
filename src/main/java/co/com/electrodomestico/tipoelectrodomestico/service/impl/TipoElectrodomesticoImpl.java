package co.com.electrodomestico.tipoelectrodomestico.service.impl;

import co.com.electrodomestico.tipoelectrodomestico.command.TipoElectrodomesticoCommand;
import co.com.electrodomestico.tipoelectrodomestico.entity.TipoElectrodomesticoEntity;
import co.com.electrodomestico.tipoelectrodomestico.fabrica.TipoElectrodomesticoFabrica;
import co.com.electrodomestico.tipoelectrodomestico.model.exception.BusinessException;
import co.com.electrodomestico.tipoelectrodomestico.repository.TipoElectrodomesticoRepository;
import co.com.electrodomestico.tipoelectrodomestico.service.TipoElectrodomesticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class TipoElectrodomesticoImpl implements TipoElectrodomesticoService {

    @Autowired
    private TipoElectrodomesticoRepository tipoElectrodomesticoRepository;

    @Autowired
    private TipoElectrodomesticoFabrica tipoElectrodomesticoFabrica;

    @Override
    public List<TipoElectrodomesticoCommand> findAll() {

        return tipoElectrodomesticoFabrica.entityToCommand(tipoElectrodomesticoRepository.findAll()) ;
    }

    @Override
    public void registrar(TipoElectrodomesticoCommand tipoElectrodomesticoCommand) {
        TipoElectrodomesticoEntity tipoElectrodomesticoEntity= tipoElectrodomesticoFabrica.CommandToEntity(tipoElectrodomesticoCommand);
        tipoElectrodomesticoRepository.save(tipoElectrodomesticoEntity);

    }

    @Override
    public TipoElectrodomesticoCommand findById(String id) throws BusinessException{
        return tipoElectrodomesticoFabrica.entityToCommand(tipoElectrodomesticoRepository.findById(id).orElse(null));
    }

}
