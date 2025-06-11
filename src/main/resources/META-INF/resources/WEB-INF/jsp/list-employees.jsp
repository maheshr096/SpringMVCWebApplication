<%@ include file="common/header.jspf" %>
<%@ include file="common/nav.jspf" %>
	
	<h1> Here is the List of Employees </h1>
	<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Technology</th>
				<th>Experiaence</th>
				<th>Delete</th>
				<th>Update</th>
				</tr>
	
		</thead>
		<tbody>
			<c:forEach items="${employees}" var="emp">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.technology}</td>
				<td>${emp.experiaence}</td>
				<td><a href="delete-todo?id=${emp.id}" class="btn btn-warning">Delete</td>
				<td><a href="update-employe?id=${emp.id}" class="btn btn-success">Update</td>
				</tr>	
			
				</c:forEach>
			</tbody>
		
	</table>

	</div>
	
	<a href="add-employee" class="btn btn-success">Add Todo</a>
	<%@ include file="common/footer.jspf" %>
