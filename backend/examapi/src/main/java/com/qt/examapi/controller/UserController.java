package com.qt.examapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qt.examapi.dto.DepartmentDTO;
import com.qt.examapi.dto.ProfilesDTO;
import com.qt.examapi.dto.RolesDTO;
import com.qt.examapi.dto.UsersDTO;
import com.qt.examapi.response.GenericResponse;

@RestController
@RequestMapping("api")
public class UserController {

    @CrossOrigin
    @PostMapping(value="/post-user", produces="application/json", consumes="application/json")
    public GenericResponse postUser(@RequestBody UsersDTO users){
        return null;
    }

    @CrossOrigin
    @PostMapping(value="/post-department", produces="application/json", consumes="application/json")
    public GenericResponse postDepartment(@RequestBody DepartmentDTO department){
        return null;
    }

    @CrossOrigin
    @PostMapping(value="/post-role", produces="application/json", consumes="application/json")
    public GenericResponse postRoles(@RequestBody RolesDTO roles){
        return null;
    }

    @CrossOrigin
    @PostMapping(value="/post-profile", produces="application/json", consumes="application/json")
    public GenericResponse postUser(@RequestBody ProfilesDTO profile){
        return null;
    }

    @CrossOrigin
    @PostMapping(value="/get-user/{id}", produces="application/json", consumes="application/json")
    public GenericResponse getUser(@PathVariable String id){
        return null;
    }

    @CrossOrigin
    @PostMapping(value="/get-users", produces="application/json", consumes="application/json")
    public GenericResponse getAllUser(){
        return null;
    }

    @CrossOrigin
    @PostMapping(value="/edit-user/{id}", produces="application/json", consumes="application/json")
    public GenericResponse editUser(@PathVariable String id, @RequestBody ProfilesDTO profiles){
        return null;
    }

}
