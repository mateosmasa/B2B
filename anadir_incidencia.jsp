
<!DOCTYPE html>

<html>
<head>
  <title>b2b</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
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
<body>
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
        <li><a href="menu_user_1.jsp">Home</a></li>
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
</div>
 <div class="bg-1">
<p>AÑADIR INCIDENCIA</p>
 <form class="form-horizontal" onsubmit="return confirm('¿Quiere añadir la incidencia?');" action="anadir_incidencia" method='POST'>
 
	  <div class="form-group">
		   <div class="col-sm-10">
    <label class="control-label col-sm-2" for="Título">Título:</label>
     <textarea name="titulo" id="titulo" rows="5" cols="40" placeholder="Indique la causa de la incidencia"></textarea>
    </div>
  </div>
  <div class="form-group">
	     <div class="col-sm-10">
    <label class="control-label col-sm-2" for="Descripción">Descripción:</label>
     <textarea name="descripcion"  id="descripcion" rows="5" cols="40" placeholder="Añada una descripción para la incidencia"></textarea>
    </div>
  </div>
  
    <div class="form-group"> 
    <div class="col-sm-7 col-sm-7">
	<div class="fixed-bottom">
    	  <button type="submit" onmouseenter="check()" name="incidencia1" value=<%=request.getParameter("numres")%> </class="btn btn-default pull-right">Añadir Incidencia</button>
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
  
function check(){
if(document.getElementById("descripcion").value.length == 0 || document.getElementById("titulo").value.length == 0){
	alert("No ha rellenado los campos correspondientes para la incidencia");
	
	}
	
}

 </script>	
</body>
</html>




