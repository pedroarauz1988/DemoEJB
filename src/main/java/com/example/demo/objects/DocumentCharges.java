package com.example.demo.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DocumentCharges {
    private String chargeCode;
    private String revenueCode;
    private String description;
    private Double totalAmount;
    private Double totalTaxAmt;
    private Double amount;
    private String periodStartDate;
    private String periodEndDate;
    private Double currentAmount;
    private Double amountIncludeTax;
}
