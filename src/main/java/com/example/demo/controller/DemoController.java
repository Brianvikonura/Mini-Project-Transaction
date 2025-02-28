package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.entity.User;
import com.example.demo.service.AccountService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class DemoController {
    @Autowired
    UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<User> create (@RequestBody User request) {
        User response = request;

        response = userService.createUser(request);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/getUser")
    public ResponseEntity<User> getUser (@RequestParam String param) {
        User response = new User();

        response = userService.getUser(param);

        return ResponseEntity.ok(response);
    }

    @RequestMapping("/account")
    public class AccountController {
        @Autowired
        private AccountService accountService;

        // 1. GET - Ambil data akun berdasarkan ID
        @GetMapping("/{id}")
        public ResponseEntity<Account> getAccount(@PathVariable Integer id) {
            return accountService.getAccount(String.valueOf(id));
        }

        // 2. POST - Buat akun baru
        @PostMapping
        public Account createAccount(@RequestBody Account account) {
            return accountService.createAccount(account);
        }

        // 3. PUT - Perbarui akun berdasarkan ID
        @PutMapping("/{id}")
        public ResponseEntity<Account> updateAccount(@PathVariable Integer id, @RequestBody Account account) {
            return accountService.accountUpdate(
                    id, account);
        }
    }

}
