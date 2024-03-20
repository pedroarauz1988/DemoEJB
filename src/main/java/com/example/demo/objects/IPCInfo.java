package com.example.demo.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IPCInfo {
    private String ChargeCode;
    private String Previousrc;
    private String AppliedReAdjustmentPer;
    private String ReadjustedRc;
}
