<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login or Enter Patient ID</title>
</head>
<body>
    <h1>Login or Enter Patient ID</h1>
    <form action="processFormServlet" method="POST">
        <label for="option">Select an option:</label>
        <select id="option" name="option">
            <option value="staffLogin">Staff Login</option>
            <option value="enterPatientID">Enter Patient ID</option>
        </select><br><br>

        <div id="staffLogin" style="display: none;">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username"><br><br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password"><br><br>
        </div>

        <div id="enterPatientID" style="display: none;">
            <label for="patientId">Patient ID:</label>
            <input type="text" id="patientId" name="patientId"><br><br>
        </div>

        <input type="submit" value="Submit">
    </form>

    <% if ("enterPatientID".equals(request.getParameter("option"))) { %>
        <% response.sendRedirect("enterPatientID.jsp"); %>
    <% } %>
</body>
</html>







