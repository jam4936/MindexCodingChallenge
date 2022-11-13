package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.NumReports;
import com.mindex.challenge.service.NumReportsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
@Service
public class NumreportsImpl implements NumReportsService {
    @Autowired
    private EmployeeRepository employeeRepository;

    private static final Logger LOG = LoggerFactory.getLogger(NumreportsImpl.class);

    public NumReports read(String id) {
        LOG.debug("Generating report structure with id [{}]", id);
        System.out.println("HELP ME");
        Employee employee = employeeRepository.findByEmployeeId(id);

        if (employee == null) {
            throw new RuntimeException("Invalid employeeId: " + id);
        }
        int count = 0;
        Queue<Employee> queue = new LinkedList<>(employee.getDirectReports());
        //Queue queue = (Queue)employee.getDirectReports().toArray();
        ArrayList<String> list = new ArrayList<>();
        list.add(employee.getEmployeeId());
        while(!queue.isEmpty()){
            Employee emp = (Employee) queue.remove();
            if(!list.contains(emp.getEmployeeId())){
                list.add(emp.getEmployeeId());
                if(emp.getDirectReports() != null){
                    for(Employee e: emp.getDirectReports()){
                        if(!list.contains(e.getEmployeeId())){
                            queue.add(e);
                        }
                    }
                }

                count++;
            }
        }
        return new NumReports(employee,count);
    }
}
