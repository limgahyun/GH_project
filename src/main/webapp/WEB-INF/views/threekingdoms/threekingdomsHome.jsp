<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>삼국지</title>
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

<body>
	<%-- Include::Main SideMenu --%>
	<jsp:include page="../module/slideSideMenu.jsp"/>
	
	<!-- Include::Header -->
	<jsp:include page="./header.jsp"/>
	
	<!-- BEGIN::Page content -->
	<div class="w3-content" style="max-width:1100px">

		<!-- BEGIN::Section One -->
		<div class="w3-row w3-padding-64" id="about">
			<div class="w3-col m6 w3-padding-large w3-hide-small">
				<!-- <img src="/main/resources/Threekingdoms/image/peach.jpg" class="w3-round w3-image w3-opacity-min" alt="Three Kingdoms Map" width="600" height="750"> -->
				<img src="${pageContext.request.contextPath}/resources/threekingdoms/image/threekingdoms_map.jpg"" class="w3-round w3-image w3-opacity-min" alt="Three Kingdoms Map" width="600" height="750">
			</div>
			
			<div class="w3-col m6 w3-padding-large">
				<h1 class="w3-center">삼국지에 대하여</h1><br>
				<p class="w3-large w3-text-grey w3-hide-medium">구분</p>정사서
				<h5 class="w3-center">중국의 위(魏) ·촉(蜀) ·오(吳) 3국의 정사(正史)</h5>
				<p class="w3-large">The Catering was founded in blabla by Mr. Smith in lorem ipsum dolor sit amet, consectetur adipiscing elit consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute iruredolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.We only use <span class="w3-tag w3-light-grey">seasonal</span> ingredients.</p>
				<p class="w3-large w3-text-grey w3-hide-medium">Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod temporincididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
			</div>
		</div>
		<hr>
		<!-- END::Section One -->
				
		<!-- BEGIN::Section Two -->
		<div class="w3-row w3-padding-64" id="menu">
			<div class="w3-col l6 w3-padding-large">
				<h1 class="w3-center">Our Menu</h1><br>
				<h4>Bread Basket</h4>
				<p class="w3-text-grey">Assortment of fresh baked fruit breads and muffins 5.50</p><br>
				  
				<h4>Honey Almond Granola with Fruits</h4>
				<p class="w3-text-grey">Natural cereal of honey toasted oats, raisins, almonds and dates 7.00</p><br>
				  
				<h4>Belgian Waffle</h4>
				<p class="w3-text-grey">Vanilla flavored batter with malted flour 7.50</p><br>
				  
				<h4>Scrambled eggs</h4>
				<p class="w3-text-grey">Scrambled eggs, roasted red pepper and garlic, with green onions 7.50</p><br>
				  
				<h4>Blueberry Pancakes</h4>
				<p class="w3-text-grey">With syrup, butter and lots of berries 8.50</p>    
			</div>
			  
			<div class="w3-col l6 w3-padding-large">
				<img src="https://i.pinimg.com/564x/a0/aa/48/a0aa489a8eb6d103fc66dbc14ba350ad.jpg" class="w3-round w3-image w3-opacity-min" alt="Menu" style="width:100%">
			</div>
		</div>
		<hr>
		<!-- END::Section Two -->
		
		<!-- BEGIN::Section Three -->
		<div class="w3-container w3-padding-64" id="contact">
			<h1>Contact</h1><br>
			<p>We offer full-service catering for any event, large or small. We understand your needs and we will cater the food to satisfy the biggerst criteria of them all, both look and taste. Do not hesitate to contact us.</p>
			<p class="w3-text-blue-grey w3-large"><b>Catering Service, 42nd Living St, 43043 New York, NY</b></p>
			<p>You can also contact us by phone 00553123-2323 or email catering@catering.com, or you can send us a message here:</p>
		</div>
		<!-- BEGIN::Section Three -->	
	</div>
	<!-- END::Page content -->
	

	<!-- Include::Footer -->
	<jsp:include page="./footer.jsp"/>
</body>
</html>
