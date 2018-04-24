
<form class="form-horizontal" action="/action_page.php">
 <table style="width:100%">

  <tr>
    <th></th>
    <th>id</th>
    <th>Capacidad</th>
  </tr>

    <c:forEach var="box" items="${free_boxes}">
	<div class="radio">
		<tr>
			<td><label><input type="radio" name="optradio"></label></td>
   			<td><%=request.getParameter("id")%></td>
    		<td><%=request.getParameter("capacidad")%></td>
  		</tr>
	</div>
    </c:forEach>
  



