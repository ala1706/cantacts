package ba.resourceplanner.servlet;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String firstName;

  private String lastName;

  private String email;

  private String telephone;

  private String title;

  private String dateOfBirth;

  private String employedSince;

  private String location;

  private String street;

  private String place;

  private String zip;

  private String extern;

  private String svnr;

  private String companyId;

  private Boolean teamLeaderCheck;

  private Boolean projectManagerCheck;

  @ManyToMany
  private List<Team> teams=new ArrayList<Team>();


  @ManyToMany
  private List<Project> projects=new ArrayList<Project>();



  public Employee(String id, String firstName, String lastName, String email, String telephone, String title, String dateOfBirth, String employedSince,
                  String location, String street, String place, String zip, String extern, String svnr, String companyId, Boolean teamLeaderCheck, Boolean projectManagerCheck ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.telephone = telephone;
    this.title = title;
    this.dateOfBirth = dateOfBirth;
    this.employedSince = employedSince;
    this.location = location;
    this.street = street;
    this.place = place;
    this.zip = zip;
    this.extern = extern;
    this.svnr = svnr;
    this.companyId = companyId;
    this.teamLeaderCheck = teamLeaderCheck;
    this.projectManagerCheck = projectManagerCheck;
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getEmployedSince() {
    return employedSince;
  }

  public void setEmployedSince(String employedSince) {
    this.employedSince = employedSince;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getExtern() {
    return extern;
  }

  public void setExtern(String extern) {
    this.extern = extern;
  }

  public String getSvnr() {
    return svnr;
  }

  public void setSvnr(String svnr) {
    this.svnr = svnr;
  }

  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public List<Team> getTeams() {
    return teams;
  }

  public void setTeams(List<Team> teams_) {
    this.teams = teams_;
  }

  public Boolean getTeamLeaderCheck() {
    return teamLeaderCheck;
  }

  public void setTeamLeaderCheck(Boolean teamLeaderCheck) {
    this.teamLeaderCheck = teamLeaderCheck;
  }

  public Boolean getProjectManagerCheck() {
    return projectManagerCheck;
  }

  public void setProjectManagerCheck(Boolean projectManagerCheck) {
    this.projectManagerCheck = projectManagerCheck;
  }

  public List<Project> getProjects() {
    return projects;
  }

  public void setProjects(List<Project> projects) {
    this.projects = projects;
  }
}