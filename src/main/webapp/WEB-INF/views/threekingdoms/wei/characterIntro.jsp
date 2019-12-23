<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<title>삼국지 :: 위나라 장수</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
		<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script>
			$(document).ready(function() {
				$('#listBtn').click(function(){
					$(location).attr('href', './kingdomWei').val();
				});
				
				$('#updateBtn').click(function(){
					//location.href = '${pageContext.request.contextPath}/formWei';
					$(location).attr('href', './modifyFormWeiGeneral?wei_id=' + $('#weiId').val());
				});
				
				$('#delBtn').click(function(){
					confirm("삭제 하시겠습니까?");
					location.href = '${pageContext.request.contextPath}/deleteGeneral?wei_id=${weiVo.wei_id}';
					//$(location).attr('href', './deleteGeneral?wei_id' + $('#weiId').val());
				});
			});
		</script>
	</head>
	
	<style>
		body,h1 {font-family: "Raleway", Arial, sans-serif}
		h1 {letter-spacing: 6px}
		
		.menu {display: none;}
	</style>
	
	<body class="w3-light-grey">
		
		<%-- Include::Main SideMenu --%>
		 <jsp:include page="../../module/slideSideMenu.jsp"/>
		
		<!-- Include::Header -->
		<jsp:include page="../header.jsp"/>
		
		<!-- BEGIN::Page content -->
		<div  class="w3-content" style="max-width:1300px">
			<div class="w3-bar">
			  <button class="w3-button w3-left w3-dark-grey w3-round-large" id="listBtn">&laquo; 목록</button>
			  <button class="w3-button w3-right w3-green w3-round-large" id="updateBtn">수정</button>
			  <button class="w3-button w3-right w3-pink w3-round-large" id="delBtn" style="margin-right: 5px;">삭제</button>
			</div>
				<!-- introduce Container -->
				<div class="w3-container" id="introduce">
					<div class="w3-content" style="max-width:700px">
						<input type="hidden" id="weiId" value="${weiVo.wei_id}">
						<h1 class="w3-center">${weiVo.adult_name}</h1>
						<h5 class="w3-center w3-text-grey">${weiVo.birth_death}</h5>
						
						<br>
						
						<p>${weiVo.introduce}</p>
						<img src="${pageContext.request.contextPath}/resources/threekingdoms/image/wei.jpg" class="w3-round w3-image w3-opacity-min w3-margin-top" alt="Three Kingdoms Map" style="width:100%;max-width:1000px" >
						<p><strong>Opening hours:</strong> everyday from 6am to 5pm.</p>
						<p><strong>Address:</strong> 15 Adr street, 5015, NY</p>
					</div>
				</div>
	
				<!-- Life Container -->
				<div class="w3-container" id="life">
					<div class="w3-content" style="max-width:700px">
						<h5 class="w3-center w3-padding-48"><span class="w3-tag w3-wide">생애</span></h5>
						<p>${weiVo.life}</p>
					</div> 
				</div>
				
				<!-- Rating Container -->
				<div class="w3-container" id="rating">
					<div class="w3-content" style="max-width:700px">
						<h5 class="w3-center w3-padding-48"><span class="w3-tag w3-wide">평가</span></h5>
						<p>${weiVo.rating_1}</p>
						<div class="w3-panel w3-leftbar w3-light-grey">
							<p><i>"Use products from nature for what it's worth - but never too early, nor too late." Fresh is the new sweet.</i></p>
							<p>Chef, Coffeeist and Owner: Liam Brown</p>
						</div>
					</div> 
				</div>
				
				<!-- StroyLink Container -->
				<div class="w3-container" id="Link">
					<div class="w3-content" style="max-width:700px">
						<h5 class="w3-center w3-padding-48"><span class="w3-tag w3-wide">관련 스토리</span></h5>
						<p>The Cafe was founded in blabla by Mr. Smith in lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
					</div> 
				</div>
		</div>
		
		
		<br>
		<br>
		<br>
		
		<!-- Include::Footer -->
		<jsp:include page="../footer.jsp"/>
		
	</body>
</html>