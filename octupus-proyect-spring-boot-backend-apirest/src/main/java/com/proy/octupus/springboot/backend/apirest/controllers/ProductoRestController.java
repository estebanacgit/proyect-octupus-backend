package com.proy.octupus.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proy.octupus.springboot.backend.apirest.models.entity.Producto;
import com.proy.octupus.springboot.backend.apirest.models.services.IClienteService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProductoRestController {
	
	/*
	 * Aca vamos a crear el controller para:
	 * 
	 * Crear - Listo
	 * Listar - Listo
	 * Modificar - 
	 * eliminar - Listo
	 *  
	 *  los productos.
	 */
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/productos")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Producto> showProductos() {
		return clienteService.findAllProductos();
	}
	
	@PostMapping("/productos")
	@ResponseStatus(code = HttpStatus.OK)
	public Producto crear(@RequestBody Producto producto) {
		return clienteService.saveProducto(producto);
	}
	
	@DeleteMapping("/productos/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteProducto(@PathVariable Long id) {
		clienteService.deleteProductoById(id);
	}
	
	@PutMapping("/productos/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Producto update(@RequestBody Producto producto, @PathVariable Long id) {
		Producto productoActual = clienteService.findProductoById(id);
		
		Producto productoUpdate = null;
		
		productoActual.setNombre(producto.getNombre());
		productoActual.setPrecio(producto.getPrecio());
		
		productoUpdate = clienteService.saveProducto(productoActual);
		
		return productoUpdate;
	}
	
	@GetMapping("/productos/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Producto encontrarProductoPorId(@PathVariable Long id) {
		return clienteService.findProductoById(id);
	}
	

}
