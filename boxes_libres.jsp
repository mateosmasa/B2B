

    <c:forEach var="box" items="${free_boxes}">

		<tr>
   			<td><%=request.getParameter("id")%></td>
    		<td><%=request.getParameter("capacidad")%></td>
    		<td><%=request.getParameter("piso")%></td>
  		</tr>
    </c:forEach>
  



