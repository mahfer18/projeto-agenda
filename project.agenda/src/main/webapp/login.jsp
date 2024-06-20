<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Login</h1>

	<form action="login.jsp" method="post">
		Usuário<br> <input type="text" name="usuario" class="Caixa1"> <br>
		Senha<br> <input type="password" name="senha" class="Caixa1"><br><br>
		 <input type="submit" value="Login" class="Botao1">
	</form>
	<%
	String usuario = request.getParameter("usuario");
	String senha = request.getParameter("senha");

	if (usuario != null && senha != null && !usuario.isEmpty() && !senha.isEmpty()) {
	    if (usuario.equals("admin@admin") && senha.equals("103010")) {
	        HttpSession sessao = request.getSession(false);
	        if (session != null) {
	            session.invalidate();
	        }
	        session = request.getSession(true);
	        session.setAttribute("usuario", usuario);
	        response.sendRedirect("index.jsp");
	    } else {
	        out.print("USUÁRIO NÃO CADASTRADO");
	    }
	}
	%>
</body>
</html>