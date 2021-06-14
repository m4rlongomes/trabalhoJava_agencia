package br.com.agencia.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.agencia.model.Carro;


public interface CarroRepository extends CrudRepository<Carro,Long>{
    
}
