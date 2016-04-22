package br.gov.sp.policiamilitar.controledocumentos.services;

import java.util.List;

import br.gov.sp.policiamilitar.controledocumentos.modelo.Usuario;

public interface UsuarioService {
	public void save(Usuario usuario);
	public void update(Usuario usuario);
	public void delete(int userId);
	public Usuario getUsuario(int userId);
	public List<Usuario> getAllUsuario();
	boolean verificaUsuario(Usuario user);
	public Usuario recuperaUsuarioPorLogin(String login);
}
