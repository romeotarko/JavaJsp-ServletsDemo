<%--
  Created by IntelliJ IDEA.
  User: romeo
  Date: 8/21/20
  Time: 3:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Student table Demo</h2>
<hr>
<br>
   <table border="1">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email </th>
    </tr>

        <c:forEach var="tempstudent" item="${student_list}">
            <td>
                   <td> ${tempStudent.firstName} </td>
                   <td> ${tempStudent.lastName} </td>
                   <td> ${tempStudent}.email </td>
            </tr>
        </c:forEach>

   </table>
</body>
</html>
