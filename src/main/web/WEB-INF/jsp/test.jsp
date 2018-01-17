<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/16
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table align="center">

    <tr style="background-color: aquamarine">
        <td>酒店名称</td>
        <td>地址</td>
        <td>图片地址</td>
        <td>房间价格</td>
    </tr>

    <c:forEach items="${pageInfo.list}" var="list" varStatus="v">
        <tr <c:if test="${v.index %2 == 0}">style="background-color:greenyellow;"</c:if>>
            <td>${list.hotelName}</td>
            <td>${list.address}</td>
            <td>${list.itripImage.imgUrl}</td>
            <td>${list.itripHotelRoom.roomPrice}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
