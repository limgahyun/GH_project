<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>Three Kingdom :: Chu</title>
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
			<c:forEach var="chuList" items="${chuVo}">
				<div class="w3-third w3-container w3-margin-bottom">
					<a href="#"><img src="${pageContext.request.contextPath}/resources/threekingdoms/image/chu.jpg" alt="위나라" style="width:100%;" class="w3-hover-opacity"></a>
					<div class="w3-container w3-white">
						<p><h3><b>${chuList.adult_name}<small>${chuList.name}</small></b></h3></p>
						<p>${chuList.explicate}</p>
					</div>
				</div>
			</c:forEach>
		</div>

		<!-- Pagination -->
		<div class="w3-center w3-padding-32" style="padding-bottom: 120px;">
			<div class="w3-bar">
				<a  class="w3-bar-item w3-button w3-hover-black" href="${pageContext.request.contextPath}/kingdomChu?currentPage=1&pagePerRow=${pagePerRow}&searchSignal=${searchSignal}&searchSelect=${searchSelect}&searchWord=${searchWord}" aria-label="Previous" >
					<span aria-hidden="true">&laquo;</span>
				</a>
				
				<c:choose>
					<c:when test="${currentPage > 1}">
						<a  class="w3-bar-item w3-button w3-hover-black" href="${pageContext.request.contextPath}/kingdomChu?currentPage=${currentPage-1}&pagePerRow=${pagePerRow}&searchSignal=${searchSignal}&searchSelect=${searchSelect}&searchWord=${searchWord}" aria-label="Previous">
							<span aria-hidden="true">&lt;</span>
						</a>
					</c:when>
					<c:otherwise>
						<a  class="w3-bar-item w3-button w3-hover-black" href="${pageContext.request.contextPath}/kingdomChu?currentPage=1&pagePerRow=${pagePerRow}&searchSignal=${searchSignal}&searchSelect=${searchSelect}&searchWord=${searchWord}" aria-label="Previous">
							<span aria-hidden="true">&lt;</span>
						</a>
					</c:otherwise>
				</c:choose>
				
				<c:choose>
					<c:when test="${lastPage > beginPageNumForCurrentPage + 4}">
						<c:forEach var="pageNum" begin="${beginPageNumForCurrentPage}" end="${beginPageNumForCurrentPage + 4}" step="1">
							<c:choose>
								<c:when test="${pageNum == currentPage}">
									<a class="w3-bar-item w3-black w3-button" href="${pageContext.request.contextPath}/kingdomChu?currentPage=${pageNum}&pagePerRow=${pagePerRow}&searchSignal=${searchSignal}&searchSelect=${searchSelect}&searchWord=${searchWord}">${pageNum}</a>
								</c:when>
								<c:otherwise>
									<a class="w3-bar-item w3-button w3-hover-black" href="${pageContext.request.contextPath}/kingdomChu?currentPage=${pageNum}&pagePerRow=${pagePerRow}&searchSignal=${searchSignal}&searchSelect=${searchSelect}&searchWord=${searchWord}">${pageNum}</a>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<c:forEach var="pageNum" begin="${beginPageNumForCurrentPage}" end="${lastPage}" step="1">
							<c:choose>
								<c:when test="${pageNum == currentPage}">
									<a class="w3-bar-item w3-black w3-button"  href="${pageContext.request.contextPath}/kingdomChu?currentPage=${pageNum}&pagePerRow=${pagePerRow}&searchSignal=${searchSignal}&searchSelect=${searchSelect}&searchWord=${searchWord}">${pageNum}</a>
								</c:when>
								<c:otherwise>
									<a class="w3-bar-item w3-button w3-hover-black" href="${pageContext.request.contextPath}/kingdomChu?currentPage=${pageNum}&pagePerRow=${pagePerRow}&searchSignal=${searchSignal}&searchSelect=${searchSelect}&searchWord=${searchWord}">${pageNum}</a>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</c:otherwise>
				</c:choose>
				
				<c:choose>
					<c:when test="${currentPage < lastPage}">
						<a  class="w3-bar-item w3-button w3-hover-black" href="${pageContext.request.contextPath}/kingdomChu?currentPage=${currentPage+1}&pagePerRow=${pagePerRow}&searchSignal=${searchSignal}&searchSelect=${searchSelect}&searchWord=${searchWord}" aria-label="Next">
							<span aria-hidden="true">&gt;</span>
						</a>
					</c:when>
					<c:otherwise>
						<a  class="w3-bar-item w3-button w3-hover-black" href="${pageContext.request.contextPath}/kingdomChu?currentPage=${lastPage}&pagePerRow=${pagePerRow}&searchSignal=${searchSignal}&searchSelect=${searchSelect}&searchWord=${searchWord}"aria-label="Next">
							<span aria-hidden="true">&gt;</span>
						</a>
					</c:otherwise>
				</c:choose>
				<a  class="w3-bar-item w3-button w3-hover-black" href="${pageContext.request.contextPath}/kingdomChu?currentPage=${lastPage}&pagePerRow=${pagePerRow}&searchSignal=${searchSignal}&searchSelect=${searchSelect}&searchWord=${searchWord}" aria-label="Next">
					<span aria-hidden="true">&raquo;</span>
				</a>
			</div>
		</div>		
	</div>

	
	<!-- Include::Footer -->
	<jsp:include page="../footer.jsp"/>

</body>
</html>
