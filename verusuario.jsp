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
      <h1> Usuarios registrados </h1>
    </div>
  </div> 
  
  <div class="bg-1">


   <form class="form-horizontal" action="/action_page.php">
     <table style="width:100%">

      <tr>
        <th>NIA</th>
        <th>Nombre</th> 
        <th>Apellido</th> 
        <th>E-mail</th>
        <th>Telefono</th>
        <th> <span ></span></span></th>
      </tr>

      <c:forEach var="user" items="${usuarios}">
      <div class="radio">
        <tr>
         <td>NIA</td>
         <td>nombre</td> 
         <td>apellido}</td> 
         <td>mail</td> 
         <td>telefono</td> 
         <td>
           <div >
            <label>
             
              <span ></i></span>
            </label>
          </div>
        </td>

       </tr>
     </div>
   

 </table>
 </form>


 <div > 
  <div >
   <div>
     
   </div>
 </div>
</div>

 <div > 
   <div >
     
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
