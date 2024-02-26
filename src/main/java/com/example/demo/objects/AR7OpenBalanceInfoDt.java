package com.example.demo.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AR7OpenBalanceInfoDt {
    private String l7Market;
    private String l7Affiliate;
    private String arBalance;
    private String invoiceId;
    private String l7LegalInvoiceNumber;
    private String balance;
    private String creationDate;
    private String dueDate;
    private String l7PassDueInd;
    private String l7lob;
}
