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
      
      
  </style>
</head>
<body >

    <div class="h-1">
        <div class="text-center">
      <h1> Box to Box </h1>
     </div>
    </div> 
  
 <div class="bg-1">
     
     
 <form class="form-horizontal" method="POST" action="formulario">
	 <div class="form-group">
    <label class="control-label col-sm-2" for="NIA">NIA:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="NIA" name="NIA" placeholder="Introduzca NIA">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="nombre">Nombre:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Introduzca nombre">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="apellidos">Apellido:</label>
    <div class="col-sm-10"> 
      <input type="text" class="form-control" id="apellidos" name="apellido" placeholder="Introduzca apellidos">
    </div>
  </div>
   <div class="form-group">
    <label class="control-label col-sm-2" for="telefono">Telefono:</label>
    <div class="col-sm-10"> 
      <input type="tel" class="form-control" id="telefono" name="telefono" placeholder="Introduzca telefono">
    </div>
  </div>
   <div class="form-group">
    <label class="control-label col-sm-2" for="email">Email:</label>
    <div class="col-sm-10"> 
      <input type="email" class="form-control" id="email" name="mail" placeholder="Introduzca email">
    </div>
  </div>
   <div class="form-group">
    <label class="control-label col-sm-2" for="pass">Password:</label>
    <div class="col-sm-10"> 
      <input type="password" class="form-control" id="pass" name="password"  placeholder="Introduzca password">
    </div>
  </div>

  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" method='POST' class="btn btn-default">Registrar</button>
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
	
</body>
</html>




