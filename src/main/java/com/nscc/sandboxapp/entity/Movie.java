package com.nscc.sandboxapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data // Lombok will add the getter and setter methods
@Entity // define as an entity
public class Movie {

    @Id // assign the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment the id in the database
    private Long id;

    @Column(nullable = false) // NOT NULL in database. Database validation
    private String Title;

    @Column(nullable = false, length = 1000) // NOT NULL in database, max characters 1000 (default is 255)
    private String synopsis;
}
