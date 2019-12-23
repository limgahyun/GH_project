<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>위나라 장수 등록</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
		<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		
		<script type="text/javascript">
		
			var sel_file;
			
			$(document).ready(function() {
				//파일업로드 이미지 미리보기
				$("#input_img").on("change", handleImgFileSelect);
				
				//등록버튼 클릭 시 이벤트
				$('#addBtn').click(function(){
					 var generalForm = true;
					
				 	if($('#adult_name').val() == ''){
						alert('장수의 관명을 작성해주세요');
						$('#adult_name').focus();
						generalForm = false;
						return;
					}
					
					if($('#name').val() == ''){
						alert('장수의 자를 작성해주세요');
						$('#name').focus();
						generalForm = false;
						return;
					}
					if($('#explicate').val() == ''){
						alert('장수 설명을 작성해주세요');
						$('#explicate').focus();
						generalForm = false;
						return;
					} 
					
 				 	if(funtionaryForm = true){
						$('#insertWeiGeneral').submit();
					}  
					
					//location.href = '${pageContext.request.contextPath}/formWei';
					//$(location).attr('href', './formWei').val();
				});
				
				//취소버튼 클릭 시 이벤트
				$('#cancelBtn').click(function(){
					$(location).attr('href', './kingdomWei').val();
				});
			});
			
			function handleImgFileSelect(e) {
				var files = e.target.files;
				var filesArr = Array.prototype.slice.call(files);
				
				filesArr.forEach(function(f) {
					if(!f.type.match("image.*")) {
						alert("확장자는 image만 가능합니다.");
						return;
					}
					sel_file = f;
					var reader = new FileReader();
					reader.onload = function(e) {
						$("#img").attr("src", e.target.result);
					}
					reader.readAsDataURL(f);
				});
			}
			
		</script>
	</head>
	
	<style>
		body,h1 {font-family: "Raleway", Arial, sans-serif}
		h1 {letter-spacing: 6px}
		
		.img_wrap {
			width: 500px;
			margin-top: 20px;
			margin-bottom: 20px;
		}
		
		.img_wrap img {
			max-width: 100%;
		}
	</style>
	
	<body class="w3-light-grey">
		<%-- Include::Main SideMenu --%>
		 <jsp:include page="../../module/slideSideMenu.jsp"/>
		
		<!-- Include::Header -->
		<jsp:include page="../header.jsp"/>
		
		<!-- BEGIN::Page content -->
		<div  class="w3-content"style="max-width:1000px">	
			<div class="panel panel-danger">
				<div class="panel-heading">
					<div class="row" >
					    <div class="col-md-10">
						    <h4><strong>위나라 장수 등록</strong></h4>
					    </div>
					    <div class="col-md-2">
					    	<input id="addBtn" class="btn btn-primary" type="submit" value="등록" style="margin-top: 5px;"/>
					    	<button id="cancelBtn" class="btn btn-default" type="button" style="margin-top: 5px;">취소</button>
				    	</div>
				    </div>
				</div>
				<div class="panel-body form-horizontal">
					<form action="${pageContext.request.contextPath}/insertWeiGeneral" id="insertWeiGeneral" method="post" enctype="multipart/form-data">
						<!-- 파일업로드 -->
						 
						
							 <div class="form-group">
							    <label for="name" class="col-sm-2 control-label">장수 이미지</label>
							    <div class="img_wrap" style="margin-left:180px;">
							    	<img id="img"/>
							    </div>
							    <div class="col-sm-8" style="margin-left:170px;">
							    	<input type="file" name="multipartFile" id="input_img">
								</div>
							</div>
						
						
						<!-- 입력 폼 -->
					
							<div class="form-group">
								<label for="adult_name" class="col-sm-2 control-label">관명</label>
							    <div class="col-sm-9">
							    	<input type="text" class="form-control" id="adult_name" name="adult_name" placeholder="장수의 관명을 입력해주세요."/></br>
								</div>
							</div>
							
							<div class="form-group">
								<label for="name" class="col-sm-2 control-label">자</label>
							    <div class="col-sm-9">
							    	<input type="text" class="form-control" id="name" name="name" placeholder="장수의 자를 입력해주세요."/></br>
								</div>
							</div>
							
							<div class="form-group">
								<label for="birth_death" class="col-sm-2 control-label">출생 및 사망</label>
							    <div class="col-sm-9">
							    	<input type="text" class="form-control" id="birth_death" name="birth_death" placeholder="출생 및 사망 시기를 입력해주세요."/></br>
								</div>
							</div>
							
							<div class="form-group">
							    <label for="introduce" class="col-sm-2 control-label">장수 소개</label>
							    <div class="col-sm-9">
							    	<textarea class="form-control" rows="5" id="introduce" name="introduce"></textarea></br>
								</div>
							</div>
							
							<div class="form-group">
							    <label for="life" class="col-sm-2 control-label">장수의 생애</label>
							    <div class="col-sm-9">
							    	<textarea class="form-control" rows="5" id="life" name="life"></textarea></br>
								</div>
							</div>
							
							<div class="form-group">
							    <label for="rating_1" class="col-sm-2 control-label">평가1</label>
							    <div class="col-sm-9">
							    	<textarea class="form-control" rows="5" id="rating_1" name="rating_1"></textarea></br>
								</div>
							</div>
							
							<div class="form-group">
							    <label for="rating_2" class="col-sm-2 control-label">평가2</label>
							    <div class="col-sm-9">
							    	<textarea class="form-control" rows="5" id="rating_2" name="rating_2"></textarea></br>
								</div>
							</div>
							
							<div class="form-group">
							    <label for="rating_3" class="col-sm-2 control-label">평가3</label>
							    <div class="col-sm-9">
							    	<textarea class="form-control" rows="5" id="rating_3" name="rating_3"></textarea>
								</div>
							</div>
							
					</form>
				</div>
			</div>
			
		
		</div>
	
		<!-- Include::Footer -->
		<jsp:include page="../footer.jsp"/>
	
	</body>
</html>