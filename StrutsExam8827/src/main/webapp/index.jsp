<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%-- <%@ page import="com.hand.bean.ShowByPage" %>
<jsp:useBean id="pageBean" class="com.hand.bean.ShowByPage" scope="session"/>
 --%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <title>客户管理</title>
  <link href="bootstrap.min.css" type="text/css" rel="stylesheet">
	<style>
		#nid{
			background-color: skyblue;
		}
		#aid{
			margin-top: 10px;
			margin-right: 10px;
			font-size: 20px;
		}
		#dd{
			background-size: 100% 100%;
			width: 100%;
			height: 100%;
			margin-right: -20px;
		}
		#id2{
			margin-left: -30px;
			height:80%;
		}
		#id10{
			/* background-color: darkgray; */
			margin-bottom: 10px;
			height:80%;
			background-size: 100% 100%;
		}
		#bid{
			background-color: skyblue;
			color: white;
			border-radius: 5px;
			font-size: 20px;
		}
		#mid{
			float: left;
			background-color: #EEEEEE;
		}
		#tabid{
			float: right;
		}
	
	</style>  	
</head>
<body >
	<nav class="navbar navbar-default" role="navigation" id="nid">
		<div class="container-fluid">
			<div class="navbar-header">
				<h4>8827肖云龙</h4>				
			</div>
			<div>
				<a id="aid" class="nav navbar-nav navbar-right" id="aid" href="#" >Admin</a>
			</div>
		</div>	
	</nav>
	
	<div id="dd" class="container">
		<div class="col-md-2" id="id2">
			<ul class="list-group affixed-element-top js-affixed-element-top">
				<li class="list-group-item"><a href="index.jsp">Customer管理</a></li>
				<li class="list-group-item"><a href="#">Film设置</a></li>
			</ul>			
		</div>
		<div class="col-md-10 js-content" id="id10" style="background-color: #eeeeee">
			<div>
				<h4>客户管理</h4>
				<div class="col-md-3"  style="background-color: #ffffff">
					<p>客户列表</p>
				</div>
				<div class="col-md-9"  style="background-color: #ffffff">
 					<a href="<%=path %>/add.do" id="bid" type="button" >新建</a>
<!--  					<a href="Add.jsp" id="bid" type="button" >新建</a>	
 -->				</div>
			</div>
			<div>
				<div id="mid">
					<table border=2>
						<tr>
							<th class="col-md-1">操作</th>
							<th class="col-md-1">FirstName</th>
							<th class="col-md-2">Last Name</th>
							<th class="col-md-2">Address</th>
							<th class="col-md-2">Email</th>
							<th class="col-md-2">CustomerId</th>
							<th class="col-md-2">LastUpdate</th>

						</tr>
					</table>
					
					<Table id="tabid">
						<tr>
							<td><FORM action="#" method=post>
									<Input
										type=submit name="g" value="<">
								</FORM></td>
							<td><FORM action="#" method=post>
								<button type="button">1
								</button>
								</FORM></td>	
							<td><FORM action="#" method=post>
								<button type="button">2
							</button>
								</FORM></td>
							<td><FORM action="#" method=post>
									<Input type=hidden name="showPage">
									<Input type=submit name="g" value=">">
								</Form></td>
							
						</tr>
					</Table>
				</div>
			</div>
		</div>
	</div>
  	
	<script src="jquery-2.1.1min.js"></script>
  <script src="bootstrap.min.js"></script>  
</BODY>
</html>