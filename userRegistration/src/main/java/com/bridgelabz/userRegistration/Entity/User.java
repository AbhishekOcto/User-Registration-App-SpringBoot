package com.bridgelabz.userRegistration.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "USER_REGISTRATION")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "id", nullable = false)
    private long id;
    private String name;
    private int age;
    private long phoneNo;
    private String email;
    private String password;
    
}
