package com.mindex.challenge.data;

public class NumReports {

    private Employee employee;
    private int numReports;


    public NumReports(){

    }
    public NumReports(Employee employee, int numReports){
        this.employee = employee;
        this.numReports = numReports;
    }

    public int getNumReports(){
        return this.numReports;
    }
    public void setNumReports(int numReports){
        this.numReports = numReports;
    }

    public Employee getEmployee(){
        return this.employee;
    }
    public void setEmployee(Employee employee){
        this.employee = employee;
    }

}
