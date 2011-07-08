<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Abonent</title>
</head>
<body>
	    <div id="content">
	    <h3>Abonent:</h3>
        <table border="2" width="100%">
	    <tr><th width=150>account</th>
	    	<td><c:out value="${abonent.account}"/> </td>
	    </tr>
	    <tr><th>name</th>
			<td><c:out value="${abonent.name}"/> </td>
        </tr>
        <c:forEach var="user" items="${abonent.users}" varStatus="i">
        <tr>        
        	<th>user name</th>
            <td><a href="${pageContext.request.contextPath}/user/${user.name}.html">
            	<c:out value="${user.name}"/></a></td>
        </tr>
        </c:forEach>
        </table>
        </div> <!-- "content" -->
</body>
</html>