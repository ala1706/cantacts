<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table border="1">
<c:forEach var="employee" items="${employees}">
<tr>
  <td><a onClick="editEmployee(${employee.id})" value"edit">${employee.id}</a></td>
  <td>${employee.firstName}</td>
  <td>${employee.lastName}</td>
</tr>
</c:forEach>
</table>