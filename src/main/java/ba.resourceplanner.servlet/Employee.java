package ba.resourceplanner.servlet;


import java.lang.String;
import java.util.Date;

import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.*;

@Entity
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id_;

  private String firstName_;

  private String lastName_;

  private String email_;

  private String telephone_;

  private String title_;

  private String dateOfBirth_;

  private String employedSince_;

  private String location_;

  private String street_;

  private String place_;

  private String zip_;

  private String extern_;

  private String svnr_;

  private String companyId_;


  public Employee(String id, String firstName, String lastName, String email, String telephone, String title, String dateOfBirth, String employedSince, String location, String street, String place, String zip, String extern, String svnr, String companyId) {
    this.firstName_ = firstName;
    this.lastName_ = lastName;
    this.email_ = email;
    this.telephone_=telephone;
    this.title_ = title;
    this.dateOfBirth_ = dateOfBirth;
    this.employedSince_ = employedSince;
    this.location_ = location;
    this.street_ = street;
    this.place_ = place;
    this.zip_ = zip;
    this.extern_ = extern;
    this.svnr_ = svnr;
    this.companyId_ = companyId;
    if (id != null && id != "") {
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


  public String getEmail() {
    return email_;
  }

  public void setEmail(String email) {
    email_ = email;
  }

  public String getTelephone() {
    return telephone_;
  }

  public void setTelephone(String telephone) {
    telephone_ = telephone;
  }


  public String getTitle() {
    return title_;
  }

  public void setTitle(String title) {
    title_ = title;
  }

  public String getDateOfBirth() {
    return dateOfBirth_;
  }

  public void setDateOfBirth(String dateOfBirth) {
    dateOfBirth_ = dateOfBirth;
  }

  public String getEmployedSince() {
    return employedSince_;
  }

  public void setEmployedSince(String employedSince) {
    employedSince_ = employedSince;
  }

  public String getLocation() {
    return location_;
  }

  public void setLocation(String location) {
    location_ = location;
  }

  public String getStreet() {
    return street_;
  }

  public void setStreet(String street) {
    street_ = street;
  }

  public String getPlace() {
    return place_;
  }

  public void setPlace(String place) {
    place_ = place;
  }

  public String getZip() {
    return zip_;
  }

  public void setZip(String zip) {
    zip_ = zip;
  }

  public String getExtern() {
    return extern_;
  }

  public void setExtern(String extern) {
    extern_ = extern;
  }

  public String getSvnr() {
    return svnr_;
  }

  public void setSvnr(String svnr) {
    svnr_ = svnr;
  }

  public String getCompanyId() {
    return companyId_;
  }

  public void setCompanyId(String companyId) {
    companyId_ = companyId;
  }

}