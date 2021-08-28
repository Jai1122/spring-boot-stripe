package com.jaiplays.services.payment.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ChargeRequest {

    @Getter
    @Setter
    private String description;
    @Getter
    private int amount;
    @Getter
    @Setter
    private Currency currency;
    @Getter
    private String stripeEmail;
    @Getter
    private String stripeToken;

    public enum Currency {
        EUR, USD, INR
    }

}
