package ba.resourceplanner.servlet;


import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/employees")
public class EmployeeAction extends HttpServlet{

  @EJB
  private EmployeeService employeeService_;

  @Override
  protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

    String returnUrl=null;
    if("new".equals(httpServletRequest.getParameter("action"))){
      returnUrl = initNewEmployee();
    }else if("edit".equals(httpServletRequest.getParameter("action"))){
      returnUrl = editEmployee(httpServletRequest, httpServletRequest.getParameter("employeeId"));
    }else if("show_all".equals(httpServletRequest.getParameter("action"))){
      returnUrl= showAll(httpServletRequest);
    }else if("remove".equals(httpServletRequest.getParameter("action"))) {
      returnUrl = removeEmployee(httpServletRequest, httpServletRequest.getParameter("employeeId"));
    }

    httpServletRequest.getRequestDispatcher(returnUrl).forward(httpServletRequest,httpServletResponse);
  }

  private String showAll(HttpServletRequest httpServletRequest) {
    httpServletRequest.setAttribute("employees", employeeService_.getAllEmployees());
    return "jsp/employees_list.jsp";
  }

  private String editEmployee(HttpServletRequest httpServletRequest, String employeeId) {
    httpServletRequest.setAttribute("employee", employeeService_.getEmployee(Integer.parseInt(employeeId)));
    return "jsp/edit_employee_view.jsp";
  }

  private String removeEmployee(HttpServletRequest httpServletRequest, String employeeId) {
    httpServletRequest.setAttribute("employee", employeeService_.deleteEmployee(employeeId));
    return "jsp/employees_list.jsp";
  }

  private String initNewEmployee() {
    return "jsp/edit_employee_view.jsp";
  }

  @Override
  protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

    Integer employeeId = null;
    if(httpServletRequest.getParameter("employeeId")!=null & httpServletRequest.getParameter("employeeId")!=""){
      employeeId = Integer.valueOf(httpServletRequest.getParameter("employeeId"));
    }

      Boolean teamLeaderUserRole = Boolean.valueOf(httpServletRequest.getParameter("teamLeaderUserRole"));


      Boolean projectManagerUserRole = Boolean.valueOf(httpServletRequest.getParameter("projectManagerUserRole"));


    String firstName =  httpServletRequest.getParameter("firstName");
    String lastName =  httpServletRequest.getParameter("lastName");
    String email = httpServletRequest.getParameter("email");
    String telephone =  httpServletRequest.getParameter("telephone");
    String title = httpServletRequest.getParameter("title");
    String dateOfBirth = httpServletRequest.getParameter("dateOfBirth");
    String employedSince = httpServletRequest.getParameter("employedSince");
    String location = httpServletRequest.getParameter("location");
    String street = httpServletRequest.getParameter("street");
    String place = httpServletRequest.getParameter("place");
    String zip = httpServletRequest.getParameter("zip");
    String extern = httpServletRequest.getParameter("extern");
    String svnr = httpServletRequest.getParameter("svnr");
    String companyId = httpServletRequest.getParameter("companyId");


    employeeService_.saveEmployee(employeeId, firstName, lastName, email, telephone, title, dateOfBirth, employedSince, location, street, place, zip, extern, svnr, companyId, teamLeaderUserRole, projectManagerUserRole);
    httpServletResponse.sendRedirect("/rp");
  }

}