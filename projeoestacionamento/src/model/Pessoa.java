package model;

public class Pessoa {
	
	private int id;
	private String telefone;
	private String email;
	private String nome;

	
	public void setId (int id) {
		this.id = id;
		
    }

	public int getid() {
		return id;
	}

	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setEmail (String email) {
		this.email = email;
	}


	public String getEmail() {
		return email;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

}