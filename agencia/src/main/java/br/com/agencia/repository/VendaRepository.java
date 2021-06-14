package br.com.agencia.repository;

import br.com.agencia.model.Venda;
import org.springframework.data.repository.CrudRepository;


public interface VendaRepository extends CrudRepository<Venda,Long>{
    
}
