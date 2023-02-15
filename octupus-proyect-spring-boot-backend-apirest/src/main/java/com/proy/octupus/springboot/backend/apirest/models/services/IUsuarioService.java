package com.proy.octupus.springboot.backend.apirest.models.services;

import com.proy.octupus.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
