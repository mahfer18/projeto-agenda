package agenda.model;

public class Cliente {
	private String id;
    private String nome_completo;
    private String cidade;
    private String email;
    private String profissao;
    private String telefone;
    private String observacoes;
	
    public Cliente() {
	
	}
    



	public Cliente(String id, String nome_completo, String cidade, String email, String profissao, String telefone,
			String observacoes) {
		super();
		this.id = id;
		this.nome_completo = nome_completo;
		this.cidade = cidade;
		this.email = email;
		this.profissao = profissao;
		this.telefone = telefone;
		this.observacoes = observacoes;
	}




	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
    

}
