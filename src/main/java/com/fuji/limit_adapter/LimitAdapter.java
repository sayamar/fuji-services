package com.fuji.limit_adapter;

import com.fuji.limit_details.LimitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class LimitAdapter implements LimitRepository {

    private SafeWebClient safeWebClient;

    @Override
    public UpdateLimits utilizeLimits(LimitRequest limitRequest) {
        return safeWebClient.utilizeFunds(limitRequest.getEventType());
   }

    @Override
    public UpdateLimits reverseLimits(LimitRequest limitRequest) {
        return safeWebClient.reverseFunds();
    }
}
