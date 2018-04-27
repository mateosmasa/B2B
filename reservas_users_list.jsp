
<c:forEach var="box" items="${free_boxes}">
	<div class="radio">
		<tr>
			<td><%=request.getParameter("numres")%></td>
			<td><%=request.getParameter("fecha")%></td>
   			<td><%=request.getParameter("horarioInicio")%></td>
    		<td><%=request.getParameter("horarioFin")%></td>
    		<td><%=request.getParameter("box")%></td>
  		</tr>
	</div>
    </c:forEach>
  
