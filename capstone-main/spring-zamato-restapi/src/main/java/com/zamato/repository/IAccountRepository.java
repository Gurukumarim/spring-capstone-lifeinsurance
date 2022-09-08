package com.zamato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zamato.model.Account;
@Repository
public interface IAccountRepository extends JpaRepository<Account, Integer>{

}
