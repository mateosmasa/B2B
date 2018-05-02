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
      <h1> Registrar nuevo Box </h1>
     </div>
    </div> 
  
 <div class="bg-1">
     
     
 <form class="form-horizontal" action="/action_page.php">

  <div class="form-group">
    <label class="control-label col-sm-2" for="piso">Piso:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="piso" placeholder="Introduzca el piso del box">
    </div>
  </div>

  <div class="form-group">
    <label class="control-label col-sm-2" for="capacidad">Capacidad del box:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="capacidad" placeholder="Introduzca capacidad del box">
    </div>
  </div>

  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Registrar Box</button>
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




