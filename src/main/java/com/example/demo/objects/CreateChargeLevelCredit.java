package com.example.demo.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateChargeLevelCredit {
    private String creditReason;
    private String creditDescription;
    private String amount;
    private String creditId;
}
