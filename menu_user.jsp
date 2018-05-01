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
        <li class="active"><a href="#">Home</a></li>
        <li><a href="mis_reservas.html">Mis Reservas</a></li>
        <li><a href="formulario_reservar_box.jsp">Reservar</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
          <div class="dropdown">
              <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Perfil
              <span class="caret"></span></button>
              <ul class="dropdown-menu">
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> LogOut</a></li>
              </ul>
        </div>
      </ul>
    </div>
  </div>
</nav>


<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
		<img src="puerta-1.jpg" width="150" height="150">
      <p>Campus Puerta de Toledo</p>
      <p>Ronda de Toledo,1</p>
      <p>28005 MADRID</p>
      	<img src="UC3M.jpg" width="150" height="150">
    </div>
    <div class="col-sm-8 text-left"> 
     
      <h1>Bienvenido a BoxtoBox</h1>
        <p>Desde aquí podrá gestionar las reservas para el campus de Puerta de Toledo</p>
      <hr>
    
<div class="w3-content w3-section" style="max-width:500px">
  <img class="mySlides" src="box-1.jpg" width="600" height="400">
  <img class="mySlides" src="box-2.jpg" width="600" height="400">
  <img class="mySlides" src="box-3.jpg" width="600" height="400">
  <img class="mySlides" src="box-4.jpg" width="600" height="400">
</div>
    <h3>Boxes</h3>
      <p>Añada o elimine un box. Tambíén puede editar la información referente a un box.</p>
    <h3>Usuarios</h3>
      <p>Visualice todos los usuarios registrados y elimine los que sean judios.</p>
    <h3>Reservas</h3>
      <p>Visualice las reservas realizadas por los usuarios, así como las incidencias que se hayan producido.</p>
    </div>
    <div class="col-sm-2 sidenav">
      <div class="well">
        <div id="map" style="width:250px;height:250px;background:yellow"></div>
      </div>
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
<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 3000);
}

function myMap() {
var mapOptions = {
    center: new google.maps.LatLng(40.4067654, -3.7116203),
    zoom: 18,
    mapTypeId: google.maps.MapTypeId.ROADMAP
}
var map = new google.maps.Map(document.getElementById("map"), mapOptions);
}
</script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBzKLcrXWzAliYxQzi6risIrjXvAALa4jY&callback=myMap"></script>
</body>
</html>
