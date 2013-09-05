<%@ page language="java" contentType="text/html; utf-8"  pageEncoding="utf-8"%>
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
<title>mock 后台</title>
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

</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container">
                <a href="#" class="brand">Babyshow</a>
                <div class="nav-collapse collapse">
                    <ul class="nav">
                        <li><a href="<%=basePath%>rest/mock/user">增加喜欢次数</a></li>
                        <li class="active"><a href="<%=basePath%>rest/mock/upload">mock用户数据</a></li>
                        <li><a href="<%=basePath%>rest/signout">退出</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    
<div class="container">
    <!-- The file upload form used as target for the file upload widget -->
    <form id="fileupload" action="<%=basePath%>rest/upload/" method="POST" enctype="multipart/form-data">
		<div class="page-header">
			<div class="row">
				<div class="span7">
					<span>用户ID：</span>
					<span>${usercode}</span>
				</div>
			</div>
		</div>
		<noscript><input type="hidden" name="redirect" value="<%=basePath%>rest/upload/"></noscript>
        <div class="row fileupload-buttonbar">
            <div class="span7">
                <span class="btn btn-success fileinput-button">
                    <i class="icon-plus icon-white"></i>
                    <span>选择照片</span>
                    <input type="file" name="files[]" multiple>
                </span>
                <button type="submit" class="btn btn-primary start">
                    <i class="icon-upload icon-white"></i>
                    <span>上传照片</span>
                </button>
                <button type="reset" class="btn btn-warning cancel">
                    <i class="icon-ban-circle icon-white"></i>
                    <span>取消上传</span>
                </button>
                <button type="button" class="btn btn-danger delete">
                    <i class="icon-trash icon-white"></i>
                    <span>删除照片</span>
                </button>
                <input type="checkbox" class="toggle">
                <span class="fileupload-loading"></span>
            </div>
            <div class="span5 fileupload-progress fade">
                <div class="progress progress-success progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100">
                    <div class="bar" style="width:0%;"></div>
                </div>
                <div class="progress-extended">&nbsp;</div>
            </div>
        </div>
        <table role="presentation" class="table table-bordered table-striped">
	        <tbody class="files">
	           <tr>
                   <th style="width: 10%">图片</th>
                   <th style="width: 12%">上传日期</th>
                   <th style="width: 15%">时间</th>
                   <th style="width: 8%">喜欢次数</th>
                   <th style="width: 25%">描述</th>
                   <th style="width: 10%">图片大小</th>
                   <th style="width: 20%">操作</th>
	           </tr>
	        </tbody>
        </table>
    </form>
