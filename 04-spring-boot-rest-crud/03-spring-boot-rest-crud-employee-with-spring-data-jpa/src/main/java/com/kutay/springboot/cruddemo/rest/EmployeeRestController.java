package com.kutay.springboot.cruddemo.rest;

import com.kutay.springboot.cruddemo.entity.Employee;
import com.kutay.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.json.JsonMapper;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;
    private JsonMapper jsonMapper;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService, JsonMapper theJsonMapper) {
        this.employeeService = employeeService;
        this.jsonMapper = theJsonMapper;
    }

    @GetMapping("/employees")
    public List<Employee> findAll()
    {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId)
    {
        Employee theEmployee = employeeService.findById(employeeId);

        if(theEmployee == null)
        {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee)
    {
        //Just in case they pass an id in JSON ... set id to 0
        //If your Employee class has private int id then use .setId(0)
        //However, if have alternate coding in Employee class private Integer id use .setId(null)
        theEmployee.setId(0);
        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee)
    {
        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;
    }

    // Perform partial updates
    @PatchMapping("/employees/{employeeId}")
    public Employee patchEmployee(@PathVariable int employeeId,
                                  @RequestBody Map<String, Object> patchPayload)
    {
        Employee theEmployee = employeeService.findById(employeeId);

        if(theEmployee == null)
        {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        // The "id" field is not allowed in the payload We will not change the primary key
        if(patchPayload.containsKey("id"))
        {
            throw new RuntimeException("Employee id is not allowed in request body - " + employeeId);
        }

        Employee patchedEmployee = jsonMapper.updateValue(theEmployee, patchPayload);

        Employee dbEmployee = employeeService.save(patchedEmployee);
        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId)
    {
        Employee tempEmployee = employeeService.findById(employeeId);

        if(tempEmployee == null)
        {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        employeeService.deleteById(employeeId);
        return "Deleted employee id - " + employeeId;
    }
}
