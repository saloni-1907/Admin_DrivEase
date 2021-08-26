<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 2 | User Profile</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="/admindrivease/resources/bower_components/bootstrap/dist/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="/admindrivease/resources/bower_components/font-awesome/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="/admindrivease/resources/bower_components/Ionicons/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/admindrivease/resources/dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="/admindrivease/resources/dist/css/skins/_all-skins.min.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

  <!-- Google Font -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

<%@ include file="header.jsp" %>
 <%@ include file="adminsidebar.jsp" %>
   <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <br><br>
    <div class="col-md-12">
    <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Send Reply to Feedback</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form:form role="form" modelAttribute="feedback" action="/admindrivease/feedback/sendReply"  method="post">
              <div class="box-body">
              <div class="form-group">
				
                  <form:input type="hidden" class="form-control" id="feedbackId" placeholder=""  path="feedbackId"/>
                </div>
                
               <div class="form-group">
				 <label>Name</label>
                  <form:input type="text" class="form-control" id="name"  path="name"/>
                </div>
                <div class="form-group">
				 <label>Email Address</label>
                  <form:input type="email" class="form-control" id="emailId"  path="emailId" />
                </div>
                 <div class="form-group">
				 <label>Subject</label>
                  <form:input type="text" class="form-control" id="subject"  path="subject" />
                </div>
                <div class="form-group">
				 <label>Message</label>
                  <form:textarea rows="5" class="form-control" id="message"  path="message" />
                </div>
                <div class="form-group">
				 <label>Reply</label>
                  <form:textarea rows="5" class="form-control" id="replymsg"  path="replymsg"/>
                </div>
                
              <div class="box-footer">
                <button type="submit" class="btn btn-primary">Send Reply</button>
                 <button type="reset" class="btn btn-primary">Cancel</button>
                
              </div>
            </form:form>
          </div>
    </div>
              </div>
          </div>

         
<!-- jQuery 3 -->
<script src="/admindrivease/resources/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="/admindrivease/resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="/admindrivease/resources/bower_components/fastclick/lib/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="/admindrivease/resources/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="/admindrivease/resources/dist/js/demo.js"></script>
<%@ include file="adminfooter.jsp" %>
</body>
</html>
    