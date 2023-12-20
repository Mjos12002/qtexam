package com.qt.examapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfilesDTO {
    String id, names, phonumber, address;
    int status;
}
