package com.fuji;

import com.fuji.limit_resource.LimitController;
import com.fuji.limit_resource.LimitResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static io.restassured.RestAssured.baseURI;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = FujiServicesApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class LimitBaseContract {

    private static final String LOCAL_HOST="http://DESKTOP-M3AHD9N:";

    @LocalServerPort
    private Integer port;

    @MockBean
    private LimitController limitController;

    public void setup() {
        baseURI = LOCAL_HOST + port;
        log.info("base URI {} ",baseURI);
        when(limitController.getName(any(),any())).thenReturn(testData());
    }

    private ResponseEntity<LimitResponse> testData(){
        LimitResponse limitResponse = LimitResponse.builder().result("TestOutput").build();
        return new ResponseEntity<>(limitResponse, HttpStatus.OK);
    }
}
