<form class="form-horizontal" action="">
 <table style="width:100%">

  <tr>
    <th>Reserva</th>
    <th>Fecha</th>
    <th>horarioInicio</th>
    <th>horarioFin</th>
    <th>Box</th>
    
  </tr>

    <c:forEach var="box" items="${free_boxes}">
	<div class="radio">
		<tr>
			<td><%=request.getParameter("Reserva")%></td>
   			<td><%=request.getParameter("Fecha")%></td>
    		<td><%=request.getParameter("horarioInicio")%></td>
    		<td><%=request.getParameter("horarioFin")%></td>
    		<td><%=request.getParameter("Box")%></td>
  		</tr>
	</div>
    </c:forEach>
  

