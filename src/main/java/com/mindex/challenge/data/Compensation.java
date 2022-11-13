package com.mindex.challenge.data;

public class Compensation {

    private String employeeId;
    private int salary;
    private String effectiveDate;

    public Compensation(){

    }

    public Compensation(String employeeId, int salary, String effectiveDate){

        this.employeeId = employeeId;
        this.salary = salary;
        this.effectiveDate = effectiveDate;
    }

    public void setEmployee(String e){
        this.employeeId = e;
    }
    public String getEmployee(){
        return this.employeeId;
    }
    public void setSalary(int sal){
        this.salary = sal;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setEffectiveDate(String date){
        this.effectiveDate = date;
    }
    public String getEffectiveDate(){
        return this.effectiveDate;
    }


}
