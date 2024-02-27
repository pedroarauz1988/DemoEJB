package com.example.demo.controller;

import com.example.demo.ejb.MiEJB;
import com.example.demo.objects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/l7GetDocumentList")
    public Collection<L7GetDocumentList> l7GetDocumentList(@RequestBody DocumentListReq request) {
        return miEJB.l7GetDocumentLists(request);
    }

    @PostMapping("/getDocumentCharges")
    public Collection<DocumentCharges> getDocumentCharges(@RequestBody DocumentChargesReq request) {
        return miEJB.getDocumentCharges(request);
    }
}
