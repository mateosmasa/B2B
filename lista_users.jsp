<!DOCTYPE html>

<html>
<head>
  <title>b2b</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  		.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 16px 150px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 14px 21px;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    cursor: pointer;
}


 .h-1 {
        background-color:  #555;
        color: white;
        padding: 20px;
      }
 .bg-1 { 
     padding: 150px;
      }
      footer {
      color: white;
      background-color: #555;
      padding: 15px;
      }
      
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
      .gaspar {
          margin:10px;
      } 
  </style>
</head>
<body >

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
        <li><a href="menu_admin.jsp">Home</a></li>
        <li><a href="adminBOX.html">Boxes</a></li>
        <li class="active"><a href="adminUsu.html">Usuarios</a></li>
        <li><a href="adminReservas.html">Reservas</a></li>
        <li><a href="#"></a></li>
      </ul>
      <ul class="gaspar nav navbar-nav navbar-right">
          <div class="dropdown">
              <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Perfil
              <span class="caret"></span></button>
              <ul class="dropdown-menu">
                <li><a href="#"><span class="glyphicon glyphicon-user"></span> Ver perfil</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-pencil"></span> Editar perfil</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> LogOut</a></li>
              </ul>
        </div>
      </ul>
    </div>
  </div>
</nav>
    
    <div class="container-fluid"</div> 
    <h2>Usuarios</h2>
    <div class="col-md-2">
</div>
<div class="col-md-8">


 <table class="table table-striped">

  <tr>
    <th>NIA</th>
    <th>Nombre</th>
    <th>Apellido</th>
    <th>Telefono</th>
    <th>E-mail</th>
  </tr>
