
<c:forEach var="box" items="${free_boxes}">
	<div class="radio">
		<tr name="row">
			<td><%=request.getParameter("numres")%></td>
			<td><%=request.getParameter("fecha")%></td>
   			<td><%=request.getParameter("horarioInicio")%></td>
    		<td><%=request.getParameter("horarioFin")%></td>
    		<td><%=request.getParameter("box")%></td>
    		<td><form action='modificar_reserva' method='POST'><button name="modificar" type="submit">Modificar Reserva</button></form></td>
    		<td><form action='cancelar_reserva' method='POST'><button name="cancelar" type="submit">Cancelar Reserva</button></form></td>
  		</tr>
	</div>
    </c:forEach>
  
