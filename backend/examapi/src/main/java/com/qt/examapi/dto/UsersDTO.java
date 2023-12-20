package com.qt.examapi.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Data transfer object used to transfer users data
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersDTO {
    String email, password, profileid, departmentid;
    int status;
}
