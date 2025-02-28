package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

public class Rate {
    @Entity
    @Data
    @Table(name = "rate")
    public class rate {
        @Id
        @Column (name = "id")
        private Integer id;

        @Column(name = "mata_uang_asal")
        private Float mataUangAsal;

        @Column(name = "mata_uang_tujuan")
        private Float mataUangTujuan;

        @Column(name = "kurs")
        private Float kurs;
    }
}
