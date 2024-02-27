package com.example.demo.objects;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class L7GetDocumentList {
    private String docId;
    private String invoiceAmount;
    private String billDate;
    private String legalInvoiceNo;
    private String periodCoverageStartDate;
    private String periodCoverageEndDate;
    private String totalAmount;
}
