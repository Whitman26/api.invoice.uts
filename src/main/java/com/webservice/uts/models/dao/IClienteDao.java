package com.webservice.uts.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.webservice.uts.models.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
