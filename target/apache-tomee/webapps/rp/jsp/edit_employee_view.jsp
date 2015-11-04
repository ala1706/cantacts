<div class="editEmployee">
<h2 style="border-bottom:1px solid; text-align: left; font-family:Helvetica Neu">Administration | Employees | Employees Informations</h2>
<div class="alert alert-danger" role="alert"><span class="glyphicon glyphicon-remove-circle"></span> Incorrect e-mail format!</div>
<form action="employees" method="POST" class="form1">
    <fieldset class="fs" style="margin-bottom:2%">
        <legend class="leg">Basic informations</legend>

            <input type="hidden" name="action" value="employee">
            <div style="float:left; width:100%; padding-left:0.4%">
                <div style="float:left; width:100%; margin-bottom:32px">
                            <div class="basicInformationsDiv">
                                 <label value="Title">Title: </label><br>
                                 <input name="title" type="text" value="${employee.title}">
                            </div>
                            <div class="basicInformationsDiv">
                                  <label value="First name">First name:</label><br>
                                  <input name="firstName" type="text" value="${employee.firstName}" required>
                            </div>
                            <div class="basicInformationsDiv">
                                  <label value="Last name">Last name:</label><br>
                                  <input name="lastName" type="text" value="${employee.lastName}" required>
                                  <input name="employeeId" type="hidden" value="${employee.id}">
                            </div>

                </div>
                <div style="float:left; width:100%">
                      <div class="basicInformationsDiv">
                            <label value="User ID">User ID:</label><br>
                            <input name="userId" type="text" value="${employee.id}">
                            <input name="employeeId" type="hidden" value="${employee.id}">
                      </div>
                      <div class="basicInformationsDiv">
                            <label value="Telephone">Telephone:</label><br>
                            <input name="telephone" type="text" value="${employee.telephone}">
                            <input name="employeeId" type="hidden" value="${employee.id}">
                      </div>
                      <div class="basicInformationsDiv">
                            <label value="E-mail">E-mail:</label><br>
                            <input name="email" type="text" value="${employee.email}" class="emailInput">
                            <input name="employeeId" type="hidden" value="${employee.id}">
                      </div>

                </div>

            </div>
    </fieldset>
    <fieldset class="fs" style="margin-bottom:2%">
            <legend class="leg" style="width:15%; min-width:218px;">Additional informations</legend>

                <div style="float:left; width:100%; padding-left:0.4%">
                    <div style="float:left; width:100%; margin-bottom:32px">
                                <div class="basicInformationsDiv">
                                     <label value="Date of birth">Date of birth: </label><br>
                                     <input class="datepicker" name="dateOfBirth" type="text" value="${employee.dateOfBirth}" >
                                </div>
                                <div class="basicInformationsDiv">
                                      <label value="Employed since">Employed since:</label><br>
                                      <input class="datepicker" name="employedSince" type="text" value="${employee.employedSince}">
                                </div>
                                <div class="basicInformationsDiv">
                                      <label value="Location">Location:</label><br>
                                      <input class="location" name="location" type="text" value="${employee.location}">
                                      <input name="employeeId" type="hidden" value="${employee.id}">
                                </div>

                    </div>
                    <div style="float:left; width:100%; margin-bottom:32px;">
                          <div class="basicInformationsDiv">
                                <label value="Street">Street:</label><br>
                                <input name="street" type="text" value="${employee.street}">
                                <input name="employeeId" type="hidden" value="${employee.id}">
                          </div>
                          <div class="basicInformationsDiv">
                                <label value="Place">Place:</label><br>
                                <input name="place" type="text" value="${employee.place}">
                                <input name="employeeId" type="hidden" value="${employee.id}">
                          </div>
                          <div class="basicInformationsDiv">
                                <label value="ZIP">ZIP:</label><br>
                                <input name="zip" type="text" value="${employee.zip}">
                                <input name="employeeId" type="hidden" value="${employee.id}">
                          </div>

                    </div>
                    <div style="float:left; width:100%">
                          <div class="basicInformationsDiv">
                                 <label value="Extern">Extern:</label><br>
                                 <input name="extern" type="text" value="${employee.extern}">
                                 <input name="employeeId" type="hidden" value="${employee.id}">
                          </div>
                          <div class="basicInformationsDiv">
                                 <label value="SVNR">SVNR:</label><br>
                                 <input name="svnr" type="text" value="${employee.svnr}">
                                 <input name="employeeId" type="hidden" value="${employee.id}">
                          </div>
                          <div class="basicInformationsDiv">
                                 <label value="Company ID">Company ID:</label><br>
                                 <input name="companyId" type="text" value="${employee.companyId}">
                                 <input name="employeeId" type="hidden" value="${employee.id}">
                          </div>

                    </div>
                    <div style="float:left; margin-top:2%; width:100%">
                        <label for="userRole">User roles: </label>
                        <input type="checkbox" name="userRole" class="userRole">Employee</input>
                        <input type="checkbox" name="userRole" class="userRole">Team leader</input>
                        <input type="checkbox" name="userRole" class="userRole">Project manager</input>
                    </div>

                </div>
        </fieldset>
    <div class="scd">
       <input type="submit" value="Save" class="save"></input>
       <input type="button" onClick="clearForm()" value="Clear" class="clear"></input>
       <input type="button" onClick="removeEmployee(${employee.id})" value="Delete" class="delete"></input>
     </div>
</form>
</div>
<script type="text/javascript" src="resources/js/edit_employee_view.js"></script>
