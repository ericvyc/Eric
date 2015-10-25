package curso.javaee.primefaces.inversaonome;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class InversaoNomeBean implements Serializable {

	private static final long serialVersionUID = -7603144849897603733L;

	private String nome;

	private String nomeInvertido;

	private int quantidadePalavras;

	public void inverter() {
		setNomeInvertido("");
		setQuantidadePalavras(0);

		if(getNome() != null && !getNome().isEmpty()){
			setQuantidadePalavras(1);
		}
		for(int i = getNome().length() -1; i >= 0; i--){
			char letra = getNome().charAt(i);
			this.nomeInvertido += letra;

			if(letra == ' '){
				setQuantidadePalavras(getQuantidadePalavras()+1);
			}
		}
		System.out.println("Nome invertido: "+ getNomeInvertido());
		System.out.println("Quantidade de palavras: " + getQuantidadePalavras());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeInvertido() {
		return nomeInvertido;
	}

	public void setNomeInvertido(String nomeInvertido) {
		this.nomeInvertido = nomeInvertido;
	}

	public int getQuantidadePalavras() {
		return quantidadePalavras;
	}

	public void setQuantidadePalavras(int quantidadePalavras) {
		this.quantidadePalavras = quantidadePalavras;
	}

}
