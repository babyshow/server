<%@ page language="java" contentType="text/html; utf-8"  pageEncoding="utf-8"%>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="utf-8">
    <title>BabyShow运营管理系统——登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Le styles -->
    <link href="<%=basePath%>css/bootstrap/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 40px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
      }

      .form-signin {
        max-width: 300px;
        padding: 19px 29px 29px;
        margin: 0 auto 20px;
        background-color: #fff;
        border: 1px solid #e5e5e5;
        -webkit-border-radius: 5px;
           -moz-border-radius: 5px;
                border-radius: 5px;
        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                box-shadow: 0 1px 2px rgba(0,0,0,.05);
      }
      .form-signin .form-signin-heading,
      .form-signin .checkbox {
        margin-bottom: 10px;
      }
      .form-signin input[type="text"],
      .form-signin input[type="password"] {
        font-size: 16px;
        height: auto;
        margin-bottom: 15px;
        padding: 7px 9px;
      }

    </style>

    <!-- Fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="<%=basePath%>assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="<%=basePath%>assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="<%=basePath%>assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="<%=basePath%>assets/ico/apple-touch-icon-57-precomposed.png">
    <link rel="shortcut icon" href="<%=basePath%>assets/ico/favicon.png">
  </head>

  <body>

    <div class="container">

      <form class="form-signin" action="<%=basePath%>rest/signin" method="post">
        <h2 class="form-signin-heading">登  录</h2>
        <input type="text" name="username" class="input-block-level" placeholder="帐号">
        <input type="password" name="password" class="input-block-level" placeholder="密码">
        <h5>${message}</h5>
        <label class="checkbox">
          <input type="checkbox" value="remember-me">下次自动登录
        </label>
        <button class="btn btn-large btn-primary" type="submit">确认登录</button>
      </form>

    </div> 

  </body>
</html>
