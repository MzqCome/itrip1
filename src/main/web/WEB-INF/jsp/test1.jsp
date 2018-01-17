<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/16
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/hotel/queryAllByName?pageNum=1" method="post">
        <table align="center" border="1">
            <tr>
                <td>目的地</td>
                <td>
                    <input type="text" name="cityId"/>
                </td>
            </tr>
            <tr>
                <td>酒店名称、商圈、地址模糊查询</td>
                <td>
                    <input type="text" name="Name"/>
                </td>
            </tr>
            <tr>
                <td>驻点时间</td>
                <td>
                    <input type="date" name="checkInDate">
                </td>
                <td>离店时间</td>
                <td>
                    <input type="date" name="checkOutDate">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="搜索"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
