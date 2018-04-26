
</table>
  
  <div class="form-group"> 
    <div class="col-sm col-sm-10">
	<div class="fixed-bottom">
    	  <button type="submit" method='POST' action="confirma_reserva" class="btn btn-default pull-right">Reservar</button>
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
    function myFunction(){
    var list = document.getElementsByName("optradio");
    console.log(list.length);
	for (var i = 0 ; i < list.length; i++) {
	list[i].id = document.getElementById("myTable").rows[i].cells[1].innerHTML;
	console.log(list[i]);
		
	
	}
}
  </script>
	
</body>
</html>
