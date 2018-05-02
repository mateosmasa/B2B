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
     padding: 100px;
      }
      footer {
      color: white;
      background-color: #555;
      padding: 15px;
      }
      .disabled {
    color: #999;
}
      
      
  </style>
</head>
<body onload="start()">

    <div class="h-1 container-fluid">
        <div class="text-center">
      <h1> RESERVAS </h1>
     </div>
    </div> 
 <div class="container-fluid">
 <div class="col-md-2">
 </div>
 <div class="col-md-8">
	 <p>Lista de Reservas:</p>
 <div class="col-md-4">
	<table class="table table-striped">
 <tr>
    <th>numero Reserva</th>
    <th>Fecha</th>
    <th>Hora Inicio</th>
    <th>Hora Fin</th>
    <th>Número de box</th>
  </tr>
</table>
</div>
<table id="myTable" name="myTable" style="width:100%" class="table table-striped">

 
