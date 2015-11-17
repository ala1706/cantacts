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

function editEmployee(){


var checks= $(".employeeIdCheckbox");

for(var i=0; i<checks.length; i++){

	if(checks[i].checked){
		var checkedId = checks[i].value;
	}
}

  $.ajax({
      url: "employees",
      type: "get",
      data:{action:"edit",employeeId: checkedId},
      success: function(response) {
        $("#content").html(response);
      }
  });

}

function removeEmployee(){
var checks= $(".employeeIdCheckbox");

for(var i=0; i<checks.length; i++){

	if(checks[i].checked){
		var checkedId = checks[i].value;
	}
}

  $.ajax({
      url: "employees",
      type: "get",
      data:{action:"remove",employeeId: checkedId},
      success: function(response) {
        $("#content").html(response);
        location.reload();
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

function removeTeam(){
var checks= $(".employeeIdCheckbox");

for(var i=0; i<checks.length; i++){

	if(checks[i].checked){
		var checkedId = checks[i].value;
	}
}

  $.ajax({
      url: "teams",
      type: "get",
      data:{action:"removeTeam",teamId: checkedId},
      success: function(response) {
        $("#content").html(response);
        initTeams();
      }
  });

}

function editTeam(){
var checks= $(".employeeIdCheckbox");

for(var i=0; i<checks.length; i++){

	if(checks[i].checked){
		var checkedId = checks[i].value;
	}
}
  $.ajax({
      url: "teams",
      type: "get",
      data:{action:"editTeam",teamId: checkedId},
      success: function(response) {
        $("#content").html(response);
      }
  });

}
// -------------------------


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

function editProject(){
var checks= $(".employeeIdCheckbox");

for(var i=0; i<checks.length; i++){

	if(checks[i].checked){
		var checkedId = checks[i].value;
	}
}
  $.ajax({
      url: "projects",
      type: "get",
      data:{action:"editProject", projectId:checkedId},
      success: function(response) {
        $("#content").html(response);
      }
  });

}


function removeProject(){
var checks= $(".employeeIdCheckbox");

for(var i=0; i<checks.length; i++){

	if(checks[i].checked){
		var checkedId = checks[i].value;
	}
}
  $.ajax({
      url: "projects",
      type: "get",
      data:{action:"removeProject", projectId:checkedId},
      success: function(response) {
        $("#content").html(response);
        initProjects();
      }
  });

}