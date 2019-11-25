<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>Three Kingdoms</title>
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

<body class="w3-light-grey w3-content" style="max-width:1600px">
	<%-- Include::Main SideMenu --%>
	 <jsp:include page="../module/slideSideMenu.jsp"/>
	
	<!-- Include::Header -->
	<jsp:include page="./header.jsp"/>
	
	<!-- First Photo Grid-->
	<div class="w3-row-padding" style="padding-bottom: 120px;">
		<div class="w3-third w3-container w3-margin-bottom">
			<a href="/kingdomWei"><img src="/resources/threekingdoms/image/wei.jpg" alt="위나라" style="width:100%;" class="w3-hover-opacity"></a>
			<div class="w3-container w3-white">
				<p><h3><b>위(魏)<small>(조조)</small></b></h3></p>
				<p>위(魏, 220년 ~ 265년)는 후한이 멸망한 후 삼국 중 하나로, 조조가 기반을 닦고 조비가 세웠으며, 삼국 중 가장 강대했던 나라였다. 조위(曹魏)라고 부르기도 한다.</p>
			</div>
		</div>
		<div class="w3-third w3-container w3-margin-bottom">
			<a href="/kingdomChu"><img src="/resources/threekingdoms/image/chu.jpg" alt="촉나라" style="width:100%;" class="w3-hover-opacity"></a>
			<div class="w3-container w3-white">
				<p><h3><b>촉(蜀漢)<small>(유비)</small></b></h3></p>
				<p>촉한(蜀漢, 221년 ~ 263년)은 중국 삼국 시대 때 유비(劉備)가 지금의 사천성 지역에 세운 나라로 정식 국호는 한(大漢)이나 역사상 구분을 위하여 촉한이라고 부른다.한 황실의 후예가 세운 마지막 한나라이기에 계한(季漢)으로도 부른다.</p>
			</div>
		</div>
		<div class="w3-third w3-container" >
			<a href="/kingdomWu"><img src="/resources/threekingdoms/image/wu.jpg" alt="오나라" style="width:100%" class="w3-hover-opacity"></a>
			<div class="w3-container w3-white">
				<p><h3><b>오(吳)<small>(손권)</small></b></h3></p>
				<p>오(吳, 229년 ~ 280년) 또는 동오(東吳), 손오(孫吳)는 후한이 멸망한 후, 삼국 중의 하나로 친자 3대에 걸쳐 구축되었다. 위촉오 삼국 가운데 가장 늦게 건국되었으나, 가장 오랫동안 존속하였고 가장 나중에 멸망하였다. 손견(孫堅)과 손책(孫策)의 맹활약으로 강동에 기반을 잡았고, 수성의 달인인 손권(孫權)을 통해 제국으로 발돋움했다.</p>
			</div>
		</div>
	</div>
	
	<!-- Include::Footer -->
	<jsp:include page="./footer.jsp"/>

</body>
</html>
