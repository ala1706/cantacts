<html>
  <head>
    <link rel="stylesheet" type="text/css" href="resources/css/main.css">
    <script type="text/javascript" src="resources/js/jquery.js"></script>
    <script type="text/javascript" src="resources/js/application.js"></script>
  </head>
  <body>
    <div class="menu">
      <ul>
        <li onClick="initEmployees()">All employees </li>
        <li onClick="addEmployee()">Add employee</li>
      </ul>
    </div>
    <div id="content" class="content"></div>

    <script>
      initEmployees();
    </script>
  </body>
</html>