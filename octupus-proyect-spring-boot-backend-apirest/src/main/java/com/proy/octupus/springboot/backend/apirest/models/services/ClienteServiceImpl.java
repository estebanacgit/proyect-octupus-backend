package com.proy.octupus.springboot.backend.apirest.models.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proy.octupus.springboot.backend.apirest.models.dao.IClienteDao;
import com.proy.octupus.springboot.backend.apirest.models.dao.IFacturaDao;
import com.proy.octupus.springboot.backend.apirest.models.dao.IProductoDao;
import com.proy.octupus.springboot.backend.apirest.models.dao.IUsuarioDao;
import com.proy.octupus.springboot.backend.apirest.models.entity.Cliente;
import com.proy.octupus.springboot.backend.apirest.models.entity.Factura;
import com.proy.octupus.springboot.backend.apirest.models.entity.Producto;
import com.proy.octupus.springboot.backend.apirest.models.entity.Region;
import com.proy.octupus.springboot.backend.apirest.models.entity.Role;
import com.proy.octupus.springboot.backend.apirest.models.entity.Usuario;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	@Autowired
	private IFacturaDao facturaDao;
	
	@Autowired
	private IProductoDao productoDao;
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	//CRUD CLIENTES

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Cliente> findAll(Pageable pageable) {
		return clienteDao.findAll(pageable);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Region> findAllRegiones() {
		return clienteDao.findAllRegiones();
	}
	
	//CRUD FACTURAS

	@Override
	@Transactional(readOnly = true)
	public Factura findFacturaById(Long id) {
		return facturaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Factura saveFactura(Factura factura) {
		return facturaDao.save(factura);
	}

	@Override
	@Transactional
	public void deleteFacturaById(Long id) {
		facturaDao.deleteById(id);
	}
	
	//CRUD PRODUCTOS

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findProductoByNombre(String term) {
		return productoDao.findByNombre(term);
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findProductoById(Long id) {
		return productoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Producto saveProducto(Producto producto) {
		return productoDao.save(producto);
	}

	@Override
	@Transactional
	public void deleteProductoById(Long id) {
		productoDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAllProductos() {
		return (List<Producto>) productoDao.findAll();
	}

	
	//CRUD USUARIOS
	
	@Override
	@Transactional(readOnly = true)
	public Usuario findUsuarioById(Long id) {
		return usuarioDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAllusuarios() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	@Transactional
	public void deleteUsuarioById(Long id) {
		usuarioDao.deleteById(id);
	}

	@Override
	@Transactional
	public Usuario saveUsaurio(Usuario usuario) {
		usuario.setRoles(Arrays.asList(new Role(1L)));
		return usuarioDao.save(usuario);
	}
	
}
