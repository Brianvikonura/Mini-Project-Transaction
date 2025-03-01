package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "account")
public class Account {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // Jika id auto-increment
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer usersId;

    @Column(name = "no_rek")
    private String noRek;

    @Column(name = "mata_uang")
    private String mataUang;

    @Column(name = "saldo")
    private Float saldo;

//    @ManyToOne
//    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
//    private User user;
//    private Integer userId;
}
