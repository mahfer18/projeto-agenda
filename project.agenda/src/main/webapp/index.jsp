<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" href="imagens/fone.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%
		String usuario = (String) session.getAttribute("usuario");
	if(usuario == null){
		response.sendRedirect("login.jsp");
	} else{
		out.print("Bem vindo, " +usuario+" <br/>");
	}
	%>

	<img src="imagens/agenda.png">
	<h1>Agenda de Contatos</h1>
	<a href="listar" class="Botao1">Acessar Clientes</a>
	<a href="main" class="Botao1">Acessar Agenda</a>
	<br><br>
	
	<a href="deslogar.jsp" class="Botao2">Sair</a>

</body>
</html>