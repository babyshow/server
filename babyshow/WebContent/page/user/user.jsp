<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>BabyShow运营管理系统</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="<%=basePath%>css/babyshow/style_first.css">
<link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css">
<link rel="stylesheet" href="<%=basePath%>css/bootstrap-responsive.min.css">
<!-- Bootstrap CSS fixes for IE6 -->
<!--[if lt IE 7]>
<link rel="stylesheet" href="<%=basePath%>css/bootstrap/bootstrap-ie6.min.css">
<![endif]-->
<link rel="stylesheet" href="<%=basePath%>css/babyshow/style.css">
<link rel="stylesheet" href="<%=basePath%>css/upload/blueimp-gallery.min.css">
<link rel="stylesheet" href="<%=basePath%>css/upload/jquery.fileupload-ui.css">
<link rel="stylesheet" href="<%=basePath%>css/jquery/jquery-ui.css">
<noscript><link rel="stylesheet" href="<%=basePath%>css/upload/jquery.fileupload-ui-noscript.css"></noscript>
<script src="<%=basePath%>js/jquery/jquery-1.10.1.min.js"></script>
<script src="<%=basePath%>js/bootstrap/bootstrap-paginator.js"></script>
</head>
<body>
	<div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid">
                <a data-target=".nav-collapse" data-toggle="collapse"
                    class="btn btn-navbar"> <span class="icon-bar"></span> <span
                    class="icon-bar"></span> <span class="icon-bar"></span>
                </a>
                <a href="#" class="brand">Babyshow</a>
                <div class="nav-collapse">
                    <ul class="nav">
                        <li class="active"><a href="<%=basePath%>rest/mock/user">增加喜欢次数</a></li>
                        <li><a href="<%=basePath%>rest/mock/upload">mock用户数据</a></li>
                    </ul>
                    <ul class="nav pull-right">
                        <li id="accountmenu" class="dropdown"><a href="#"
                            data-toggle="dropdown" class="dropdown-toggle">用户<b
                                class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">help</a></li>
                                <li class="divider"></li>
                                <li><a href="<%=basePath%>rest/signout">退出</a></li>
                            </ul></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <div class="menu-head">
        <div class="container-fluid">
            <ul class="nav nav-tabs">
                <li class="active"><a href="#">功能</a></li>
                <li class="dropdown"><a href="#" data-toggle="dropdown"
                    class="dropdown-toggle">备用<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Something else here</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <div class="container-fluid">
		<div class="row-fluid">
		      <div class="span3">
                <ul class="nav nav-tabs nav-stacked">
                    <li class="active"><a href="<%=basePath%>rest/mock/user">增加喜欢次数</a></li>
                    <li><a href="<%=basePath%>rest/mock/upload">mock用户数据</a></li>
                    <li><a href="#">Comments <span
                            class="pull-right badge badge-important">4</span></a></li>
                    <li><a href="#">Messages <span
                            class="pull-right badge badge-info">4</span></a></li>
                    <li><a href="#">Members <span
                            class="pull-right badge badge-warning">4</span></a></li>
                    <li><a href="#">Orders <span
                            class="pull-right badge badge-success">4</span></a></li>
                </ul>
                <ul class="nav nav-tabs nav-stacked">
                    <li><a href="#">Chart</a></li>
                    <li><a href="#">Blank</a></li>
                    <li><a href="#">Sign in</a></li>
                    <li><a href="#">404</a></li>
                </ul>
            </div>
		
			<div class="span9">
				<div class="row-fluid">
					<div class="span12 box">
						<div class="box-header">
							<h3>
								<i class="icon-comment"></i> Comments
							</h3>
						</div>
						<div class="box-content">
						<div class="content-inner">
							<form class="form-search" action="<%=basePath%>rest/mock/user">
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
										<th><label class="checkbox"> <input
												type="checkbox" value="">全选
										</label></th>
										<th>用户ID</th>
										<th>用户状态</th>
										<th>设备ID</th>
										<th>注册序号</th>
										<th>照片被喜欢总次数</th>
										<th>照片被修改次数</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${userList}" var="user">
										<tr>
											<td><label class="checkbox"> <input
													type="checkbox" value="">选择
											</label></td>
											<td>${user.userCode}</td>
											<td>${user.status}</td>
											<td>${user.deviceID}</td>
											<td>${user.regNum}</td>
											<td></td>
											<td><a class="btn"
												href="<%=basePath%>rest/mock/user/${user.userCode}/image">查看图片</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							<div id="page">
			                </div>
                            </div>
							<!-- <div class="box-content"> end -->
						</div>
						<!-- <div class="span12 box"> end -->
					</div>
					<!-- <div class="row-fluid"> end -->
				</div>

			</div>
		</div>
	</div>
	
    <script type='text/javascript'>
        var options = {
            currentPage: ${page.curPage},
            totalPages: ${page.totalPages},
            alignment:'right',
            itemTexts: function (type, page, current) {
                switch (type) {
                case "first":
                    return "首页";
                case "prev":
                    return "上一页";
                case "next":
                    return "下一页";
                case "last":
                    return "末页";
                case "page":
                    return page;
                }
            },
            pageUrl: function(type, page, current){
                return "<%=basePath%>rest/mock/user/"+page;
            }
            
        }

        $('#page').bootstrapPaginator(options);
    </script>
    <script src="<%=basePath%>js/bootstrap/bootstrap-dropdown.js"></script>
    <script src="<%=basePath%>js/babyshow/dropdown.js"></script>
</body>
</html>
