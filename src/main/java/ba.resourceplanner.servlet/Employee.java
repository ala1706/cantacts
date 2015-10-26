package ba.resourceplanner.servlet;


import java.lang.String;

import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.*;

@Entity
public class Employee{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id_;

  private String firstName_;

  private String lastName_;

  public Employee(String id, String firstName, String lastName){
    this.firstName_ = firstName;
    this.lastName_ = lastName;
    if(id!=null && id!=""){
      this.id_ = Integer.parseInt(id);
    }
  }

  public String getFirstName() {
    return firstName_;
  }

  public void setFirstName(String firstName) {
    firstName_ = firstName;
  }

  public String getLastName() {
    return lastName_;
  }

  public void setLastName(String lastName) {
    lastName_ = lastName;
  }

  public Integer getId() {
    return id_;
  }

  public void setId(Integer id) {
    id_ = id;
  }
}