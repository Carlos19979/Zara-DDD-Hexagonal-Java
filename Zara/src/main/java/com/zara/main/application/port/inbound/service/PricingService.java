package com.zara.main.application.port.inbound.service;

import com.zara.main.application.port.inbound.service.dto.PriceDto;
import com.zara.main.domain.exceptions.specificExceptions.BadRequestException;
import com.zara.main.domain.exceptions.specificExceptions.NoContentException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public interface PricingService {
    PriceDto addRate(PriceDto rate) throws BadRequestException;

    PriceDto getPriceByProductIdBrandIdStartDate(PriceDto priceDto) throws BadRequestException, NoContentException;
    String deletePrice(Long idRate) throws NoContentException;

    PriceDto updatePrice(PriceDto priceDto) throws BadRequestException, NoContentException;

}
