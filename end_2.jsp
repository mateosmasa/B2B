
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
  var dates= [];
  var current_date = new Date();
    function check_select(){
	var list = document.getElementsByName("modificar");
	var list2 = document.getElementsByName("cancelar");
	var list3 = document.getElementsByName("incidencia");
    var table = document.getElementById("myTable");
    for ( var r=0;r<table.rows.length;r++){
	     list3[r].value = list2[r].value  = list[r].value = table.rows[r].cells[0].innerHTML;	
	     
	 }
	}
	
	function block_button(){ 
	 var table = document.getElementById("myTable");
	 var list = document.getElementsByName("modificar");
     var list2 = document.getElementsByName("cancelar");
	 var list3 = document.getElementsByName("incidencia");
	   for ( var r=0;r<table.rows.length;r++){
		   var dateParts = table.rows[r].cells[1].innerHTML.split("/");
           var dateObject = new Date(dateParts[2], dateParts[1] - 1, dateParts[0]);
	      dates[r] = dateObject;
	       if(dates[r] < current_date){
			   list[r].disabled = true;
			   list2[r].disabled = true;
			   list3[r].disabled = true;
			   list[r].classList.add('disabled');
			   list2[r].classList.add('disabled');
			   list3[r].classList.add('disabled');
		   }
	}
  }
  
  function start(){
	  check_select();
	  block_button();
	  }

</script>

</body>
</html>
