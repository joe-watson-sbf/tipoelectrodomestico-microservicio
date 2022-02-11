package co.com.electrodomestico.tipoelectrodomestico.repository;

import co.com.electrodomestico.tipoelectrodomestico.entity.TipoElectrodomesticoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoElectrodomesticoRepository extends JpaRepository<TipoElectrodomesticoEntity, String> {

}
