package com.test.service;

import java.util.List;

import com.test.dto.ProfitDto;

public interface ProfitService {
    List<ProfitDto> getMonthlyProfit();
    List<ProfitDto> getProfitByStore();
    List<ProfitDto> getMonthProfit(int month);
}
