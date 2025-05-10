package com.spring.core.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service  
public class Logging{
    private static final Logger logger = LoggerFactory.getLogger(Logging.class);

    public void logEmployeeDetails(Employee employeeBean) {
        logger.info("Logging Employee Details: ID = " + employeeBean.getId() + ", Name = " + employeeBean.getName());
    }

    public void logDepartmentDetails(Department departmentBean) {
        logger.info("Logging Department Details: Department = " + departmentBean.getDepartmentName());
    }
}
