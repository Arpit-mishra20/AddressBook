package com.example.Address.Book.controllers;

import java.util.*;
import com.example.Address.Book.dto.EmployeeDTO;
import com.example.Address.Book.dto.ResponseDTO;
import com.example.Address.Book.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressController {

    @Autowired
    IEmployeeService iEmployeeService;


    //UC3 --> Handling REST API's using service layer with storage in database

    @GetMapping("/get/{id}")
    public EmployeeDTO get3(@PathVariable Long id){
        return iEmployeeService.get(id);
    }

    @PostMapping("/create")
    public EmployeeDTO create3(@RequestBody EmployeeDTO user){
        return iEmployeeService.create(user);
    }

    @GetMapping("/getAll")
    public List<EmployeeDTO> getAll3(){
        return iEmployeeService.getAll();
    }

    @PutMapping("/edit/{id}")
    public EmployeeDTO edit3(@RequestBody EmployeeDTO user, @PathVariable Long id){
        return iEmployeeService.edit(user, id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete3(@PathVariable Long id){
        return iEmployeeService.delete(id);
    }

    @GetMapping("/clear")
    public String clear(){
        return iEmployeeService.clear();
    }


}
