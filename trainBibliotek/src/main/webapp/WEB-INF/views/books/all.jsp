<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>

</style>
<html>
<head>
    <title>All books</title>
</head>
<body>
<h1 class="table_dark">All books:</h1>
<table>
    <tr>
        <th>ISBN</th>
        <th>TITLE</th>
        <th>AUTHOR</th>
        <th>AVAILABLE</th>
    </tr>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>
                <c:out value="${book.isbn}"/>
            </td>
            <td>
                <c:out value="${book.title}"/>
            </td>
            <td>
                <c:out value="${book.author}"/>
            </td>
            <td>
                <c:out value="${book.avalable}"/>
            </td>
<%--            <td>--%>
<%--                <a href="${pageContext.request.contextPath}/drivers/delete?id=${driver.id}">DELETE</a>--%>
<%--            </td>--%>
        </tr>
    </c:forEach>
</table>
</body>
</html>
