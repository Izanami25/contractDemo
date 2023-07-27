package com.example.contractdemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstSide;

    @Column(name = "second_name")
    private String secondSide;

    @Column(name = "description")
    private String description;
}
