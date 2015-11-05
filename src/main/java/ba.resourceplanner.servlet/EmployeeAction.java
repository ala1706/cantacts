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
    httpServletRequest.setAttribute("employee", employeeService_.getEmployee(employeeId));
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
    Employee employee = new Employee(httpServletRequest.getParameter("employeeId"), httpServletRequest.getParameter("firstName"), httpServletRequest.getParameter("lastName"),
            httpServletRequest.getParameter("email"), httpServletRequest.getParameter("telephone"), httpServletRequest.getParameter("title"), httpServletRequest.getParameter("dateOfBirth"),
            httpServletRequest.getParameter("employedSince"), httpServletRequest.getParameter("location"), httpServletRequest.getParameter("street"), httpServletRequest.getParameter("place"),
            httpServletRequest.getParameter("zip"), httpServletRequest.getParameter("extern"), httpServletRequest.getParameter("svnr"), httpServletRequest.getParameter("companyId"));

    employeeService_.saveEmployee(employee);
    httpServletResponse.sendRedirect("/rp");
  }

}