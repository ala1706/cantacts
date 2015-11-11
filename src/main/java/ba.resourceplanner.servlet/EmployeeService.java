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

  public List<Employee> getNotAssignedEmployees(Integer teamId) {
    Query namedQuery = entityManager_.createQuery("select e from Employee e left join e.teams_ t where t.id_ <> :teamId");
    namedQuery.setParameter("teamId", teamId);
    return namedQuery.getResultList();
  }

  public void saveEmployee(Employee employee){
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
