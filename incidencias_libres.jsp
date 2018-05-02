
    <c:forEach var="incidencias" items="${free_incidencias}">

		<tr>
   			<td><%=request.getParameter("id")%></td>
    		<td><%=request.getParameter("cause")%></td>
    		<td><%=request.getParameter("description")%></td>
    		<td><%=request.getParameter("id_reserva")%></td>
  		</tr>
    </c:forEach>
