<form action="employees" method="POST">
  <table>
    <tr>
      <td>First name:</td>
      <td><input name="firstName" type="text" value="${employee.firstName}"></td>
    </tr>
    <tr>
      <td>Last name:</td>
      <td><input name="lastName" type="text" value="${employee.lastName}"></td>
      <td><input name="employeeId" type="hidden" value="${employee.id}"></td>
    </tr>
  </table>
  <input type="submit" value="Save">
  <button onClick="clearForm()">clear</button>
  <button onClick="deleteEmployee(${employee.id})">delete</button>
</form>