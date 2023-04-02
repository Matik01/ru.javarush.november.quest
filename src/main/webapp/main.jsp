<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<link type="text/css" rel="stylesheet" href="main.css">
<body>
<center>
<h2>${story.getStoryText()}</h2>
<br>
<c:set var="count" scope="session" value="${story.getAnswerList().size()}"/>

<c:if test="${count == 2}">
    <button class="button" onclick="window.location = '/logic?action=first'">First</button>
    ${story.getAnswerList().get(0).getAnswerText()}
    <br>
    <button class="button" onclick="window.location = '/logic?action=second'">Second</button>
    ${story.getAnswerList().get(1).getAnswerText()}
    <br>
</c:if>

<c:if test="${count == 0}">
    <button class="button" onclick="window.location = '/index.jsp?action=first'">RESTART</button>
</c:if>
</center>
<br>
<div class="div">
    <h>Statistics:</h>
    <br>
    SessionId: ${data.getName()}
    <br>
    Rounds: ${data.getRound()}
</div>


</body>
</html>
