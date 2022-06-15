package projeto.carteiraAcoes.repositorio;

import java.util.List;
import org.springframework.data.repository.Repository;

import projeto.carteiraAcoes.modelo.MovimentAcaoModelo;


public interface MovimentAcaoRepositorio extends Repository<MovimentAcaoModelo, Integer>{
	
	void save(MovimentAcaoModelo movimentacoes);
	List<MovimentAcaoModelo> findAll();
	MovimentAcaoModelo findById(Integer codigo);
	void delete(MovimentAcaoModelo movimentacoes);
}
