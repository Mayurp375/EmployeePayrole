package com.employeepayrole.controler;

import com.employeepayrole.entity.Employee;
import com.employeepayrole.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class EmployeeControler {
    @Autowired
    IEmpService empService;

    @RequestMapping(method = RequestMethod.GET, path = "/{name}")
    public ResponseEntity<String> helow1(@RequestBody String name) {
        return new ResponseEntity<>("Hiii" + name + " !", HttpStatus.CREATED);
    }

//    @RequestMapping(method = RequestMethod.GET, path = "/{name}")
//    public String helow(@RequestBody String name) {
//        return "Hiii" + name + " !";
//    }

    @GetMapping("/getall")
    public ResponseEntity<List<Employee>> getall() {
        return ResponseEntity.ok(empService.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> employee(@RequestBody Employee employee) {//jeson
        System.out.println("added successfully");
        return ResponseEntity.ok( empService.addData(employee));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity< Optional<Employee>> getEmpById(@PathVariable("id") int id) {
        System.out.println("find successfully");
        return ResponseEntity.ok( empService.getById(id));
    }

    @GetMapping("/id")
    public ResponseEntity< Optional<Employee>> getEmpById2(@RequestParam("id") int id) {
        System.out.println("find successfully");
        return ResponseEntity.ok( empService.getById(id));
    }
}
