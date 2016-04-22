package br.gov.sp.policiamilitar.controledocumentos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.gov.sp.policiamilitar.controledocumentos.dao.AbstractDao;
import br.gov.sp.policiamilitar.controledocumentos.modelo.Usuario;

@Repository
public class UsuarioDaoImpl extends AbstractDao<Usuario> {

	public UsuarioDaoImpl() {
		super(Usuario.class, Usuario.tableName);
	}
	
	public Usuario RecuperaUsuarioPorLogin(String login)
	{
		EntityManager em = getEntityManager();
		Query query = em.createQuery("SELECT e FROM " + Usuario.tableName + " e where e.userName = '" + login + "'");
		@SuppressWarnings("unchecked")
		List<Usuario> lista = (List<Usuario>)query.getResultList();
		if(lista.size() == 1)
		{
			return lista.get(0);
		}
		else
		return null;
	}
}
