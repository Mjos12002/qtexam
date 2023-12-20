package com.qt.examapi.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "profiles")
public class ProfileEntity implements Serializable{
    @Id
    String id;
    String names;
    String phonenumber;
    String status;
    String addresss;

}

