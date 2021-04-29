package ru.chuykov.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.chuykov.demo.dto.ValuteDto;
import ru.chuykov.demo.dto.ValCursDto;

import java.util.Arrays;
import java.util.List;

@Service
public class ExchangeServiceImpl implements ExchangeService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<ValuteDto> getRateYenToRuble() {
        return Arrays.asList(restTemplate.getForObject("http://www.cbr.ru/scripts/XML_daily.asp", ValCursDto.class).
                getValuteDto());

    }
}
