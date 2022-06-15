package projeto.carteiraAcoes.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projeto.carteiraAcoes.modelo.MovimentAcaoModelo;
import projeto.carteiraAcoes.modelo.RespostaModelo;
import projeto.carteiraAcoes.repositorio.MovimentAcaoRepositorio;

import java.util.List;


@CrossOrigin(origins="htpp//localhost:4200")
@RestController
@RequestMapping("/api")

public class MovimentAcaoControle {

	@Autowired
	private MovimentAcaoRepositorio movimentAcaoRepositorio;
	
	@RequestMapping(value="/movimentAcao", method = RequestMethod.GET)
	public @ResponseBody List<MovimentAcaoModelo> consultar(){
		return this.movimentAcaoRepositorio.findAll();
	}
	
	@RequestMapping(value="/movimentAcao/{codigo}", method = RequestMethod.GET)
	public @ResponseBody MovimentAcaoModelo buscar(@PathVariable("codigo") Integer Id) {
		return this.movimentAcaoRepositorio.findById(Id);
	}
	@RequestMapping(value="/movimentAcao", method = RequestMethod.POST)
	public @ResponseBody RespostaModelo salvar(@RequestBody MovimentAcaoModelo cadastroAcoes) {
		try {
			this.movimentAcaoRepositorio.save(cadastroAcoes);
			return new RespostaModelo("Registro salvo com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/movimentAcao", method = RequestMethod.PUT)
	public @ResponseBody RespostaModelo atualizar(@RequestBody MovimentAcaoModelo cadastroAcoes) {
		try {
			this.movimentAcaoRepositorio.save(cadastroAcoes);
			return new RespostaModelo("Registro atualizado com sucesso");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/movimentAcao/{codigo}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModelo excluir(@PathVariable("codigo") Integer codigo) {
		MovimentAcaoModelo movimentAcaoModelo = movimentAcaoRepositorio.findById(codigo);
		try {
			this.movimentAcaoRepositorio.delete(movimentAcaoModelo);
			return new RespostaModelo("Registro excluído com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
}