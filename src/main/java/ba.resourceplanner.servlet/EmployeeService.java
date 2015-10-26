package ba.resourceplanner.servlet;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

  public void saveEmployee(Employee employee){
    if(employee.getId()==null){
      entityManager_.persist(employee);
    }else{
      entityManager_.merge(employee);
    }
  }

  public Employee getEmployee(String employeeId) {
    Query namedQuery = entityManager_.createQuery("select e from Employee e where e.id_ = :id");
    namedQuery.setParameter("id", Integer.parseInt(employeeId));
    return (Employee) namedQuery.getSingleResult();
  }
}
