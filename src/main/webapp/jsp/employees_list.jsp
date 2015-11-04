<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="table">
	<h2 style="border-bottom:1px solid; text-align: left; font-family:Helvetica Neu">Administration|Employees</h2>
		<table class="tableFilter">
			<tr>
				<td colspan="6">
				</td>
			</tr>

			<tr>
				<th><input type="checkbox" id="mainCheck"></th>
				<th style="text-align:center; ">Id <i class="fa fa-sort"></i><br><input type="text" class="filterSearchInput"></th>
				<th style="text-align:center">First name <i class="fa fa-sort"></i><br><input type="text" class="filterSearchInput"></th>
				<th style="text-align:center">Last name <i class="fa fa-sort"></i><br><input type="text" class="filterSearchInput"></th>
				<th style="text-align:center">E-mail <i class="fa fa-sort"></i><br><input type="text" class="filterSearchInput"></th>
				<th style="text-align:center">Telephone <i class="fa fa-sort"></i><br><input type="text" class="filterSearchInput"></th>
			</tr>

            <c:forEach var="employee" items="${employees}">
			<tr class="hoverRow"  onClick="editEmployee(${employee.id})">
				<td><input type="checkbox"></input></td>
				<td class="contact" value"edit">${employee.id}</td>
				<td class="contact">${employee.firstName}</td>
				<td class="contact">${employee.lastName}</td>
				<td class="contact">${employee.email}</td>
				<td class="contact">${employee.telephone}</td>
			</tr>
			</c:forEach>
			<tr><td colspan="6"></td></tr>
        </table>
</div>
 <script>
    $(document).ready(function(){
    $('#mainCheck').change(function () {
        if($(this).prop('checked')){
            $('tbody tr td input[type="checkbox"]').each(function(){
                $(this).prop('checked', true);
            });
        }else{
            $('tbody tr td input[type="checkbox"]').each(function(){
                $(this).prop('checked', false);
            });
        }
    });
    });
    </script>

<script>
$(document).ready(function(){
  $(".filterSearchInput").keyup(function () {
      //split the current value of searchInput
      var data = this.value.split(" ");
      //create a jquery object of the rows
      var jo = $(".tableFilter").find(".hoverRow");
      if (this.value == "") {
          jo.show();
          return;
      }
      //hide all the rows
      jo.hide();

      //Recusively filter the jquery object to get results.
      jo.filter(function (i, v) {
          var $t = $(this);
          for (var d = 0; d < data.length; ++d) {
              if ($t.is(":contains('" + data[d] + "')")) {
                  return true;
              }
          }
          return false;
      })
      //show the rows that match.
      .show();
  }).focus(function () {
      this.value = "";
      $(this).css({
          "color": "black"
      });
      $(this).unbind('focus');
  }).css({
      "color": "#C0C0C0"
  });
  });
</script>

