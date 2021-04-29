package ru.chuykov.demo.service;

import ru.chuykov.demo.dto.ValuteDto;

import java.util.List;

public interface ExchangeService {
    public List<ValuteDto> getRateYenToRuble();
}
