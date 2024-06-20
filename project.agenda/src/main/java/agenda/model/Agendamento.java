package agenda.model;

import java.sql.Time;
import java.util.Date;

public class Agendamento {
    private int id;
    private int idCliente;
    private String servico;
    private Date data;
    private Time hora;
    
    
    
	public Agendamento() {
		super();
	}
	public Agendamento(int id, int idCliente, String servico, Date data, Time hora) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.servico = servico;
		this.data = data;
		this.hora = hora;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}

}

