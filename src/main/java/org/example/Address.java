package org.example;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {
    @Id
    int id;
    String state;
    @OneToOne(mappedBy = "address")// bi directional address to student
            // without mappedby also we can do
    Student student;
}
