package com.fuji.limit_details;

import com.fuji.limit_adapter.LimitRequest;
import com.fuji.limit_adapter.UpdateLimits;

public class LimitServiceAdapter implements LimitService {
    @Override
    public UpdateLimits utilizeLimits(LimitRequest limitRequest) {
        return UpdateLimits.builder().build();
    }

    @Override
    public UpdateLimits reverseLimits(LimitRequest limitRequest) {
        return UpdateLimits.builder().build();
    }
}
