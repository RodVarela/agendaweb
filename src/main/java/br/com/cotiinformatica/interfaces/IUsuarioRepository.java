package br.com.cotiinformatica.interfaces;

import br.com.cotiinformatica.entities.Usuario;

public interface IUsuarioRepository {

	//M?todo para gravar um usu?rio na base de dados
	void create(Usuario usuario) throws Exception;
	
	//M?todo para consultar no bando de daos 1 usu?rio
	Usuario find(String email) throws Exception;
	
	//M?todo para consultar no bando de dados 1 usu?rio
	Usuario find(String email, String senha) throws Exception;
	
	
	
}


