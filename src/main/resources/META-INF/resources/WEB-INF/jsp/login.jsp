<%@ include file="common/header.jspf" %>
<%@ include file="common/nav.jspf" %>
	<div class="container">
	<pre>${error}</pre>
	<form method="post">
	Name: <input type=text name="name">
	Password <input type=password name="password">
	<input type=submit>
	<form>
	</div>
<%@ include file="common/footer.jspf" %>
	