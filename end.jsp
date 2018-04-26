
</table>
  
  <div class="form-group"> 
    <div class="col-sm col-sm-10">
	<div class="fixed-bottom">
    	  <button type="submit" onmouseenter="check_box()"onclick="check_book()"  class="btn btn-default pull-right">Reservar</button>
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
    var fechahorario = "-"+document.getElementById("horarioInicio").innerHTML+"-"+document.getElementById("horarioFin").innerHTML+"-"+document.getElementById("fecha").innerHTML;
    console.log(list.length);
	for (var i = 0 ; i < list.length; i++) {
	list[i].value = document.getElementById("myTable").rows[i].cells[1].innerHTML+fechahorario;
	
		
	
	}
}

function check_box(){
     if(document.getElementById("optradio").checked == false){
		 alert("No ha seleccionado ningún box");
	 }

}

function check_book(){
    
		 alert("Reserva confirmada");
	 }

  </script>
	
</body>
</html>
