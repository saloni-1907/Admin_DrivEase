<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Admin Registration</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet"
	href="/admindrivease/resources/bower_components/bootstrap/dist/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="/admindrivease/resources/bower_components/font-awesome/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="/admindrivease/resources/bower_components/Ionicons/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet"
	href="/admindrivease/resources/dist/css/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet"
	href="/admindrivease/resources/dist/css/skins/_all-skins.min.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

<!-- Google Font -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">

		<%@ include file="header.jsp"%>
		<%@ include file="adminsidebar.jsp"%>
		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<br> <br>
			<div class="col-md-12">
				<div class="box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">
							<c:choose>
								<c:when test="${edit}">
												Edit Admin Details
											</c:when>
								<c:otherwise>
												Register New Admin
											</c:otherwise>
							</c:choose>
						</h3>
					</div>
					<!-- /.box-header -->
					<!-- form start -->
					<div class="text-center">
									<%if(request.getParameter("errorMsg") != null){ %>
                                <div style="color: red;"><%= request.getParameter("errorMsg") %></div>
                                <%} %></div>
					<form:form role="form" modelAttribute="admin1"
						enctype="multipart/form-data" method="post">
						<div class="box-body">
							<div class="form-group">
								<form:input type="hidden" class="form-control" id="adminId"
								 path="adminId" />
							</div>

							<div class="form-group">
								<label for="fname">First Name</label>
								<form:input type="text" class="form-control" id="fname"
									placeholder="First Name" path="fname" />
							</div>
							<div class="form-group">
								<label for="lname">Last Name</label>
								<form:input type="text" class="form-control" id="lname"
									placeholder="Last Name" path="lname" />
							</div>
							<div class="form-group">
								<label for="email">Email address</label>
								<form:input type="email" class="form-control" id="emailId"
									placeholder="Enter email" path="emailId" />
							</div>

							<div class="form-group">
								<label for="exampleInputFile">Profile Image</label> 
								
								<input type="file" name="profileImage" id="profileImage" />
							</div>

						</div>
						<!-- /.box-body -->

						<div class="box-footer">
							<center>
							<c:choose>
								<c:when test="${edit}">
									<input class="btn btn-primary" type="submit" value="Update"
										formaction="/admindrivease/admin/updateAdmin" />
								</c:when>
								<c:otherwise>
									<input class="btn btn-primary" type="submit" value="Register"
										formaction="/admindrivease/admin/saveAdmin" />
								</c:otherwise>
							</c:choose>
							<input class="btn btn-primary" type="submit" value="Cancel"
										formaction="/admindrivease/admin/adminList" />
										</center>
						</div>


					</form:form>
				</div>

			</div>
		</div>


		<!-- jQuery 3 -->
		<script
			src="/admindrivease/resources/bower_components/jquery/dist/jquery.min.js"></script>
		<!-- Bootstrap 3.3.7 -->
		<script
			src="/admindrivease/resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
		<!-- FastClick -->
		<script
			src="/admindrivease/resources/bower_components/fastclick/lib/fastclick.js"></script>
		<!-- AdminLTE App -->
		<script src="/admindrivease/resources/dist/js/adminlte.min.js"></script>
		<!-- AdminLTE for demo purposes -->
		<script src="/admindrivease/resources/dist/js/demo.js"></script>
		<%@ include file="adminfooter.jsp"%>
</body>
</html>
