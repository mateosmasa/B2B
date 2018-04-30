
</table>
  



  

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
	var list = document.getElementsByName("modificar");
	var list2 = document.getElementsByName("cancelar");
    var table = document.getElementById("myTable");
    for ( var r=0;r<table.rows.length;r++){
	     list2[r].value = list[r].value = table.rows[r].cells[0].innerHTML;		
	 }
	}
</script>

</body>
</html>
