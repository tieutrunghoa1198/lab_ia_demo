package com.example.lab_ia.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "account", schema = "lab_ia_assignment", indexes = {
        @Index(name = "PK_TE_idx", columnList = "idteacher"),
        @Index(name = "PK_SD_idx", columnList = "idstudent")
})
public class Account {
    @Id
    @Column(name = "username", nullable = false, length = 150)
    private String id;

    @Column(name = "password", nullable = false, length = 150)
    private String password;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idstudent", nullable = false)
    private Student idstudent;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idteacher", nullable = false)
    private Teacher idteacher;

    @Column(name = "role", nullable = false)
    private Boolean role = false;

}