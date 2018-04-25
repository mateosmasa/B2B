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




.button1 {
    background-color: white; 
    color: black; 
    border: 2px solid #4CAF50;
}

.button1:hover {
    background-color: #4CAF50;
    color: white;
}

.button2 {
    background-color: white; 
    color: black; 
    border: 2px solid #008CBA;
}

.button2:hover {
    background-color: #008CBA;
    color: white;
    border: 2px solid #008CBA;
}

.button3 {
    background-color: white; 
    color: black; 
    border: 2px solid #f44336;
}

.button3:hover {
    background-color: #f44336;
    color: white;
}

.button4 {
    background-color: white;
    color: black;
    border: 2px solid #e7e7e7;
}

.button4:hover {background-color: #e7e7e7;}

.button5 {
    background-color: white;
    color: black;
    border: 2px solid #555555;
}

.button5:hover {
    background-color: #555555;
    color: white;
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
      
      
  </style>
</head>




<body >
<%@ page import="java.util.*, activities.db.*,java.io.*" %>
	<%
String capacidad = request.getParameter("capacidad");
try{
		DBInteraction db = new DBInteraction();
		db.addBox(capacidad);
			
			
			
       }catch(Exception e){ }
%>

    <div class="h-1">
        <div class="text-center">
      <h1> Box Añadido</h1>
     </div>
    </div> 
  
 <div class="bg-1">
     
     
 

  <div class="form-group">
    
    <div >
         <a href='http://localhost:8080/B2B'><button class="button button1">Pincha aquí si quieres volver  a la pagina de inicio</button><a/>
    </div>
  </div>

  <div class="form-group">
    
    <div >
      <a href='http://localhost:8080/B2B/anadirBox.html'><button class="button button2">Pincha aqui si quieres volver a añadir otro Box</button><a/>
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
