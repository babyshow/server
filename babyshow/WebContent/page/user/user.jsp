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
<title>增加喜欢次数</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="<%=basePath%>css/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="<%=basePath%>css/bootstrap/bootstrap-responsive.min.css">
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
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a href="#" class="brand">Babyshow</a>
				<div class="nav-collapse collapse">
					<ul class="nav">
						<li class="active"><a href="<%=basePath%>rest/mock/user">增加喜欢次数</a></li>
						<li><a href="<%=basePath%>rest/mock/upload">mock用户数据</a></li>
						<li><a href="#contact">退出</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row-fluid">
			<div class="span12">
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
							<th><label class="checkbox"> <input type="checkbox"
									value="">全选
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
							<td><label class="checkbox"> <input type="checkbox"
									value="">选择
							</label></td>
							<td>${user.userCode}</td>
							<td>${user.status}</td>
							<td>${user.deviceID}</td>
							<td>${user.regNum}</td>
							<td></td>
                            <td><a class="btn" href="<%=basePath%>rest/mock/user/${user.userCode}/image">查看图片</a></td>
						  </tr>
					    </c:forEach>
					</tbody>
				</table>
				<div id="example">
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

        $('#example').bootstrapPaginator(options);
    </script>
</body>
</html>
