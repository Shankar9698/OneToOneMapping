package org.example;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Student {
    @Id
    int id;
    String name;
    @OneToOne //uni directional student to address
    Address address;
}
