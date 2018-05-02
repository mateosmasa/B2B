
<c:forEach var="box" items="${free_boxes}">
	<div class="radio">
		<tr name="row">
			<td><%=request.getParameter("numres")%></td>
			<td><%=request.getParameter("fecha")%></td>
   			<td><%=request.getParameter("horarioInicio")%></td>
    		<td><%=request.getParameter("horarioFin")%></td>
    		<td><%=request.getParameter("box")%></td>
    		<td><form action='modificar_reserva' method='POST'><button name="modificar" id="modificar" type="submit">Modificar Reserva</button></form></td>
    		<td><form onsubmit="return confirm('¿Quiere cancelar la reserva?');" action='cancelar_reserva' method='POST'><button name="cancelar" id="cancelar" type="submit">Cancelar Reserva</button></form></td>
    		<td><form action='anadir_incidencia' method='POST'><button name="incidencia" id="incidencia" type="submit">Declarar Incidencia</button></form></td>
  		</tr>
	</div>
    </c:forEach>
  
