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
				<!-- 실제내용 -->
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