package br.silva.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import br.silva.spring02.model.Cliente;

//CRUD - Create, Read, Update e Delete registros
public interface ClienteRepo extends CrudRepository<Cliente, Integer>{
        
}
