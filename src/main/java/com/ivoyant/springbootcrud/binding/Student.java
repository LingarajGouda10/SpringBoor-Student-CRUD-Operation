package com.ivoyant.springbootcrud.binding;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
}
