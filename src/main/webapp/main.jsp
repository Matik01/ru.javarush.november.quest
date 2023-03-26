<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="quest.database.Story" %>
<html>
<body>
<link rel="stylesheet" type="text/css" href="main.css">
<h2>${story.getStoryText()}</h2>
<br>
<c:set var="count" scope="session" value="${}"/>
<button onclick="window.location = '/logic?action=first'">${story.getAnswerList().get(0).getAnswerText()}</button>
<br>
<button onclick="window.location = '/logic?action=second'">${story.getAnswerList().get(1).getAnswerText()}</button>
<br>
</body>
</html>
