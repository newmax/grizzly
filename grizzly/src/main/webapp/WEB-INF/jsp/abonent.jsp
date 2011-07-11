<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Abonent</title>
</head>
<body>

	<c:if test="${ abonent != null }">
	<div id="AbonentInfo">
	    <h3>Abonent:</h3>
        <table border="2" width="100%">
	    <tr><th width=150>account</th>
	    	<td><c:out value="${abonent.account}"/> </td>
	    </tr>
	    <tr><th>name</th>
			<td><c:out value="${abonent.name}"/> </td>
        </tr>
        <tr>        
        	<th>user name</th>
        	<th>begin date</th>
        	<th>end date</th>
        </tr>       	
        
        <c:forEach var="user" items="${abonent.users}" varStatus="i">
        
        <tr>        
            <td><a href="${pageContext.request.contextPath}/user/${user.name}.html">
            	<c:out value="${user.name}"/></a></td>
            <td><c:out value="${user.beginDate}"/></td>
            <td><c:out value="${user.endDate}"/></td>
        </tr>
        
        </c:forEach>
        
        </table>
        </div> <!-- AbonentInfo -->
    </c:if>
</body>
</html>