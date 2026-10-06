package com.gfg.repository;
import com.gfg.model.GeeksUserRecord;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GeeksUserRepository extends JpaRepository<GeeksUserRecord,Long> {
	
}
