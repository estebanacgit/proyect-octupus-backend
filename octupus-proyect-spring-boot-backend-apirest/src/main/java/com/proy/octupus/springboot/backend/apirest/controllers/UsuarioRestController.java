package com.proy.octupus.springboot.backend.apirest.controllers;

import java.util.ArrayList;
import java.util.Arrays;
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

import com.proy.octupus.springboot.backend.apirest.models.entity.Role;
import com.proy.octupus.springboot.backend.apirest.models.entity.Usuario;
import com.proy.octupus.springboot.backend.apirest.models.services.IClienteService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	/*
	 * Funcion usuarios:
	 * Crear
	 * Editar
	 * Eliminar
	 * Mostrar todos * 
	 * Mostar por id *
	 * 
	 */
	
	@GetMapping("/usuarios")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Usuario> showUsuarios() {
		return clienteService.findAllusuarios();
	}
	
	@GetMapping("/usuarios/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Usuario findUsuario(@PathVariable Long id) {
		return clienteService.findUsuarioById(id);
	}
	
	@PostMapping("/usuarios")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Usuario crearUsuario(@RequestBody Usuario usuario) {	
		
		usuario.setEnabled(true);
		
		return clienteService.saveUsaurio(usuario);
		//se genera usuario pero no el rol
	}
	
	@PutMapping("/usuarios/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Usuario editarUsuario(@RequestBody Usuario usuario, @PathVariable Long id) {
		
		Usuario usuarioActual = clienteService.findUsuarioById(id);
		Usuario usuarioUpdate = null;
		
		usuarioActual.setNombre(usuario.getNombre());
		usuarioActual.setApellido(usuario.getApellido());
		usuarioActual.setPassword(usuario.getPassword());
		
		//verificar que las contraseñas al cambiarlas
		
		usuarioUpdate = clienteService.saveUsaurio(usuarioActual);
		
		return usuarioUpdate;
		
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void deleteUsuario(@PathVariable Long id) {
		clienteService.deleteUsuarioById(id);
	}
	
}
