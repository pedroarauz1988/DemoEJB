package com.example.demo.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FinancialAndStatusInfo {
    private String l7LastPayAmount;
    private String l7LastPayDate;
    private String l7CollectionStatus;
    private String l7LastInvDueDate;
    private String l7LastBillInvNo;
    private String l7LastInvOpenAmount;
    private String l7AccountId;
    private String l7ArBalance;
    private String l7CollectionIndicator;
    private String l7lob;
}
