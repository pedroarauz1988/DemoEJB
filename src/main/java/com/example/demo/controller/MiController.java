package com.example.demo.controller;

import com.example.demo.ejb.MiEJB;
import com.example.demo.objects.AR7OpenBalanceInfoDt;
import com.example.demo.objects.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class MiController {

    @Autowired
    private MiEJB miEJB;

    @PostMapping("/saludar")
    public String saludar() {
        return miEJB.saludar();
    }

    @PostMapping("/l7GetFAOpenBalance")
    public Collection<AR7OpenBalanceInfoDt> l7GetFAOpenBalance(@RequestParam Integer accountId) {
        return miEJB.l7GetFAOpenBalance(accountId);
    }

    @PostMapping("/getOrderList")
    public Collection<Order> getOrderList(@RequestParam Integer customerID) {
        return miEJB.getOrderList(customerID);
    }
}
