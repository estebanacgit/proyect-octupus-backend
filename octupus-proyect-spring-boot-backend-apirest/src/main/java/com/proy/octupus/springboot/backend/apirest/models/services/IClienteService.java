package com.proy.octupus.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.proy.octupus.springboot.backend.apirest.models.entity.Cliente;
import com.proy.octupus.springboot.backend.apirest.models.entity.Factura;
import com.proy.octupus.springboot.backend.apirest.models.entity.Producto;
import com.proy.octupus.springboot.backend.apirest.models.entity.Region;
import com.proy.octupus.springboot.backend.apirest.models.entity.Role;
import com.proy.octupus.springboot.backend.apirest.models.entity.Usuario;

public interface IClienteService {
	
	//CONTRATO CLIENTES

	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public List<Region> findAllRegiones();
	
	//CONTRATO FACTURAS
	
	public Factura findFacturaById(Long id);
	
	public Factura saveFactura(Factura factura);
	
	public void deleteFacturaById(Long id);
	
	//CONTRATO PRODUCTOS
	
	public List<Producto> findProductoByNombre(String term);
	
	public Producto findProductoById(Long id);
	
	public Producto saveProducto (Producto producto);
	
	public void deleteProductoById(Long id);
	
	public List<Producto> findAllProductos();
	
	//CONTRATO USUARIOS
	
	public List<Usuario> findAllusuarios();
	
	public void deleteUsuarioById(Long id);
	
	public Usuario saveUsaurio(Usuario usuario);
	
	public Usuario findUsuarioById(Long id);
}
