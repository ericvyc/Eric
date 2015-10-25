package curso.javaee.primefaces.cadastroaluno;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CadastroAlunoBean implements Serializable{

	private static final long serialVersionUID = -4337546447689221263L;

	private String nome;
	
	private String email;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void cadastrar(){
		System.out.println("Nome : " + getNome());
		System.out.println("Email : "+ getEmail());
	}
	
}
