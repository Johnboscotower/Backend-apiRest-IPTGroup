package com.iptgroup.springboot.backend.apirest.models.services;

import java.util.List;

import com.iptgroup.springboot.backend.apirest.models.entity.Cliente;
import com.iptgroup.springboot.backend.apirest.models.entity.Factura;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public Factura findFacturaById(Long id);
	
	public Factura saveFactura(Factura factura);
	
	public void deleteFacturaById(Long id);

}
