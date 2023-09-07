package com.employeepayrole.controler;

import com.employeepayrole.dto.EmployeeDTO;
import com.employeepayrole.entity.MyEmployee;
import com.employeepayrole.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeControler {

    @Autowired
    EmployeeService employeeService;

//http://localhost:8080/save
    @GetMapping("/")
    public String hello() {
        return "hello mayur";
    }

    @GetMapping("/getall")
    public ResponseEntity<List<MyEmployee>> getall() {
        return ResponseEntity.ok(employeeService.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<MyEmployee> employee(@RequestBody EmployeeDTO employee) {//json

        MyEmployee myEmployee= new MyEmployee(employee);
        employeeService.save(myEmployee);
        System.out.println("added successfully");

        return ResponseEntity.ok(myEmployee);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Optional<MyEmployee>> getEmpById(@PathVariable("id") int id) {
        System.out.println("find successfully");
        return ResponseEntity.ok(employeeService.findById(id));
    }
    @GetMapping("/id")
    public ResponseEntity<Optional<MyEmployee>> getEmpByIdParam(@RequestParam int id) {
        System.out.println("find successfully");
        return ResponseEntity.ok(employeeService.findById(id));
    }

}
