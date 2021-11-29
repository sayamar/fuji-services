package com.fuji.limit_adapter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
public class SafeWebClient {

    public UpdateLimits utilizeFunds(String eventType) {
        return UpdateLimits.builder().
                amountValue(new BigDecimal("2000"))
                .cisId("200K")
                .currency("SGD")
                .tnxReferenceNumber("util128765")
                .build();
    }

    public UpdateLimits reverseFunds() {
        return UpdateLimits.builder().
                amountValue(new BigDecimal("2000"))
                .cisId("100K")
                .currency("SGD")
                .tnxReferenceNumber("util128765")
                .build();
    }


}
