package com.dbms.bloodbank.controller;

import com.dbms.bloodbank.model.Inventory;
import com.dbms.bloodbank.service.inventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class inventoryController {

    @Autowired
    private inventoryService inventoryService;

    @GetMapping("/inventory")
    public String getAllInventory(Model model) {
        List<Inventory> inventoryList = inventoryService.getAllInventory();
        model.addAttribute("inventoryList", inventoryList);
        return "all";
    }

}
