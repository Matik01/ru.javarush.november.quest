<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<link rel="stylesheet" type="text/css" href="main.css">
<h2>${story.getStoryText()}</h2>
<br>
<c:set var="count" scope="session" value="${story.getAnswerList().size()}"/>

<c:if test="${count == 2}">
<button onclick="window.location = '/logic?action=first&remove=two'">${story.getAnswerList().get(0).getAnswerText()}</button>
<br>
<button onclick="window.location = '/logic?action=second&remove=two'">${story.getAnswerList().get(1).getAnswerText()}</button>
<br>
</c:if>

<c:if test="${count == 1}">
    <button onclick="window.location = '/logic?action=first&remove=one'">${story.getAnswerList().get(0).getAnswerText()}</button>
</c:if>
<br>

</body>
</html>
