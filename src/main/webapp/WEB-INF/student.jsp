    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <!DOCTYPE html>
    <html>
    <head>
    <title>Student Tables</title>
    </head>
    <body>
    <table border="5" style="width:100%">
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Gender</th>
        <tr>
        <c:forEach items="${students}" var="student">
            <tr>
                <td>${student.name}</td>
                <td>${student.age}</td>
                <td>${student.gender}</td>
            </tr>
        </c:forEach>
    </table>
    <form method="GET" action="student-info">
    <input type="Submit" value="Add new student"/>
    </body>
    </html>