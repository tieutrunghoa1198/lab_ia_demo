package com.example.lab_ia.dto.repository;

import com.example.lab_ia.dto.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}