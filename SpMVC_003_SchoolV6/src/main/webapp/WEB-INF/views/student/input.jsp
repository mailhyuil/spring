<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<style>
form {
	width: 80%;
	margin: 5px auto;
}

fieldset {
	border: 1px solid blue;
	padding: 10px;
	border-radius: 10px;
	margin: 20px;
}

legend {
	text-align: center;
	padding: 10px;
	margin: 10px;
}

form div {
	width: 80%;
	margin: 5px auto;
	display: flex;
}

form label, form input {
	padding: 8px;
}

form label {
	flex: 1;
	width: 30%;
	color: blue;
	font-weight: bold;
	text-align: right;
}

form input {
	flex: 3;
	width: 65%;
	margin-left: 5px;
	width: 65%;
}

form div:last-of-type {
	justify-content:end;
	margin: 10px auto;
}

form div:first-of-type input {
	flex:2;
	margin-right:10px;
}
form div:first-of-type button {
	flex:1;

}
</style>
<script>
	const rootPath = "${rootPath}";
</script>
<script src="${rootPath}/static/js/std_input.js?ver=2022-05-10-017"></script>
<form method="POST">
	<fieldset>
		<legend>학생정보 등록</legend>
		<div>
			<label>학번</label> <input type="text" name="st_num">
			<button type="button" class="btn-green std-num-check">중복검사</button>
		</div>
		<div>
			<label>이름</label> <input type="text" name="st_name">
		</div>
		<div>
			<label>학과</label> <input type="text" name="st_dept">
		</div>
		<div>
			<label>학년</label> <input type="text" name="st_grade">
		</div>
		<div>
			<label>전화번호</label> <input type="text" name="st_tel">
		</div>
		<div>
			<label>주소</label> <input type="text" name="st_addr">
		</div>
		<div>
			<button type="button" class="btn-blue std-save">저장</button>
		</div>
	</fieldset>
</form>