package com.application.port.inbound;
import com.zara.main.ZaraApplication;
import com.zara.main.application.port.inbound.service.dto.PriceDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ZaraApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PricingServiceTest {

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void test1() {
        // Given
        PriceDto price = new PriceDto();
        price.setStartDate(LocalDateTime.of(2020, Month.JUNE, 14, 10, 00,00,000));
        price.setProductId(35455L);
        price.setBrandId(1L);


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<PriceDto> request = new HttpEntity<>(price, headers);

        ResponseEntity<PriceDto> response = restTemplate.postForEntity(
                "/v1/price/zara",
                request,
                PriceDto.class
        );

        // Then
        assertEquals(HttpStatus.OK, response.getStatusCode());
        PriceDto priceDto = response.getBody();
        assertNotNull(priceDto);
    }


    @Test
    public void test2() {
        // Given
        PriceDto price = new PriceDto();
        price.setStartDate(LocalDateTime.of(2020, Month.JUNE, 14, 16, 00,00,000));
        price.setProductId(35455L);
        price.setBrandId(1L);


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<PriceDto> request = new HttpEntity<>(price, headers);

        ResponseEntity<PriceDto> response = restTemplate.postForEntity(
                "/v1/price/zara",
                request,
                PriceDto.class
        );

        // Then
        assertEquals(HttpStatus.OK, response.getStatusCode());
        PriceDto priceDto = response.getBody();
        assertNotNull(priceDto);
    }

    @Test
    public void test3() {
        // Given
        PriceDto price = new PriceDto();
        price.setStartDate(LocalDateTime.of(2020, Month.JUNE, 14, 21, 00,00,000));
        price.setProductId(35455L);
        price.setBrandId(1L);


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<PriceDto> request = new HttpEntity<>(price, headers);

        ResponseEntity<PriceDto> response = restTemplate.postForEntity(
                "/v1/price/zara",
                request,
                PriceDto.class
        );

        // Then
        assertEquals(HttpStatus.OK, response.getStatusCode());
        PriceDto priceDto = response.getBody();
        assertNotNull(priceDto);
    }

    @Test
    public void test4() {
        // Given
        PriceDto price = new PriceDto();
        price.setStartDate(LocalDateTime.of(2020, Month.JUNE, 15, 10, 00,00,000));
        price.setProductId(35455L);
        price.setBrandId(1L);


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<PriceDto> request = new HttpEntity<>(price, headers);

        ResponseEntity<PriceDto> response = restTemplate.postForEntity(
                "/v1/price/zara",
                request,
                PriceDto.class
        );

        // Then
        assertEquals(HttpStatus.OK, response.getStatusCode());
        PriceDto priceDto = response.getBody();
        assertNotNull(priceDto);
    }

    @Test
    public void test5() {
        // Given
        PriceDto price = new PriceDto();
        price.setStartDate(LocalDateTime.of(2020, Month.JUNE, 16, 21, 00,00,000));
        price.setProductId(35455L);
        price.setBrandId(1L);


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<PriceDto> request = new HttpEntity<>(price, headers);

        ResponseEntity<PriceDto> response = restTemplate.postForEntity(
                "/v1/price/zara",
                request,
                PriceDto.class
        );

        // Then
        assertEquals(HttpStatus.OK, response.getStatusCode());
        PriceDto priceDto = response.getBody();
        assertNotNull(priceDto);
    }

}