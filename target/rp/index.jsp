<html>
  <head>
    <link rel="stylesheet" type="text/css" href="resources/css/main.css">
    <link rel="stylesheet" type="text/css" href="resources/css/font-awesome.css">
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="resources/css/jquery-ui.min.css">

    <script type="text/javascript" src="resources/js/edit_employee_view.js"></script>

    <script type="text/javascript" src="resources/js/jquery.js"></script>
    <script type="text/javascript" src="resources/js/jquery-ui.min.js"></script>
    <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>

    <script type="text/javascript" src="resources/js/application.js"></script>

  </head>
  <body>
      <div class="logo"><img src="logo.png"/></div>
      <div class="uno">
         <div class="menu">
            <ul>
              <li class="reports">Reports</li>
              <li onClick="initReportsTeams()"><i class="fa fa-search"></i> Teams</li>
              <li><i class="fa fa-search"></i> Projects</li>
              <li><i class="fa fa-search"></i> Utilization</li>
              <li class="administration">Administration</li>
              <li class="employeesLi" onClick="initEmployees()"><i class="fa fa-user"></i> Employees</li>
              <li onClick="initTeams()"><i class="fa fa-cog"></i> Teams</li>
              <li onClick="initProjects()"><i class="fa fa-file-o"></i> Projects</li>
            </ul>
         </div>
        <div id="content">
          <center>
              <div class="loader">
                <img src="resources/images/loading.gif" style="position:relative; top:25%"/>
               </div>
           </center>
        </div>
      </div>

      <script>
        initEmployees();
      </script>
  </body>
</html>
