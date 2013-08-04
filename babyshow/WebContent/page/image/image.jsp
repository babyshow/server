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
<title>用户照片</title>
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
<script src="<%=basePath%>js/jquery/jquery-migrate-1.2.1.js"></script>
<script src="<%=basePath%>js/bootstrap/bootstrap.min.js"></script>
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
    <div class="row">
        <div class="span12">
            <div class="page-header">
                <h1>
                                          用户<small>${user.userCode}</small>照片查看
                </h1>
            </div>
            <ul class="thumbnails">
            <c:forEach items="${imageList}" var="image">
                <li class="span4">
                    <div class="thumbnail">
                        <img alt="300x200" src="${image.url}" />
                        <div class="caption">
                            <h3>
                                ${image.imageCode}
                            </h3>
                            <p>
                                ${image.description}
                            </p>
                            <p>
                                <a href="#myModal" role="button" class="btn" data-toggle="modal" onclick="edit( '${image.likeCount}', '${image.imageCode}')">${image.likeCount}</a>
                            </p>
                            <p>
                                <a class="btn" href="#">分享</a>
                            </p>
                        </div>
                    </div>
                </li>
            </c:forEach>
            </ul>
        </div>
        
		<!-- Modal -->
		<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
			<h3 id="myModalLabel">增加喜欢次数</h3>
			</div>
			<div class="modal-body">
			<p>增加</p>
			    <input id="countInput" type="text" placeholder="增加喜欢次数…">
			    <input id="imageCode" type="hidden" >
			</div>
			<div class="modal-footer">
			<button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
			<button id="save" class="btn btn-primary">保存</button>
			</div>
		</div>
        
        
        <div id="page">
        </div>
    </div>
</div>
    
    <script type='text/javascript'>
	    function edit(count, imageCode){
	       $("#countInput").val(0);
	       $("#imageCode").val(imageCode);
	    }
	    $("#save").click(function(){
	    	var imageCode = $('#imageCode').attr("value");
	    	var count = $('#countInput').attr("value");
	    	$.post('<%=basePath%>rest/mock/image/' + imageCode + '/' + count , function() {
	    		$('#myModal').modal('hide');
	    	})
	   });
	    
	    
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
                return "<%=basePath%>rest/mock/user/${user.userCode}/image/"+page;
            }
            
        }

        $('#page').bootstrapPaginator(options);
    </script>
</body>
</html>
