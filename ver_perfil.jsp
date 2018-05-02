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


<div class="container-fluid text-center">    
  <div class="row content">
  <div class="col-sm-4 text-left">  
   <h1>PERFIL USUARIO</h1>
   <table class="table table-striped">
 <tr>
    <th>NIA</th>
</tr>
 <tr>
 <th><%=request.getParameter("NIA")%></th>
 </tr>
 <tr>
    <th>NOMBRE</th>
</tr>
 <tr>
 <th><%=request.getParameter("nombre")%></th>
 </tr>
 <tr>
    <th>APELLIDO</th>
</tr>
 <tr>
 <th><%=request.getParameter("apellido")%></th>
 </tr>
 <tr>
    <th>MAIL</th>
</tr>
 <tr>
 <th><%=request.getParameter("mail")%></th>
 </tr>
 <tr>
    <th>TELÉFONO</th>
</tr>
 <tr>
 <th><%=request.getParameter("telefono")%></th>
 </tr>
</table>
    </div>
    </div>
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
</body>
</html>
