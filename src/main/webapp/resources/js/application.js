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
