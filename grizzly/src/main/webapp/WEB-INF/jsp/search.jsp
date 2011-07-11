<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="SearchForm">
	<form:form action="${pageContext.request.contextPath}/search.html" 
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
        	<td><input type="reset" value="Reset"/></td>
	        
        	<td><input type="submit" value="Submit"
            	       onclick="document.findForm.action='${pageContext.request.contextPath}/search.html'"/></td>
		</tr>
		</table>
	</form:form>
	</div> <!-- SearchForm -->
</body>
</html>