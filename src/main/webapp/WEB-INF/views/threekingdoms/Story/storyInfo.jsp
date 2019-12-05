<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<title>Three Kingdoms :: Stroy</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
		<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	</head>
	
	<style>
		body,h1 {font-family: "Raleway", Arial, sans-serif}
		h1 {letter-spacing: 6px}
	</style>
	
	<body class="w3-light-grey">
		
		<%-- Include::Main SideMenu --%>
		 <jsp:include page="../../module/slideSideMenu.jsp"/>
		
		<!-- Include::Header -->
		<jsp:include page="../header.jsp"/>
		
		<!-- BEGIN::Page content -->
		<div  class="w3-content" style="max-width:1300px">
		
			스토리를 넣어봅시다
		
		</div>
		
		<!-- Include::Footer -->
		<jsp:include page="../footer.jsp"/>
		
	</body>
</html>