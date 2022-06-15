package projeto.carteiraAcoes.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projeto.carteiraAcoes.modelo.RespostaModelo;
import projeto.carteiraAcoes.modelo.UsuarioModelo;
import projeto.carteiraAcoes.repositorio.UsuarioRepositorio;

import java.util.List;


@CrossOrigin(origins="htpp//localhost:4200")
@RestController
@RequestMapping("/api")

public class UsuarioControle {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@RequestMapping(value="/usuario", method = RequestMethod.GET)
	public @ResponseBody List<UsuarioModelo> consultar(){
		return this.usuarioRepositorio.findAll();
	}
	
	@RequestMapping(value="/usuario/{codigo}", method = RequestMethod.GET)
	public @ResponseBody UsuarioModelo buscar(@PathVariable("codigo") Integer Id) {
		return this.usuarioRepositorio.findById(Id);
	}
	@RequestMapping(value="/usuario", method = RequestMethod.POST)
	public @ResponseBody RespostaModelo salvar(@RequestBody UsuarioModelo cadastroAcoes) {
		try {
			this.usuarioRepositorio.save(cadastroAcoes);
			return new RespostaModelo("Registro salvo com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/usuario", method = RequestMethod.PUT)	
	public @ResponseBody RespostaModelo atualizar(@RequestBody UsuarioModelo cadastroAcoes) {
		try {
			this.usuarioRepositorio.save(cadastroAcoes);
			return new RespostaModelo("Registro atualizado com sucesso");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	@RequestMapping(value="/usuario/{codigo}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModelo excluir(@PathVariable("codigo") Integer codigo) {
		UsuarioModelo usuarioModelo = usuarioRepositorio.findById(codigo);
		try {
			this.usuarioRepositorio.delete(usuarioModelo);
			return new RespostaModelo("Registro excluído com sucesso!");
		}catch(Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
}
