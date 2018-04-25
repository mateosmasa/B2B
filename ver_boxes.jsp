<!DOCTYPE html>

<html>
<head>
  <title>b2b</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

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
      <h1> Boxes registrados </h1>
    </div>
  </div> 
  
  <div class="bg-1">


   <form class="form-horizontal" action="/action_page.php">
     <table style="width:100%">

      <tr>
        <th>ID</th>
        <th>Piso</th> 
        <th>Capacidad</th>
        <th>Eliminar box <span class="glyphicon glyphicon-trash"></span></th>
      </tr>

      <c:forEach var="box" items="${boxes}">
      <div class="radio">
        <tr>
         <td>${box.id}</td>
         <td>${box.piso}</td> 
         <td>${box.capacidad}</td>
         <td>
           <div class="checkbox">
            <label style="font-size: 1.5em">
              <input type="checkbox" value="">
              <span class="cr"><i class="cr-icon glyphicon glyphicon-ok"></i></span>
            </label>
          </div>
        </td>

       </tr>
     </div>
   </c:forEach>

 </table>
 </form>


 <div class="form-group" method="POST" action="borrar_box"> 
  <div class="col-sm col-sm-10">
   <div class="fixed-bottom">
     <button type="submit" class="btn btn-default pull-right">Eliminar box</button>
   </div>
 </div>
</div>

<div class="form-group" action="/formulario_nuevo_box.jsp"> 
  <div class="col-sm col-sm-10">
   <div class="fixed-bottom">
     <button type="submit" class="btn btn-default pull-left">Añadir box</button>
   </div>
 </div>
</div>


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



