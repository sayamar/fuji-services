package com.fuji.limit_details;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(toBuilder = true)
@Getter
public class UserLimits {
    private String globalCustomerId;
    private String limitType;
    private BigDecimal totalAmount;
    private BigDecimal usedAmount;
    private BigDecimal limitAmount;

}
