
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body style="text-align: center;">
<h1 >Welcome to Calculator</h1>

<form action="calc" method="post">
    <label>
        Number 1:
        <input type="text" name="a" value="${param.a}">
    </label>
    <br><br>

    <label>
        Number 2:
        <input type="text" name="b" value="${param.b}">
    </label>
    <br><br>

    <label>
        Operation:
        <select name="op">
            <option value="add">+</option>
            <option value="sub">-</option>
            <option value="mul">*</option>
            <option value="div">/</option>
        </select>
    </label>
    <br><br>

    <button type="submit">Calculate</button>
</form>

<hr/>

<%-- Show result if available --%>
<c:if test="${not empty result}">
    <h2>Result: ${result}</h2>
</c:if>

<c:if test="${not empty error}">
    <p> ${error}</p>
</c:if>

</body>
</html>

