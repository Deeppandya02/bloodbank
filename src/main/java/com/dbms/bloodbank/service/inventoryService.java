package com.dbms.bloodbank.service;

import com.dbms.bloodbank.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbms.bloodbank.repository.inventoryRepository;

import java.util.List;

@Service
public class inventoryService {

    @Autowired
    private inventoryRepository inventoryRepository;

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }
}
