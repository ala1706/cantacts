function initEmployees(){

  $.ajax({
      url: "employees",
      type: "get",
      data:{action:"show_all"},
      success: function(response) {
        $("#content").html(response);
      }
  });
}

function addEmployee(){
  $.ajax({
      url: "employees",
      type: "get",
      data:{action:"new"},
      success: function(response) {
        $("#content").html(response);
      }
  });
}

function editEmployee(employeeIdValue){
  $.ajax({
      url: "employees",
      type: "get",
      data:{action:"edit",employeeId: employeeIdValue},
      success: function(response) {
        $("#content").html(response);
      }
  });

}
function removeEmployee(employeeIdValue){
  $.ajax({
      url: "employees",
      type: "get",
      data:{action:"remove",employeeId: employeeIdValue},
      success: function(response) {
        $("#content").html(response);
      }
  });

}

function initTeams(){
  $.ajax({
      url: "teams",
      type: "get",
      data:{action:"teams"},
      success: function(response) {
        $("#content").html(response);
      }
  });

}

function addTeam(){
  $.ajax({
      url: "teams",
      type: "get",
      data:{action:"newTeam"},
      success: function(response) {
        $("#content").html(response);
      }
  });
}

function removeTeam(teamIdValue){
  $.ajax({
      url: "teams",
      type: "get",
      data:{action:"removeTeam",teamId: teamIdValue},
      success: function(response) {
        $("#content").html(response);
        initTeams();
      }
  });

}

function editTeam(teamIdValue){
  $.ajax({
      url: "teams",
      type: "get",
      data:{action:"editTeam",teamId: teamIdValue},
      success: function(response) {
        $("#content").html(response);
      }
  });

}
// -------------------------

function initProjects(){
  $.ajax({
      url: "projects",
      type: "get",
      data:{action:"showProjects"},
      success: function(response) {
        $("#content").html(response);
      }
  });

}

function addProject(){
  $.ajax({
      url: "projects",
      type: "get",
      data:{action:"addProject"},
      success: function(response) {
        $("#content").html(response);

      }
  });

}

function editProject(projectIdValue){
  $.ajax({
      url: "projects",
      type: "get",
      data:{action:"editProject", projectId:projectIdValue},
      success: function(response) {
        $("#content").html(response);
      }
  });

}


function removeProject(projectIdValue){
  $.ajax({
      url: "projects",
      type: "get",
      data:{action:"removeProject", projectId:projectIdValue},
      success: function(response) {
        $("#content").html(response);
        initProjects();
      }
  });

}

function initReportsTeams(){
  $.ajax({
      url: "teams",
      type: "get",
      data:{action:"showReportsTeams"},
      success: function(response) {
        $("#content").html(response);
      }
  });

}