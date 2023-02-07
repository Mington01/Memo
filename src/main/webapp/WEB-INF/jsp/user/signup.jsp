<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
	<link rel="stylesheet" href="/static/css/style.css" type="text/css">
</head>
<body>
	<div id ="wrap">
		<c:import url="/WEB-INF/jsp/include/header.jsp" />
		
		<section class="contents d-flex justify-content-center">
			<div class="join-box my-5">
				<h2 class="text-center">회원가입</h2>
				<input type="text" id="idInput" placeholder="아이디" class="form-control mt-2">
				<input type="password" id="passwordInput" placeholder="비밀번호" class="form-control mt-2">
				<input type="password" id="passwordConfirmInput" placeholder="비밀번호 확인" class="form-control mt-2">
				<input type="text" id="nameInput" placeholder="이름" class="form-control mt-2">
				<input type="text" id="emailInput" placeholder="이메일" class="form-control mt-2">
				<button type="button" id="joinBtn" class="btn btn-primary btn-block mt-2">입력</button>
			</div>
		</section>
		
		<c:import url="/WEB-INF/jsp/include/footer.jsp" />
	</div>
	
	<script>
		$(document).ready(function() {
			$("#joinBtn").on("click", function() {
				let id = $("#idInput").val();
				let password = $("#passwordInput").val();
				let passwordConfirm = $("#passwordConfirmInput").val();
				let name = $("#nameInput").val();
				let email = $("#emailInput").val();
				
				if(id == null || id == "") {
					alert("아이디를 입력하세요. ");
					return;
				}
				if(password == null || password == "") {
					alert("비밀번호를 입력하세요. ");
					return;
				}
				if(passwordConfirm == null || passwordConfirm == "") {
					alert("비밀번호 확인란을 입력하세요. ");
					return;
				}
				if(password == null || password == "") {
					alert("비밀번호를 입력하세요. ");
					return;
				}
				if(password == null || password == "") {
					alert("비밀번호를 입력하세요. ");
					return;
				}
				
			});
		});
	</script>

</body>
</html>