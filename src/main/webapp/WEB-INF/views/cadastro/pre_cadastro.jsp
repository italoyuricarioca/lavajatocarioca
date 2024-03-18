<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/estilo.css" />"
	rel="stylesheet">
<title>Informa��es do cliente</title>
</head>
<body>
<!-- Menu -->    
<div >
  <div class="navbar navbar-default navbar-fixed-top">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">Lava Jato Carioca</a>
      </div>
      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav">
          <li><a href="/lavajatocarioca/">Home</a></li>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Cadastro <b class="caret"></b></a>
            <ul class="dropdown-menu">
              <li><a href="/lavajatocarioca/novo-cliente">Cliente</a></li>
              <li><a href="/lavajatocarioca/novo-veiculo">Veiculo</a></li>
              <li><a href="/lavajatocarioca/novo-servico">Servi�o</a></li>
            </ul>
          </li>
          
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Relat�rio<b class="caret"></b></a>
            <ul class="dropdown-menu">
              <li><a href="/lavajatocarioca/lista-servicos">Servi�os</a></li>
              <li class="divider"></li>
              <li><a href="/lavajatocarioca/lista-clientes">Clientes</a></li>
              <li><a href="/lavajatocarioca/lista-veiculos">Ve�culos</a></li>
            </ul>
          </li>
          <li class="navbar-right pull-right"><a href="#"><span class="glyphicon glyphicon-log-in"></span> Sair</a></li>
        <li class="navbar-right"><a href="#"><span class="glyphicons glyphicons-car navbar-r"></span> Admin</a></li>
        </ul>
      </div>
    </div>
  </div>
</div> <!-- Fim do menu -->

<div class="center-block container">
	<div class="panel panel-default">
      <div class="panel-heading">
   			 <h3 class="panel-title">Informa��es do cliente</h3>
  	  </div>
     <div class="panel-body">
     <form class="form-horizontal center-m" action="pre-busca" method="post">	
            <div id="mensagem" class="alert alert-info">
                Informe o telefone do cliente.
            </div>
                <p>${erro}<p>
        <div class="form-group">
            <label class="col-sm-2 control-label">Telefone</label>
            <div class="col-sm-10 col-md-5">
                <input type="text" class="form-control" required id="telefone" name="telefone">
            </div>
            <div class="col-sm-offset-2">
                <label class="checkbox-inline"><input type="radio" id="celular"  value="celular" name="numero" onclick=muda(value="celular") checked>Celular</label>
                <label class="checkbox-inline"><input type="radio" id="fixo"  value="fixo" name="numero" onclick=muda(value="fixo")>Fixo</label>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary">Pr�ximo</button>
            </div>
        </div>
        </div>
    </form>
</div> <!-- Fim do painel -->
</div> 
<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/function.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.maskedinput.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
</body>
</html>