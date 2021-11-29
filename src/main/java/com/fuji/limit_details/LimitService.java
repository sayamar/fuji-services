package com.fuji.limit_details;

import com.fuji.limit_adapter.LimitRequest;
import com.fuji.limit_adapter.UpdateLimits;

public interface LimitService {
    public UpdateLimits utilizeLimits(LimitRequest limitRequest);
    public UpdateLimits reverseLimits(LimitRequest limitRequest);
}
