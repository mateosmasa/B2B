    <c:forEach var="users" items="${free_users}">
		<tr>
   			<td><%=request.getParameter("nia")%></td>
    		<td><%=request.getParameter("nombre")%></td>
    		<td><%=request.getParameter("apellido")%></td>
    		<td><%=request.getParameter("telefono")%></td>
    		<td><%=request.getParameter("email")%></td>
  		</tr>
    </c:forEach>
  
