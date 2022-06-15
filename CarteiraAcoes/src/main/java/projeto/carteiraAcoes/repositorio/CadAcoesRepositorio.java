package projeto.carteiraAcoes.repositorio;

import java.util.List;
import org.springframework.data.repository.Repository;

import projeto.carteiraAcoes.modelo.CadAcoesModelo;


public interface CadAcoesRepositorio extends Repository<CadAcoesModelo, Integer>{
	
	void save(CadAcoesModelo cadastroAcoes);
	List<CadAcoesModelo> findAll();
	CadAcoesModelo findById(Integer codigo);
	void delete(CadAcoesModelo cadastroAcoes);
}