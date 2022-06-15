package projeto.carteiraAcoes.repositorio;

import java.util.List;
import org.springframework.data.repository.Repository;

import projeto.carteiraAcoes.modelo.UsuarioModelo;


public interface UsuarioRepositorio extends Repository<UsuarioModelo, Integer>{
	
	void save(UsuarioModelo usuario);
	List<UsuarioModelo> findAll();
	UsuarioModelo findById(Integer codigo);
	void delete(UsuarioModelo usuario);
}
