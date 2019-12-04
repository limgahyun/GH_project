<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>Three Kingdom :: Wu</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

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
	<div  class="w3-content"style="max-width:1600px">	
		<div class="row" >
			<div class="col-md-11"></div>
			<div class="col-md-1">
				<span class="input-group-btn">
					<button id="addBtn" class="btn btn-primary" type="button">장수추가</button>
				</span>
			</div>
		</div>
		<br>		
		
		<!-- Photo Grid content -->
		<div class="w3-row-padding">
			<c:forEach var="wuList" items="${wuVo}">
				<div class="w3-third w3-container w3-margin-bottom">
					<a href="#"><img src="${pageContext.request.contextPath}/resources/threekingdoms/image/wu.jpg" alt="위나라" style="width:100%;" class="w3-hover-opacity"></a>
					<div class="w3-container w3-white">
						<p><h3><b>${wuList.adult_name}<small>${wuList.name}</small></b></h3></p>
						<p>${wuList.explicate}</p>
					</div>
				</div>
			</c:forEach>
		</div>

		<!-- Pagination -->
		<div class="w3-center w3-padding-32" style="padding-bottom: 120px;">
			<div class="w3-bar">
				<a href="#" class="w3-bar-item w3-button w3-hover-black">«</a>
				<a href="#" class="w3-bar-item w3-black w3-button">1</a>
				<a href="#" class="w3-bar-item w3-button w3-hover-black">2</a>
				<a href="#" class="w3-bar-item w3-button w3-hover-black">3</a>
				<a href="#" class="w3-bar-item w3-button w3-hover-black">4</a>
				<a href="#" class="w3-bar-item w3-button w3-hover-black">»</a>
			</div>
		</div>
	</div>

	
	<!-- Include::Footer -->
	<jsp:include page="../footer.jsp"/>

</body>
</html>
