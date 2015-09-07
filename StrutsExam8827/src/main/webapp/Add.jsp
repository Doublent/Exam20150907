<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>客户管理</title>
<link href="bootstrap.min.css" type="text/css" rel="stylesheet">
<style>
#nid {
	background-color: skyblue;
}

#aid {
	margin-top: 10px;
	margin-right: 10px;
	font-size: 20px;
}

#dd {
	background-size: 100% 100%;
	width: 100%;
	height: 100%;
	margin-right: -20px;
}

#ddiv {
	height: 40%;
	width: 100%;
	background-color: #fafafa;
}

#id2 {
	margin-left: -30px;
	height: 80%;
}

#iid {
	
}

#id10 {
	/* background-color: darkgray; */
	margin-bottom: 10px;
	height: 80%;
	background-size: 100% 100%;
}

#bid {
	background-color: skyblue;
	color: white;
	border-radius: 5px;
	font-size: 20px;
}

#mid {
	float: left;
	background-color: #eaeaea;
}

#tabid {
	float: right;
}
</style>
</head>
<body>
	<nav class="navbar navbar-default" role="navigation" id="nid">
	<div class="container-fluid">
		<div class="navbar-header">
			<h4>8827肖云龙</h4>
		</div>
		<div>
			<a id="aid" class="nav navbar-nav navbar-right" id="aid" href="#">Admin</a>
		</div>
	</div>
	</nav>

	<div id="dd" class="container">
		<div class="col-md-2" id="id2">
			<ul class="list-group affixed-element-top js-affixed-element-top">
				<li class="list-group-item"><a href="#">Dashboard</a></li>
				<li class="list-group-item"><a href="#">应用设置</a></li>
				<li class="list-group-item"><a href="#">管理设置</a></li>
				<li class="list-group-item"><a href="#">数据配置</a></li>
				<li class="list-group-item"><a href="#">主数据管理</a></li>
				<li class="list-group-item"><a href="#">客户订单管理</a></li>
				<li class="list-group-item"><a href="#">发货单管理</a></li>
			</ul>
		</div>
		<div class="col-md-10 js-content" id="id10"
			style="background-color: #eeeeee">
			<div>
				<h4>创建Customer</h4>
				<div class="col-md-12" style="background-color: #ffffff">
					<p>基本信息</p>
				</div>

			</div>
			<div>
				<div id="mid">

					<form action="#" method="post">
						<div id="ddiv">
							<div id="iid" class="col-md-12">
								<div class="col-md-2" id="iid">
									<font size="4">First Fame</font><font color="red">*</font>
								</div>
								<div class="col-md-10">
									<Input type=text name="firstname">
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-2">
									<font size="4">Last Name</font><font color="red">*</font>
								</div>
								<div class="col-md-10">
									<Input type=text name="lastname">
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-2">
									<font size="4">Email</font>
								</div>
								<div class="col-md-10">
									<Input type=text name="email">
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-2">
									<font size="4">Address</font><font color="red">*</font>
								</div>
								<div class="col-md-10">
									<Input type=text name="address">
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-2"></div>
								<div class="col-md-10">
									<Input type=submit value="新建" style="background-color: skyblue">
									<Input type="button" value="取消">
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<script src="jquery-2.1.1min.js"></script>
	<script src="bootstrap.min.js"></script>
</BODY>
</html>