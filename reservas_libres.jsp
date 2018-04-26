    <c:forEach var="reservas" items="${free_reservas}">
		<tr>
   			<td><%=request.getParameter("id")%></td>
    		<td><%=request.getParameter("fecha")%></td>
    		<td><%=request.getParameter("hora_inicio")%></td>
    		<td><%=request.getParameter("hora_fin")%></td>
    		<td><%=request.getParameter("nia_usuario")%></td>
    		<td><%=request.getParameter("box_id")%></td>
  		</tr>
    </c:forEach>
