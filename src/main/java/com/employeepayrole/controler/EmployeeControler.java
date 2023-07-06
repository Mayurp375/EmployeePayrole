package com.employeepayrole.controler;

import com.employeepayrole.entity.Employee;
import com.employeepayrole.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class EmployeeControler {
    @Autowired
    IEmpService empService;

    @RequestMapping(method = RequestMethod.GET, path = "/{name}")
    public String helow(@RequestBody String name) {
        return "Hiii" + name + " !";
    }

    @GetMapping("/getall")
    public List<Employee> getall(){
        return empService.getAll();
    }

    @PostMapping("/save")
    public Employee employee(@RequestBody Employee employee){//jeson
        System.out.println("added successfully");
        return empService.addData(employee);
    }

    @GetMapping("/id/{id}")
    public Optional<Employee> getEmpById(@PathVariable ("id")int id){
        System.out.println("find successfully");
        return empService.getById(id);
    }

    @GetMapping("/id")
    public Optional<Employee> getEmpById2(@RequestParam ("id")int id){
        System.out.println("find successfully");
        return empService.getById(id);
    }
}
