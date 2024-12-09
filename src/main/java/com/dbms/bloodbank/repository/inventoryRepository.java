package com.dbms.bloodbank.repository;

import com.dbms.bloodbank.model.Inventory;
import com.dbms.bloodbank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface inventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findByBloodType(String bloodType);
}
