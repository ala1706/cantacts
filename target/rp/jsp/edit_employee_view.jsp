<div class="editEmployee">
<h2 style="border-bottom:1px solid; text-align: left; font-family:Helvetica Neu">Administration | Employees | Employees Informations</h2>
<div class="alert alert-danger" id="emailValidationAlert" role="alert"><span class="glyphicon glyphicon-remove-circle"></span> Incorrect e-mail format!</div>
<form action="employees" method="POST" class="form1">
    <fieldset class="fs" style="margin-bottom:2%">
        <legend class="leg">Basic informations</legend>

            <input type="hidden" name="action" value="employee">
            <div style="float:left; width:100%; padding-left:0.4%">
                <div style="float:left; width:100%; margin-bottom:32px">
                            <div class="basicInformationsDiv">
                                 <label value="Title">Title: </label><br>
                                 <input name="title" id="title" type="text" value="${employee.title}">
                            </div>
                            <div class="basicInformationsDiv">
                                  <label value="First name">First name:</label><br>
                                  <input name="firstName" id="firstName" type="text" value="${employee.firstName}" required>
                            </div>
                            <div class="basicInformationsDiv">
                                  <label value="Last name">Last name:</label><br>
                                  <input name="lastName" id="lastName" type="text" value="${employee.lastName}" required>
                                  <input name="employeeId" id="employeeId" type="hidden" value="${employee.id}">
                            </div>

                </div>
                <div style="float:left; width:100%">
                      <div class="basicInformationsDiv">
                            <label value="User ID">User ID:</label><br>
                            <input name="userId" type="text" value="${employee.id}">
                      </div>
                      <div class="basicInformationsDiv">
                            <label value="Telephone">Telephone:</label><br>
                            <input name="telephone" id="telephone" type="text" value="${employee.telephone}">
                      </div>
                      <div class="basicInformationsDiv">
                            <label value="E-mail">E-mail:</label><br>
                            <input name="email" id="email" type="text" value="${employee.email}" class="emailInput">
                      </div>

                </div>

            </div>
    </fieldset>
    <fieldset class="fs" style="margin-bottom:1%">
            <legend class="leg" style="width:15%; min-width:218px;">Additional informations</legend>

                <div style="float:left; width:100%; padding-left:0.4%">
                    <div style="float:left; width:100%; margin-bottom:32px">
                                <div class="basicInformationsDiv">
                                     <label value="Date of birth">Date of birth: </label><br>
                                     <input class="datepicker" id="dateOfBirth" name="dateOfBirth" type="text" value="${employee.dateOfBirth}" >
                                </div>
                                <div class="basicInformationsDiv">
                                      <label value="Employed since">Employed since:</label><br>
                                      <input class="datepicker" id="employedSince" name="employedSince" type="text" value="${employee.employedSince}">
                                </div>
                                <div class="basicInformationsDiv">
                                      <label value="Location">Location:</label><br>
                                      <input class="location" id="location" name="location" type="text" value="${employee.location}">
                                </div>

                    </div>
                    <div style="float:left; width:100%; margin-bottom:32px;">
                          <div class="basicInformationsDiv">
                                <label value="Street">Street:</label><br>
                                <input name="street" id="street" type="text" value="${employee.street}">
                          </div>
                          <div class="basicInformationsDiv">
                                <label value="Place">Place:</label><br>
                                <input name="place" id="place" type="text" value="${employee.place}">
                          </div>
                          <div class="basicInformationsDiv">
                                <label value="ZIP">ZIP:</label><br>
                                <input name="zip" id="zip" type="text" value="${employee.zip}">
                          </div>

                    </div>
                    <div style="float:left; width:100%">
                          <div class="basicInformationsDiv">
                                 <label value="Extern">Extern:</label><br>
                                 <input name="extern" id="extern" type="text" value="${employee.extern}">
                          </div>
                          <div class="basicInformationsDiv">
                                 <label value="SVNR">SVNR:</label><br>
                                 <input name="svnr" id="svnr" type="text" value="${employee.svnr}">
                          </div>
                          <div class="basicInformationsDiv">
                                 <label value="Company ID">Company ID:</label><br>
                                 <input name="companyId" id="companyId" type="text" value="${employee.companyId}">
                          </div>

                    </div>
                    <div style="float:left; margin-top:2%; width:100%">
                        <label for="userRole">User roles: </label>
                        <input type="checkbox" name="teamLeader"  value="${employee.teamLeaderCheck}" id="teamLeaderUserRole" class="userRole">Team leader </input>
                        <input type="checkbox" name="projectManager"  value="${employee.projectManagerCheck}" id="projectManagerUserRole" class="userRole">Project manager</input>
                    </div>

                </div>
        </fieldset>
    <div style="float:left; width:100%">
       <input id="saveEmployeeButton" type="button" onClick="saveEmployee()" value="Save" class="standard-button"></input>
       <input type="button" onClick="clearForm()" value="Clear" class="standard-button"></input>
       <input id="deleteEmployeeButton" type="button" onClick="removeEmployee(${employee.id})" value="Delete" class="standard-button"></input>
     </div>
</form>
</div>
<script type="text/javascript" src="resources/js/edit_employee_view.js"></script>
