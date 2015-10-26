package ba.resourceplanner.servlet;


import java.io.IOException;
import java.lang.Override;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

  private String initNewEmployee() {
    return "jsp/edit_employee_view.jsp";
  }

  @Override
  protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
    Employee employee = new Employee(httpServletRequest.getParameter("employeeId"), httpServletRequest.getParameter("firstName"), httpServletRequest.getParameter("lastName"));
    employeeService_.saveEmployee(employee);
    httpServletResponse.sendRedirect("/rp");
  }
}