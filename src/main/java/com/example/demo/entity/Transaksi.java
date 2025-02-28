package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "transaksi")
public class Transaksi {
    @Id
    @Column(name = "transaksiId")
    private Integer transaksiId;

    @Column(name = "jumlahIn")
    private String jumlahIn;

    @Column(name = "jumlahOut")
    private String jumlahOut;

    @Column(name = "waktuTransaksi")
    private Date waktuTransaksi;

    @Column(name = "rateId")
    private Integer rateId;

    @Column(name = "akunId")
    private Integer akunId;

    @Column(name = "userId")
    private Integer userId;
}
