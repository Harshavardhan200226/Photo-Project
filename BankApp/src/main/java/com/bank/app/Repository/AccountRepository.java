package com.bank.app.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.app.entity.Account;
@Repository
public interface AccountRepository extends JpaRepository<	Account, Long>{

	Account findByBankName(String bankName);

	Account findByBankAddress(String bankAddress);
}

