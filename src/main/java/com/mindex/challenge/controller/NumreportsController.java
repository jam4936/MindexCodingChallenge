package com.mindex.challenge.controller;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.NumReports;
import com.mindex.challenge.service.EmployeeService;
import com.mindex.challenge.service.NumReportsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NumreportsController {
    private static final Logger LOG = LoggerFactory.getLogger(NumreportsController.class);

    @Autowired
    private NumReportsService reportsService;

    @GetMapping("/reports/{id}")
    public NumReports read(@PathVariable String id) {
        LOG.debug("Received employee reporting request for id [{}]", id);

        return reportsService.read(id);
    }
}
