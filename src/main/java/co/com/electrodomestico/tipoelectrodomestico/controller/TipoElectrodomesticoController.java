package co.com.electrodomestico.tipoelectrodomestico.controller;

import co.com.electrodomestico.tipoelectrodomestico.command.TipoElectrodomesticoCommand;
import co.com.electrodomestico.tipoelectrodomestico.service.TipoElectrodomesticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipoelectrodomestico")
public class TipoElectrodomesticoController {
    @Autowired
    private TipoElectrodomesticoService tipoElectrodomesticoService;

    @GetMapping("/all")
    public List<TipoElectrodomesticoCommand> getTipoElectrodomestico(){
        return tipoElectrodomesticoService.findAll();
    }

    @GetMapping("/{id}")
    public TipoElectrodomesticoCommand findById(@PathVariable final String id){
        return tipoElectrodomesticoService.findById(id);
    }

    @PostMapping("/registro")
    public void registroTipoElectrodomestico(@RequestBody final TipoElectrodomesticoCommand tipoElectrodomesticoCommand){
        tipoElectrodomesticoService.registrar(tipoElectrodomesticoCommand);
    }
}