</div>
<!-- The template to display files available for upload -->
<script id="template-upload" type="text/x-tmpl">
{% for (var i=0, file; file=o.files[i]; i++) { %}
    <tr class="template-upload fade">
        <td>
            <span class="preview"></span>
        </td>
        <td>
            <input type="hidden" name="usercode" required />
            <input class="datepicker" name="datetime" value="${defaultDateTime}" required />
        </td>
        <td>
            <input class="hourtime" name="hourtime" value="${defaultHourTime}" required />
        </td>
        <td>
            <input class="liketimes" name="liketimes" value="${defaultLikeTimes}" required />
        </td>
        <td>
            <textarea class="descritpion" name="descritpion" placeHolder="写点描述吧..." required />
        </td>
        <td>
            <p class="size">{%=o.formatFileSize(file.size)%}</p>
            {% if (!o.files.error) { %}
                <div class="progress progress-success progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="0"><div class="bar" style="width:0%;"></div></div>
            {% } %}
        </td>
        <td>
            {% if (!o.files.error && !i && !o.options.autoUpload) { %}
                <button class="btn btn-primary start">
                    <i class="icon-upload icon-white"></i>
                    <span>上传</span>
                </button>
            {% } %}
            {% if (!i) { %}
                <button class="btn btn-warning cancel">
                    <i class="icon-ban-circle icon-white"></i>
                    <span>取消</span>
                </button>
            {% } %}
        </td>
    </tr>
{% } %}
</script>
<!-- The template to display files available for download -->
<script id="template-download" type="text/x-tmpl">
{% for (var i=0, file; file=o.files[i]; i++) { %}
    <tr class="template-download fade">
        <td>
            <span class="preview">
                {% if (file.thumbnail_url) { %}
                    <a href="{%=file.url%}" title="{%=file.name%}" class="gallery" download="{%=file.name%}"><img src="{%=file.thumbnail_url%}"></a>
                {% } %}
            </span>
        </td>
        <td></td>
        <td></td>
        <td></td>
        <td>
            <p class="name">
                <a href="{%=file.url%}" title="{%=file.name%}" class="{%=file.thumbnail_url?'gallery':''%}" download="{%=file.name%}">{%=file.name%}</a>
            </p>
            {% if (file.error) { %}
                <div><span class="label label-important">上传发生错误</span> {%=file.error%}</div>
            {% } %}
        </td>
        <td>
            <span class="size">{%=o.formatFileSize(file.size)%}</span>
        </td>
        <td>
            <button class="btn btn-danger delete" data-type="{%=file.delete_type%}" data-url="{%=file.delete_url%}"{% if (file.delete_with_credentials) { %} data-xhr-fields='{"withCredentials":true}'{% } %}>
                <i class="icon-trash icon-white"></i>
                <span>Delete</span>
            </button>
            <input type="checkbox" name="删除" value="1" class="toggle">
        </td>
    </tr>
{% } %}
</script>
<script src="<%=basePath%>js/jquery/jquery-1.10.1.min.js"></script>
<!-- The jQuery UI widget factory, can be omitted if jQuery UI is already included -->
<script src="<%=basePath%>js/upload/jquery.ui.widget.js"></script>
<!-- The Templates plugin is included to render the upload/download listings -->
<script src="<%=basePath%>js/upload/tmpl.min.js"></script>
<!-- The Load Image plugin is included for the preview images and image resizing functionality -->
<script src="<%=basePath%>js/upload/load-image.min.js"></script>
<!-- blueimp Gallery script -->
<script src="<%=basePath%>js/upload/blueimp-gallery.min.js"></script>
<!-- The Iframe Transport is required for browsers without support for XHR file uploads -->
<script src="<%=basePath%>js/upload/jquery.iframe-transport.js"></script>
<!-- The basic File Upload plugin -->
<script src="<%=basePath%>js/upload/jquery.fileupload.js"></script>
<!-- The File Upload processing plugin -->
<script src="<%=basePath%>js/upload/jquery.fileupload-process.js"></script>
<!-- The File Upload image preview & resize plugin -->
<script src="<%=basePath%>js/upload/jquery.fileupload-image.js"></script>
<!-- The File Upload validation plugin -->
<script src="<%=basePath%>js/upload/jquery.fileupload-validate.js"></script>
<!-- The File Upload user interface plugin -->
<script src="<%=basePath%>js/upload/jquery.fileupload-ui.js"></script>
<!-- The XDomainRequest Transport is included for cross-domain file deletion for IE8+ -->
<!--[if gte IE 8]>
<script src="<%=basePath%>js/upload/cors/jquery.xdr-transport.js"></script>
<![endif]-->
<script src="<%=basePath%>js/jquery/jquery-ui.custom.js"></script>
<script src="<%=basePath%>js/jquery/jquery.ui.core.js"></script>
<script src="<%=basePath%>js/jquery/jquery.ui.datepicker-zh-TW.js"></script>
<!-- jquery日期选择 -->
<script src="<%=basePath%>js/babyshow/datepicker.js"></script>
<!-- The main application script -->
<script src="<%=basePath%>js/babyshow/mockupload.js"></script>
</body> 
</html>
