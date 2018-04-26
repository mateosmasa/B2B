

 

    <c:forEach var="box" items="${free_boxes}">
	<div class="radio">
		<tr>
			<td><label><input type="radio" id="optradio" name="optradio"></label></td>
   			<td><%=request.getParameter("id")%></td>
   			<td><%=request.getParameter("piso")%></td>
    		<td><%=request.getParameter("capacidad")%></td>
  		</tr>
	</div>
    </c:forEach>
