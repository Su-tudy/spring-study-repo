<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>로그인 폼</h1>
<form action="/homework/login" method="post">
    이름: <input type="text" name="username" />
    나이:<input type="text" name="age" />
    <button type="submit">전송</button>
</form>
</body>
</html>