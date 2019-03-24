package com.cwhcode.springbootex06;

/* Create a Java bean for the employee data */

public class Employee {

    //Declare private variables for first & last name
    //and for SSN and DOB.

    private String fn;
    private String ln;
    private String ssn;
    private String dob;

    //Generate a default constructor

    public Employee() {
    }

    //Generate getters and setters

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
