<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	</head>
	
	<style>
		/* ---------------------------------------------- */
		/* SideMenu*/
		/* --------------------------------------------- */
		
		input[type=checkbox] {
		   position: absolute;
		   opacity: 0;
		}
		
		.menuLabel {
		   position: fixed;
		   top: 10px;
		   left: 10px;
		   z-index: 1;
		   display: block;
		   font-size:2em;
		   color: #444;
		   cursor: pointer;
		   transform: translate3d(0, 0, 0);
		   transition: transform .4s;
		}
		
		input[type=checkbox]:checked ~ label {
		   transform: translate3d(250px, 0, 0) rotate(90deg);
		}
		
		.check-menu {
		   width:100%;
		   padding: 40px;
		   background: #f2f2f2;
		   transform: translate3d(0, 0, 0);
		   transition: transform .4s;
		}
		
		input[type=checkbox]:checked ~ .content {
		   transform: translate3d(250px, 0, 0);
		}
		
		input[type=checkbox]:checked ~ .slide-menu {
		   transform: translate3d(0, 0, 0);
		}
		
		input[type=checkbox]:checked ~ .slide-menu .menu li {
		   width: 100%;
		}
		
		.slide-menu {
		   background-color: #1b1b28;
		   box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
		   transform: translate3d(-250px, 0, 0);
		   position: absolute;
		   top:0px;
		   width: 250px;
		   height:100%;
		   color: #ddd;
		   left: 0;
		   transition: all .4s;
		   z-index:100;
		}
		
		.slide-menu ul li{
		  margin-top:10px;
		}
		
		.slide-menu h1 {
		 font:0.8em daum;
		 color:#999;
		  margin: 10px;
		 }
		 
		.menu {
		   list-style: none;
		   padding: 0;
		   margin: 0;
		}
		
		.menu a {
		   display: block;
		   text-decoration: none;
		   color: #fff;
		   font-size: 0.9em;
		   padding: 15px;
		}
		
		
		/*위의 코드는 페이지 왼쪽에서 메뉴가 미끄러져 나오지만 페이지 오른쪽의 메뉴를 선호하는 경우 아래 코드를 변경하십시오.*/
		
		label {
		   /* right: 40px; */
		}
		
		input[type=checkbox]:checked ~ label {
		   transform: translate3d(250px, 0, 0) rotate(90deg);
		}
		
		input[type=checkbox]:checked ~ .content {
		   transform: translate3d(250px, 0, 0);
		}
		
		.slide-menu {
		   transform: translate3d(-250px, 0, 0);
		   right: 0;
		}
		
		/* Slide Menu Navigation */
		.slide-menu a {
		  color: white;
		  padding: 16px;
		  text-decoration: none;
		  display: block;
		}
		
		/* Slide Menu Change color on hover */
		.slide-menu a:hover {
		  background-color: withe;
		  color: black;
		}
		
		/* SideMenu 이미지 위치 정렬*/
		.img-position {
		    margin: 10px 70px 10px 70px;
		}
	
	</style>

	<body>	
	<%-- SideMenu --%>
		<div id=check-menu>
			<input id="toggle" type="checkbox"/>
			<label class="menuLabel" for="toggle">&equiv;</label>
			<div class="slide-menu">
				<nav id="category">
					<img src="/resources/metronic/assets/media/users/100_3.jpg" class="img-rounded img-position" alt="Responsive image">
					<a href="${pageContext.request.contextPath}/"><span class="glyphicon glyphicon-user" style="padding-right: 10px;"></span>About Me</a>
					<a href="/reservationHome"><span class="glyphicon glyphicon-th-large" style="padding-right: 10px;"></span>공공물품 예약시스템</a>
					<a href="${pageContext.request.contextPath}/threekingdomsHome"><span class="glyphicon glyphicon-th-large" style="padding-right: 10px;"></span>삼국지</a>
				</nav>
			</div> 
		</div>
	</body>
</html>