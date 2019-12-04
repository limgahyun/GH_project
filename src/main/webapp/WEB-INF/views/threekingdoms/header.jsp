<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
	<!-- BEGIN::Header -->
	<div class="w3-content" style="max-width:1400px" id="home">
		<header class="w3-panel w3-center w3-opacity" style="padding:100px 16px 36px 16px"> 
			<h1 class="w3-xlarge">Romance of Three kingdoms </h1>
  			<h1>삼국지</h1>
		  	<p>어서오세요. <span class="w3-tag">삼국지</span>에 오신 것을 환영합니다.</p>
			<div class="w3-padding-32">
				<div class="w3-bar w3-border">
					<a href="${pageContext.request.contextPath}/threekingdomsHome" class="w3-bar-item w3-button">Home</a>
					<a href="${pageContext.request.contextPath}/threekingdomsIntro" class="w3-bar-item w3-button">나라별 인물소개</a>
					<a href="#" class="w3-bar-item w3-button">스토리텔링</a>
					<a href="#" class="w3-bar-item w3-button">주요전투</a>
				</div>
			</div>
		</header>
	</div>
	<!-- END::Header -->
</body>
</html>