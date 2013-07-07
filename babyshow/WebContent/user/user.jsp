<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<!--[if IE]>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<![endif]-->
<meta charset="utf-8">
<title>增加喜欢次数</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="<%=basePath%>css/bootstrap/bootstrap.min.css">
<link rel="stylesheet"
	href="<%=basePath%>css/bootstrap/bootstrap-responsive.min.css">
<!-- Bootstrap CSS fixes for IE6 -->
<!--[if lt IE 7]>
<link rel="stylesheet" href="<%=basePath%>css/bootstrap/bootstrap-ie6.min.css">
<![endif]-->
<link rel="stylesheet" href="<%=basePath%>css/babyshow/style.css">
<link rel="stylesheet"
	href="<%=basePath%>css/upload/blueimp-gallery.min.css">
<link rel="stylesheet"
	href="<%=basePath%>css/upload/jquery.fileupload-ui.css">
<link rel="stylesheet" href="<%=basePath%>css/jquery/jquery-ui.css">
<noscript>
	<link rel="stylesheet"
		href="<%=basePath%>css/upload/jquery.fileupload-ui-noscript.css">
</noscript>

</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a href="#" class="brand">Babyshow</a>
				<div class="nav-collapse collapse">
					<ul class="nav">
						<li class="active"><a href="#">增加喜欢次数</a></li>
						<li><a href="#about">mock用户数据</a></li>
						<li><a href="#contact">退出</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row-fluid">
			<div class="span12">
				<form class="form-search">
					<select>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
					</select>
					<button type="submit" class="btn">搜索</button>
				</form>
				<table class="table table-bordered">
					<thead>
						<tr>
							<th><label class="checkbox"> <input type="checkbox"
									value="">全选
							</label></th>
							<th>用户ID</th>
							<th>图片ID</th>
							<th>被喜欢次数</th>
							<th>修改次数</th>
							<th><form class="form-inline">
									<input class="input-small" type="text" placeholder="输入数字…">
									<button type="submit" class="btn">录入</button>
								</form></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><label class="checkbox"> <input type="checkbox"
									value="">选择
							</label></td>
							<td>00001</td>
							<td>300000</td>
							<td>41</td>
							<td>0</td>
							<td><form class="form-inline">
									<input class="input-small" type="text" placeholder="输入数字…">
									<button type="submit" class="btn">录入</button>
								</form></td>
						</tr>
						<tr>
							<td><label class="checkbox"> <input type="checkbox"
									value="">选择
							</label></td>
							<td>00001</td>
							<td>300000</td>
							<td>41</td>
							<td>0</td>
							<td><form class="form-inline">
									<input class="input-small" type="text" placeholder="输入数字…">
									<button type="submit" class="btn">录入</button>
								</form></td>
						</tr>
						<tr>
							<td><label class="checkbox"> <input type="checkbox"
									value="">选择
							</label></td>
							<td>00001</td>
							<td>300000</td>
							<td>41</td>
							<td>0</td>
							<td><form class="form-inline">
									<input class="input-small" type="text" placeholder="输入数字…">
									<button type="submit" class="btn">录入</button>
								</form></td>
						</tr>
						<tr>
							<td><label class="checkbox"> <input type="checkbox"
									value="">选择
							</label></td>
							<td>00001</td>
							<td>300000</td>
							<td>41</td>
							<td>0</td>
							<td><form class="form-inline">
									<input class="input-small" type="text" placeholder="输入数字…">
									<button type="submit" class="btn">录入</button>
								</form></td>
						</tr>
					</tbody>
				</table>
				<div class="pagination pagination-right">
					<ul>
						<li><a href="#">上一页</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#">下一页</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
