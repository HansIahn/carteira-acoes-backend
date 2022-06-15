package projeto.carteiraAcoes.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projeto.carteiraAcoes.modelo.CadAcoesModelo;
import projeto.carteiraAcoes.modelo.RespostaModelo;
import projeto.carteiraAcoes.repositorio.CadAcoesRepositorio;

import java.util.List;


@CrossOrigin(origins="htpp//localhost:4200")
@RestController
@RequestMapping("/api")

public class CadAcoesControle {

	@Autowired
	CadAcoesRepositorio cadAcoesRepositorio;
	
	@RequestMapping(value="/cadAcoes", method = RequestMethod.GET)
	public @ResponseBody List<CadAcoesModelo> consultar(){
		return this.cadAcoesRepositorio.findAll();
	}
	
	@RequestMapping(value="/cadAcoes/{id}", method = RequestMethod.GET)
	public @ResponseBody CadAcoesModelo buscar(@PathVariable("id") Integer id) {
		return this.cadAcoesRepositorio.findById(id);
	}
	@RequestMapping(value="/cadAcoes", method = RequestMethod.POST)
	public @ResponseBody RespostaModelo salvar(@RequestBody CadAcoesModelo cadastroAcoes) {
		try {
			this.cadAcoesRepositorio.save(cadastroAcoes);
			return new RespostaModelo("Registro salvo com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/cadAcoes", method = RequestMethod.PUT)
	public @ResponseBody RespostaModelo atualizar(@RequestBody CadAcoesModelo cadastroAcoes) {
		try {
			this.cadAcoesRepositorio.save(cadastroAcoes);
			return new RespostaModelo("Registro atualizado com sucesso");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/cadAcoes/{id}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModelo excluir(@PathVariable("id") Integer id) {
		CadAcoesModelo cadAcoesModelo = cadAcoesRepositorio.findById(id);
		try {
			this.cadAcoesRepositorio.delete(cadAcoesModelo);
			return new RespostaModelo("Registro excluído com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
}
