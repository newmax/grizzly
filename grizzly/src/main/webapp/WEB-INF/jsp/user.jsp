<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User</title>
</head>
<body>
	    <div id="content">
	    <h3>User: <c:out value="${user.name}"/></h3>
        <table border="2" width="100%">
	    <tr><th>type</th>
			<th>login</th>
			<th>password</th>
			<th>status</th>
        </tr>
        <c:forEach var="service" items="${user.services}" varStatus="i">
        <tr>        
            <td><c:out value="${service.type}"/></td>
            <td><c:out value="${service.login}"/></td>
            <td><c:out value="${service.password}"/></td>
            <td><c:out value="${service.status}"/></td>
        </tr>
        </c:forEach>
        </table>
        </div> <!-- "content" -->
</body>
</html>