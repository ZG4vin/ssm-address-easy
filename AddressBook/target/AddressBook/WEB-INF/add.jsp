<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/operation/add" method="post">
        <input type="hidden" value="${person.id}" name="id">
        姓名:<input type="text" name="name" value="${person.name}"><br/>
        手机号:<input type="text" name="phone" value="${person.phone}"><br/>
        地址:<input type="text" name="address" value="${person.address}"><br/>
        <input type="submit" value="添加/修改">
    </form>
</body>
</html>
