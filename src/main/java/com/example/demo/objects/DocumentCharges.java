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
    private Double totalAmount;
    private Double totalTaxAmt;
    private Double amount;
    private Double currentAmount;
}
