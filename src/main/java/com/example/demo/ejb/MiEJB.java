package com.example.demo.ejb;

import com.example.demo.objects.*;
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

    public Collection<L7GetDocumentList> l7GetDocumentLists(DocumentListReq request) {
        Collection<L7GetDocumentList> documentList = new ArrayList<>();

        if (request.getBaId() == 102932451) {
            L7GetDocumentList l7GetDocumentList = L7GetDocumentList.builder()
                    .docId("409001289")
                    .billDate("20240114")
                    .invoiceAmount("4495.0")
                    .legalInvoiceNo("1221144495")
                    .periodCoverageStartDate("20240114")
                    .periodCoverageEndDate("20240213")
                    .totalAmount("8989.95")
                    .build();

            documentList.add(l7GetDocumentList);

            L7GetDocumentList l7GetDocumentList2 = L7GetDocumentList.builder()
                    .docId("397383778")
                    .billDate("20240114")
                    .invoiceAmount("4494.95")
                    .legalInvoiceNo("1209527004")
                    .periodCoverageStartDate("20240114")
                    .periodCoverageEndDate("20240213")
                    .totalAmount("4494.95")
                    .build();

            documentList.add(l7GetDocumentList2);

            L7GetDocumentList l7GetDocumentList3 = L7GetDocumentList.builder()
                    .docId("381620455")
                    .billDate("20231214")
                    .invoiceAmount("8377.51")
                    .legalInvoiceNo("1193763663")
                    .periodCoverageStartDate("20231114")
                    .periodCoverageEndDate("20231213")
                    .totalAmount("8377.51")
                    .build();

            documentList.add(l7GetDocumentList3);

        }
        return documentList;
    }

    public Collection<DocumentCharges> getDocumentCharges(DocumentChargesReq request) {

        Collection<DocumentCharges> documentChargesList = new ArrayList<>();

        if (request.getDocId() == 352911547) {
            DocumentCharges documentCharges = DocumentCharges.builder()
                    .chargeCode("CCOCHOM875156")
                    .description("Telefonia")
                    .revenueCode("OC")
                    .totalTaxAmt(622.69)
                    .amount(3277.31)
                    .periodStartDate("20230602")
                    .periodEndDate("20230701")
                    .amountIncludeTax(3900.00)
                    .build();

            documentCharges.setCurrentAmount(documentCharges.getTotalTaxAmt() + documentCharges.getAmount());

            documentChargesList.add(documentCharges);

        }

        return documentChargesList;
    }

    public FinancialAndStatusInfo getFinancialStatusInfo(FinancialAndStatusInfoReq request) {

        if (request.getValue() == 100064329) {
            FinancialAndStatusInfo financialAndStatusInfo = FinancialAndStatusInfo.builder()
                    .l7CollectionStatus("PSUS")
                    .l7LastInvDueDate("20231122")
                    .l7LastBillInvNo("841")
                    .l7LastInvOpenAmount("13990.01")
                    .l7AccountId("100064329")
                    .l7ArBalance("13990.01")
                    .l7CollectionIndicator("Y")
                    .l7lob("WLS")
                    .build();
            return financialAndStatusInfo;
        } else {
            return null;
        }
    }
}
