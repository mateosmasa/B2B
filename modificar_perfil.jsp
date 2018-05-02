<!DOCTYPE html>

<html lang="en">
<head>
  <title>b2b</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
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
<body>

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
        <li><a href="formulario_reservar_box.jsp">Reservar</a></li>
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
 
 <div class="bg-1">
     
 <div class="container-fluid text-center">    
  <div class="row content">
  <div class="col-sm-8 text-left">  
   <h2>MODIFICAR PERFIL</h2>    
 <form class="form-horizontal" method="POST" onsubmit="return confirm('¿Seguro que quiere modificar su perfil?');" action="modificar_perfil">
	 <div class="form-group">
    <label class="control-label col-sm-2" for="NIA">NIA:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="NIA" name="NIA" value='<%=request.getParameter("NIA")%>'>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="nombre">Nombre:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="nombre" name="nombre" value='<%=request.getParameter("nombre")%>'>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="apellidos">Apellido:</label>
    <div class="col-sm-10"> 
      <input type="text" class="form-control" id="apellidos" name="apellido" value='<%=request.getParameter("apellido")%>'>
    </div>
  </div>
   <div class="form-group">
    <label class="control-label col-sm-2" for="telefono">Telefono:</label>
    <div class="col-sm-10"> 
      <input type="tel" class="form-control" id="telefono" name="telefono" value='<%=request.getParameter("telefono")%>' >
    </div>
  </div>
   <div class="form-group">
    <label class="control-label col-sm-2" for="email">Email:</label>
    <div class="col-sm-10"> 
      <input type="email" class="form-control" id="email" name="mail"  value='<%=request.getParameter("mail")%>'>
    </div>
  </div>
   <div class="form-group">
    <label class="control-label col-sm-2" for="pass">Password:</label>
    <div class="col-sm-10"> 
      <input type="password" class="form-control" id="pass" name="password"  value='<%=request.getParameter("password")%>'>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="pass">Repetir Password:</label>
    <div class="col-sm-10"> 
      <input type="password" class="form-control" id="pass2" name="password"  value='<%=request.getParameter("password")%>'>
    </div>
  </div>


  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" onmouseenter="checkPassword()" onclick="confirm_edit()" id="boton_confirm" method='POST' name="boton_confirm" class="btn btn-default">Modificar</button>
    </div>
  </div>
</form>
  
</div>
</div>
 

<footer class="container-fluid text-center">
  <div class="text-center">
        www.box2box.com
    </div>
    <div class="text-right">
         BoxToBox@TM
    </div>
</footer>
<script>
  function checkPassword(){
	  
	  if(document.getElementById("pass").value != document.getElementById("pass2").value){
		  alert("Las contraseñas no coinciden");
	  }
	  
  }
  
 function confirm_edit(){
	 document.getElementById("boton_confirm").value = "modificado" ;
 } 
	  

</script>
</body>
</html>
