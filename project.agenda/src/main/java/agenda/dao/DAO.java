package agenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import agenda.model.Cliente;

public class DAO {
	// Parametros de conexao

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbsis_agendamento?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "dba123456@";
	// Metodo de conexao

	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/** CRUD CREATE **/
	public void inserirCliente(Cliente cliente) {
		String create = "INSERT INTO clientes (id, nome_completo, cidade, email, profissao, telefone, observacoes) values (?,?,?,?,?,?,?)";
		try {
			Connection con = conectar();
			// Preparar a query para execução no banco de dados
			PreparedStatement pst = con.prepareStatement(create);
			// substituir os parametros ? pelo conteudo das variaveis
			pst.setString(1, cliente.getId());
			pst.setString(2, cliente.getNome_completo());
			pst.setString(3, cliente.getCidade());
			pst.setString(4, cliente.getEmail());
			pst.setString(5, cliente.getProfissao());
			pst.setString(6, cliente.getTelefone());
			pst.setString(7, cliente.getObservacoes());
			// Executar a query
			pst.executeUpdate();
			// encerrar a conexão com o banco
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
				
	}
	
	/*CRUD READ*/
	public ArrayList<Cliente> listarClientes(){
		//Criar objeto para acessar classe JavaBeans Cliente
		ArrayList<Cliente> cliente = new ArrayList<>();
		String read = "SELECT * FROM clientes ORDER BY nome_completo";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			//laço abaixo sera executado enquanto tiver contatos
			while(rs.next()) {
				// variaveis de apoio que recebem dados do banco
				
				String id = rs.getString(1);
				String nome_completo =  rs.getString(2);
			    String cidade = rs.getString(3);
			    String email =  rs.getString(4);
				String profissao = rs.getString(5);
				String telefone = rs.getString(6);
				String observacoes = rs.getString(7);
				//populando  o arraylist
				
				cliente.add(new Cliente(id,nome_completo,cidade,email,profissao,telefone,observacoes));
			}
			con.close();
			return cliente;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
