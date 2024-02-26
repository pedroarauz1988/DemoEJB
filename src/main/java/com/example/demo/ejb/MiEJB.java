package com.example.demo.ejb;

import com.example.demo.objects.AR7OpenBalanceInfoDt;
import com.example.demo.objects.Order;
import jakarta.ejb.Stateless;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;


@Stateless
@Service
public class MiEJB {
    public String saludar() {
        return "¡Hola desde EJB!";
    }

    public Collection<AR7OpenBalanceInfoDt> l7GetFAOpenBalance(Integer accountId) {

        Collection<AR7OpenBalanceInfoDt> listAR7OpenBalanceInfoDt = new ArrayList<>();

        if (accountId == 100064329) {
            AR7OpenBalanceInfoDt ar7OpenBalanceInfoDt = AR7OpenBalanceInfoDt.builder()
                    .l7Market("CHILE")
                    .l7Affiliate("CLAROCHILE")
                    .arBalance("13990.01")
                    .invoiceId("5706")
                    .l7LegalInvoiceNumber("9100064329")
                    .balance("13990.01")
                    .creationDate("02/11/2023")
                    .dueDate("22/11/2023")
                    .l7PassDueInd("S")
                    .l7lob("WLS")
                    .build();

            listAR7OpenBalanceInfoDt.add(ar7OpenBalanceInfoDt);

        }

        return listAR7OpenBalanceInfoDt;
    }

    public Collection<Order> getOrderList(Integer customerID) {
        Collection<Order> orderList = new ArrayList<>();

        if (customerID == 237990493) {
            Order order = Order.builder()
                    .orderID("3001")
                    .creationDate("2021-10-04")
                    .orderActionType("Provide")
                    .build();

            orderList.add(order);

            Order order1 = Order.builder()
                    .orderID("4001")
                    .creationDate("2021-10-04")
                    .orderActionType("PR")
                    .build();

            orderList.add(order1);

            Order order2 = Order.builder()
                    .orderID("17012")
                    .creationDate("2021-10-09")
                    .orderActionType("Provide")
                    .build();

            orderList.add(order2);

        }
        return orderList;
    }
}
