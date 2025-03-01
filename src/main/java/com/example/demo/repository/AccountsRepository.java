package com.example.demo.repository;

import com.example.demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountsRepository extends JpaRepository<Account, Integer> {

//    List<Account> findAllByAccountId(Integer Id);
    List<Account> findAllByUsersId(Integer id);
}
