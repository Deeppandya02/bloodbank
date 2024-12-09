package com.dbms.bloodbank.controller;

import com.dbms.bloodbank.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
}
