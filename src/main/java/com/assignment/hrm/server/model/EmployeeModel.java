package com.assignment.hrm.server.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeModel {
    @Id
    @TableGenerator(name = "Emp_Gen",
                    table = "ID_GEN",
                    pkColumnName = "GEN_NAME",
                    valueColumnName = "GEN_VAL",
                    pkColumnValue = "Emp_Gen",
                    initialValue = 10000,
                    allocationSize = 100)
    @GeneratedValue(strategy = GenerationType.TABLE,
                    generator = "Emp_Gen")
    private Long employeeCode;
    private String employeeName;
    private String location;
    private String email;
    private String dateOfBirth;

    public EmployeeModel() {
    }

    public EmployeeModel(Long employeeCode, String employeeName, String location, String email, String dateOfBirth) {
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.location = location;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(Long employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
