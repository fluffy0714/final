<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.BufferedWriter" %>
<%@ page import="java.io.FileWriter" %>
<%@ page import="org.finalproject.finalproject.db.texts" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<h1><%= "Привет.Начало игры.Это всего лишь игра!" %>


</h1>
<br/>

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<div class="w3-container w3-teal">
<form method="get" action="hello-servlet">
    <br>
    <br>
    <br>
    Как тебя зовут? <input name="name" value="Yuriy">
    <br>
    <br>
    <br>
    <p><b><%=org.finalproject.finalproject.db.texts.First%></b></p>
<p><input type="radio" name="answer" value="a1"><%=org.finalproject.finalproject.db.texts.FirstFirst%><Br>
    <input type="radio" name="answer" value="a2"><%=org.finalproject.finalproject.db.texts.FirstDouble%><Br>
    <div class="w3-container">
    <p><input type="submit"></p>
    </div>
</form>
</div>
<br>
<br>
<br>
<br>
<br>
<br>
</body>
</html>