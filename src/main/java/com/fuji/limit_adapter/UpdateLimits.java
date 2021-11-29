package com.fuji.limit_adapter;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
public class UpdateLimits {

    private String csutomerId;
    private String cisId;
    private BigDecimal amountValue;
    private String currency;
    private String tnxReferenceNumber;

    private String parsedXMLForData;
}
