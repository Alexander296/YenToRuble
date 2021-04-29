package ru.chuykov.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.chuykov.demo.service.ExchangeServiceImpl;

@Controller
public class ExchangeController {

    @Autowired
    private ExchangeServiceImpl exchangeService;

    @GetMapping("/exchange")
    public String yenToRuble(Model model) {
        model.addAttribute("RateYenToRuble", exchangeService.getRateYenToRuble().
                stream().filter(x -> x.getNumCode().equals("392")).findAny());
        return "exchange";
    }
}
