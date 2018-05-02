<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
  <title>b2b</title>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
 
      .bg-1 { 
     padding: 150px;
      }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 550px
      }
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>
</head>
<body onload="start()" >
 <div class="h-1">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <img class="img-responsive"  src="b2b.JPG" width="50">
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="menu_user_1.jsp">Home</a></li>
        <li><a href="mis_reservas.html">Mis Reservas</a></li>
        <li><a href="formulario_reservar_box.html">Reservar</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
          <div class="dropdown">
              <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Perfil
              <span class="caret"></span></button>
              <ul class="dropdown-menu">
                
                <form action="logout" method='POST'>
                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-log-in"></span> LogOut
                </form>
              </ul>
        </div>
      </ul>
    </div>
  </div>
</nav>
</div>
 <div class="bg-1">
<p>MODIFICAR RESERVA</p>
 <form class="form-horizontal" action="boxes_dis" method='POST'>
   <div class="form-group">
	     <div class="col-sm-10"> 
    <label class="control-label col-sm-2" for="horario inicio">Hora Inicio:</label>
  
    <select id="horarioInicio" name="horarioInicio" value="09:00">
	<option value="09:00" SELECTED> 09:00
	<option value="10:00" > 10:00
	<option value="11:00" > 11:00
	<option value="12:00" > 12:00
	<option value="13:00" > 13:00
	<option value="14:00" > 14:00
	<option value="15:00" > 15:00
	<option value="16:00" > 16:00
	<option value="17:00" > 17:00
	<option value="18:00" > 18:00
	<option value="19:00" > 19:00
	<option value="20:00" > 20:00
	<option value="21:00" > 21:00
	</select>
    </div>
     <div class="col-sm-10"> 
    <label class="control-label col-sm-2" for="horario fin">Hora Fin:</label>

    <select id="horarioFin" name="horarioFin" value="10:00">
	<option value="09:00" > 09:00
	<option value="10:00" SELECTED > 10:00
	<option value="11:00" > 11:00
	<option value="12:00" > 12:00
	<option value="13:00" > 13:00
	<option value="14:00" > 14:00
	<option value="15:00" > 15:00
	<option value="16:00" > 16:00
	<option value="17:00" > 17:00
	<option value="18:00" > 18:00
	<option value="19:00" > 19:00
	<option value="20:00" > 20:00
	<option value="21:00" > 21:00
</select>
    </div>
  </div>
	  <div class="form-group">
		   <div class="col-sm-10">
    <label class="control-label col-sm-2" for="Personas">Número de personas:</label>
   
      <input type="number" class="form-control-sm" id="Personas"  width="50" name="Personas" placeholder="Introduzca número de personas">
    </div>
  </div>
  <div class="form-group">
	     <div class="col-sm-10">
    <label class="control-label col-sm-2" for="Fecha">Fecha:</label>
 
      <input type="date" class="form-control-sm" id="Fecha"  name="Fecha" placeholder="Introduzca Fecha">
    </div>
  </div>
  
    <div class="form-group"> 
    <div class="col-sm-7 col-sm-7">
	<div class="fixed-bottom">
    	  <button type="submit" onmouseenter="check()"  name="modificar" value=<%=request.getParameter("id")%> class="btn btn-default pull-right">Buscar Boxes</button>
	</div>
    </div>
  </div>
 </form>
 
</div>

<footer class="container-fluid" >
    <div class="text-center">
        www.box2box.com
    </div>
    <div class="text-right">
         BoxToBox@TM
    </div>
 
</footer>		
 <script >
  function myFunction(){
  document.getElementById("Fecha").valueAsDate = new Date();

 }
 function start(){
   myFunction(); 
  }
  
  function check(){
	var fecha = new Date();
	
if(document.getElementById("Personas").value.length == 0){
	alert("No ha rellenado el campo Capacidad");
	}
var inicio = parseInt(document.getElementById("horarioInicio").value);
	var fin = parseInt(document.getElementById("horarioFin").value);

  if(inicio == fin){
	  alert("No puede elegir la misma para inicio y fin");
  }
   if(inicio > fin){
	  alert("El rango de horas no es posible, elija uno entre 9:00-21:00");
  }
  if((document.getElementById("Fecha").valueAsDate.getDay() == fecha.getDay()) && (parseInt(inicio) < parseInt(fecha.getUTCHours()) || (parseInt(fin) < parseInt(fecha.getUTCHours())))){
	  alert("No puede reservar horas pasadas"); 
	  }
  
}
 </script>	
</body>
</html>




