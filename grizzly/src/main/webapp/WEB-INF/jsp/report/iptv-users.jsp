<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IPTV Users</title>
</head>
<body>
	<div id="SearchForm">
	<form:form action="${pageContext.request.contextPath}/report/user/iptv.html" 
	           modelAttribute="abonentDto" 
	           method="POST"
               onsubmit="this.getAttribute('submitted')" 
               name="findForm"> <!--Block multiple form submissions-->
	
		<form:label path="account">Account</form:label>
		<form:input path="account"/>
		<form:errors path="account"/>
	
		<c:if test="${ error != null }">
			<div style="margin: 10px; color: #e43131"><c:out value="${error}"/></div>
		</c:if>
		
		<table>
		<tr>
	    	<td><a href="${pageContext.request.contextPath}/report/user/iptv.html">Reset</a></td>
	        
        	<td><input type="submit" value="Submit"
            	       onclick="document.findForm.action='${pageContext.request.contextPath}/report/user/iptv.html'"/></td>
		</tr>
		</table>
	</form:form>
	</div> <!-- SearchForm -->
	
	<c:if test="${ abonent != null }">
	<div id="UserInfo">
	<table>
	<tr>
		<th>Account</th>
		<th>Login</th>
		<th>Password</th>
	</tr>
	<c:forEach var="user" items="${abonent.users}">
		<c:if test="${ user.endDate == null }">
			<c:forEach var="service" items="${user.services}">
				<c:if test="${ service.status == 'ON' && service.type == 'IPTV' }">
	<tr>
		<td><c:out value="${abonent.account}"></c:out></td>
		<td><c:out value="${service.login}"></c:out></td>
		<td><c:out value="${service.password}"></c:out></td>
	</tr>
				</c:if>
			</c:forEach>
		</c:if>
	</c:forEach>
	</table>
	</div> <!-- UserInfo -->
	</c:if>

</body>
</html>