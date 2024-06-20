package agenda.controller;

import java.io.IOException;
import java.util.ArrayList;
//import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agenda.dao.DAO;
import agenda.model.Cliente;


@WebServlet(urlPatterns = { "/Controller", "/main", "/novo", "/listar","/insert" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO(); 
	Cliente cliente = new Cliente();

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);

		if (action.equals("/main")) {
			clientes(request, response);
		} else if (action.equals("/novo")) {
			cadastrarClientes(request, response);
		} else if (action.equals("/listar")) {
			listarClientes(request, response);
		} else if (action.equals("/insert")) {
			novoCliente(request, response);
		} else {
			response.sendRedirect("deslogar.jsp");
		}

	}

	// Agenda clientes
	protected void clientes(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("agenda.jsp");
	}

	// Cadastrar novo cliente
	protected void cadastrarClientes(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("novo.html");
	}
	
	// Após adicionar cliente Novo cliente
	protected void novoCliente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Setar as variáveis JavaBeans de Cliente para armazenar
		cliente.setNome_completo(request.getParameter("nome"));
		cliente.setCidade(request.getParameter("cidade"));
		cliente.setEmail(request.getParameter("email"));
		cliente.setProfissao(request.getParameter("profissao"));
		cliente.setTelefone(request.getParameter("telefone"));
		cliente.setObservacoes(request.getParameter("observacoes"));
		//Invocar o método inserirCliente passando o objeto cliente
		dao.inserirCliente(cliente);
		//redirecionar
		response.sendRedirect("listar.jsp");
	}

	// Listar clientes
	protected void listarClientes(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Criando objeto que irá receber os dados da classe javabeans Cliente
		ArrayList<Cliente> lista = dao.listarClientes();
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getId());
			System.out.println(lista.get(i).getNome_completo());
			System.out.println(lista.get(i).getCidade());
			System.out.println(lista.get(i).getEmail());
			System.out.println(lista.get(i).getProfissao());
			System.out.println(lista.get(i).getTelefone());
			System.out.println(lista.get(i).getObservacoes());
			
			
		}
	}
}