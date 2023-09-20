<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<c:import url="/WEB-INF/views/layout/headCSS.jsp"></c:import>
 
</head>
<body id="page-top">
	<div id="wrapper">
	<c:import url="/WEB-INF/views/layout/sidebar.jsp"></c:import>
		<div id="content-wrapper" class="d-flex flex-column">
			<div id="content">
				
				<c:import url="/WEB-INF/views/layout/topbar.jsp"></c:import>
				<div class="container-fluid">
				<div class="row">
					<h1>update 페이지</h1>
					<form action="update" method="post">
						<div class="mb-3">
						    <label for="boardTitle" class="form-label">제목</label>
						    <input type="text" class="form-control" id="boardTitle" aria-describedby="emailHelp" name="boardTitle" value="">
					  	</div>
					  	<div class="mb-3">
						    <label for="boardWriter" class="form-label">작성자</label>
						    <input type="text" class="form-control" id="boardWriter" aria-describedby="emailHelp" name="boardWriter" value="">
					  	</div>
					  	<div class="mb-3">
						  <label for="boardContents" class="form-label">내용</label>
						  <textarea class="form-control" aria-label="With textarea" id="boardContents" name="boardContents" value=""></textarea>
						</div>
						<button class="btn btn-danger">add</button>
					  </form>
					  </div>
				</div>
			</div>
			<footer class="sticky-footer bg-white">
                <div class="container my-auto">
                <c:import url="/WEB-INF/views/layout/footer.jsp"></c:import>
                </div>
                </footer>
		</div>
		
	</div>
	
	
	<c:import url="/WEB-INF/views/layout/footjs.jsp"></c:import>
</body>
</html>