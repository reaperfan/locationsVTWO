<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employees</title>
</head>
<body>

<table>
    <tr><td>Name</td></tr>

    <c:forEach items="${locations}" var="location">
        <tr>
            <td>${location.getName()}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>