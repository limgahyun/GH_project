<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

</head>

<style>
	
	/* Style the content */
	.content {
	  margin-left: 300px;
	  padding-left: 20px;
	}

</style>

<body>
	<%-- SideMenu --%>
	 <jsp:include page="../module/slideSideMenu.jsp"/>
	
	<div class="content">
		<h2>CSS Template</h2>
		<p>A full-height, fixed sidenav and content.</p>
	</div>

</body>
</html>
