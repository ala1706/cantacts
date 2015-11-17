package ba.resourceplanner.servlet;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by aalicic on 25.10.2015.
 */
@Stateless
public class EmployeeService {

  @PersistenceContext
  private EntityManager entityManager_;

  public List<Employee> getAllEmployees() {
    Query namedQuery = entityManager_.createQuery("select e from Employee e");
    return namedQuery.getResultList();
  }

  public void saveEmployee(Integer employeeId, String firstName, String lastName, String email, String telephone, String title, String dateOfBirth, String employedSince, String location,
                           String street, String place, String zip, String extern, String svnr, String companyId, Boolean teamLeaderUserRole, Boolean projectManagerUserRole){

    Employee employee = new Employee();
    employee.setId(employeeId);
    employee.setFirstName(firstName);
    employee.setLastName(lastName);
    employee.setEmail(email);
    employee.setTelephone(telephone);
    employee.setTitle(title);
    employee.setDateOfBirth(dateOfBirth);
    employee.setEmployedSince(employedSince);
    employee.setLocation(location);
    employee.setStreet(street);
    employee.setPlace(place);
    employee.setZip(zip);
    employee.setExtern(extern);
    employee.setSvnr(svnr);
    employee.setCompanyId(companyId);
    employee.setTeamLeaderCheck(teamLeaderUserRole);
    employee.setProjectManagerCheck(projectManagerUserRole);

    if(employee.getId()==null){
      entityManager_.persist(employee);
    }else{
      entityManager_.merge(employee);
    }
  }

  public String deleteEmployee(String employeeId) {
    Employee employee = entityManager_.find(Employee.class, employeeId);
    if (employee != null) {
      entityManager_.remove(employee);
    }
    return "/rp";
  }

  public Employee getEmployee(Integer employeeId) {
    Query namedQuery = entityManager_.createQuery("select e from Employee e where e.id = :id");
    namedQuery.setParameter("id", employeeId);
    return (Employee) namedQuery.getSingleResult();
  }
}
