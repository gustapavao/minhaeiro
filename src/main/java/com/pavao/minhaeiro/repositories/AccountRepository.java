package com.pavao.minhaeiro.repositories;

import com.pavao.minhaeiro.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository <Account, Long>{
}
