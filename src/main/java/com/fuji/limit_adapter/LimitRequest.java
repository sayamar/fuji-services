package com.fuji.limit_adapter;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Setter
@Getter
public class LimitRequest {

    private String providerName;
    private String eventType;
    private String branch;
    private String remarks;
    private String referenceNumber;
}
