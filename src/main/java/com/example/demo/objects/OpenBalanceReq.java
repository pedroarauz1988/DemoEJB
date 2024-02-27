package com.example.demo.objects;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "openBalanceReq")
public class OpenBalanceReq {
    private Integer accountId;

    @XmlElement(name = "accountId")
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}
