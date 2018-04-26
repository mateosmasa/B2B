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
      
      
  </style>
</head>
<body onload="check_select()">

    <div class="h-1">
        <div class="text-center">
      <h1> Reservar Box </h1>
     </div>
    </div> 
  
 <div class="bg-1">
	 <p>Lista de Boxes Disponibles para:</p>
     <h3 id="horarioInicio"><%=request.getParameter("horarioInicio")%></h3> <h3 id="horarioFin"><%=request.getParameter("horarioFin")%></h3> <h3 id="fecha"><%=request.getParameter("fecha")%></h3>
 
<table>
 <tr>
    <th>id</th>
    <th>Piso</th>
    <th>Capacidad</th>
  </tr>
</table>

<form class="form-horizontal" method='POST' action="confirma_reserva">


 <table id="myTable" style="width:100%">
