package curso.javaee.primefaces.inversaonome;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class InversaoNomeBean implements Serializable {

	private static final long serialVersionUID = -7603144849897603733L;
	
	private String nome;
	
	private String nomeInertido;
	
	private int quantidadePalavras;
	
	public void inverter(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeInertido() {
		return nomeInertido;
	}

	public void setNomeInertido(String nomeInertido) {
		this.nomeInertido = nomeInertido;
	}

	public int getQuantidadePalavras() {
		return quantidadePalavras;
	}

	public void setQuantidadePalavras(int quantidadePalavras) {
		this.quantidadePalavras = quantidadePalavras;
	}

}
