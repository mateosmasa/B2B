
</table>
  
  <div class="form-group"> 
    <div class="col-sm col-sm-10">
	<div class="fixed-bottom">
    	  <button type="submit" id="boton_reservar" name="boton_reservar" value=<%=request.getParameter("numres")%> onclick="check_book()"  onmouseenter="check_box()"  class="btn btn-default pull-right">Reservar</button>
	</div>
    </div>
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
<script>
    function check_select(){
    var list = document.getElementsByName("optradio");
    var fechahorario = document.getElementById("horarioInicio").innerHTML+"-"+document.getElementById("horarioFin").innerHTML+"-"+document.getElementById("fecha").innerHTML+"-";
    console.log(list.length);
	for (var i = 0 ; i < list.length; i++) {
	list[i].value = fechahorario+document.getElementById("myTable").rows[i].cells[1].innerHTML;
	
		
	
	}
}

function check_box(){
	var radio =document.getElementsByName("optradio");
	
	for(var i=0; i<radio.length; i++){	
     if(radio[i].type == 'radio' && radio[i].checked){
		 
		 return true; 
	 }
    }
    alert("No ha seleccionado ningún box");
    return false;
}

function check_book(){
	
	var numres = document.getElementById("boton_reservar").value;
     if(numres == "null"){
		alert("Reserva confirmada");
	 }else {
	   alert("Reserva modificada");
	}
	 
 }

  </script>
	
</body>
</html>
