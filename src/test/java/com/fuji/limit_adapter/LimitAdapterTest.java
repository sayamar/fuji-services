package com.fuji.limit_adapter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class LimitAdapterTest {

    @InjectMocks
    private LimitAdapter limitAdapter;

    @Mock
    private SafeWebClient safeWebClient;



    @Test
    public void testShuldExecuteUtilizationLimit(){

        LimitRequest limitRequest = LimitRequest.builder()
                .branch("702")
                .eventType("UTIL")
                .referenceNumber("REF123")
                .build();

        when(safeWebClient.utilizeFunds(any())).thenReturn(testData());



       UpdateLimits updateLimits = limitAdapter.utilizeLimits(limitRequest);

       assertNotNull(updateLimits);
       assertEquals(updateLimits.getCisId(),"200K");
        assertEquals(updateLimits.getCurrency(),"SGD");
        assertEquals(updateLimits.getTnxReferenceNumber(),"util128765");
        assertEquals(updateLimits.getAmountValue(), new BigDecimal("2000"));

        Mockito.verify(safeWebClient, Mockito.times(1)).utilizeFunds(any());

    }

    private UpdateLimits testData() {
       return  UpdateLimits.builder().
                amountValue(new BigDecimal("2000"))
                .cisId("200K")
                .currency("SGD")
                .tnxReferenceNumber("util128765")
                .build();
    }
}
