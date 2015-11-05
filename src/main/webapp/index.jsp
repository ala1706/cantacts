<html>
  <head>
    <link rel="stylesheet" type="text/css" href="resources/css/main.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <script type="text/javascript" src="resources/js/jquery.js"></script>
    <script type="text/javascript" src="resources/js/edit_employee_view.js"></script>
    <script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="resources/js/application.js"></script>
    <script type="text/javascript" src="resources/js/jquery.tablesorter.js"></script>


    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

  </head>
  <body>
  <center>
  <div class="loader"><img src="resources/images/loading.gif" style="position:relative; top:25%"/></div>
  </center>
  <div class="logo"><img src="logo.png"/></div>
  <div class="uno">
     <div class="menu">
        <ul>
          <li class="reports">Reports</li>
          <li><i class="fa fa-search"></i> Teams</li>
          <li><i class="fa fa-search"></i> Projects</li>
          <li><i class="fa fa-search"></i> Utilization</li>
          <li class="administration">Administration</li>
          <li class="employeesLi" onClick="initEmployees()"><i class="fa fa-user"></i> Employees</li>
          <li onClick="initTeams()"><i class="fa fa-cog"></i> Teams</li>
          <li onClick="initProjects()"><i class="fa fa-file-o"></i> Projects</li>
        </ul>
     </div>
    <div id="content"></div>

    <div class="comands">
       <div class="buttonComands">
         <input class="new" type="button" onClick="addEmployee()" value="New"></input>
         <input class="edit" type="button" value="Edit" disabled></input>
         <input class="delete" type="button" value="Delete"></input>
         <input class="import" type="button" value="Import"></input>
       </div>
    </div>
  </div>

    <script>
      initEmployees();
      $(".employeesLi").click(function(){
        location.reload();
        $(".comands").hide();
      });
      $(".hoverRow").click(function(){
      $(this).toggleClass("active");
      });
    </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
  </body>
</html>

<script>
$(window).load(function() {
	$(".loader").fadeOut("slow");
})
</script>
<script>
    $(document).ready(function()
        {
            $(".tableFilter").tablesorter();
            $(".tableFilter").tablesorter( {sortList: [[0,0], [1,0]]} );
        }
    );
</script>
