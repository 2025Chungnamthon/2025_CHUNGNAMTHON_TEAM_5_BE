package com.chungnamthon.cheonon.local_merchant.controller;

import com.chungnamthon.cheonon.global.payload.ResponseDto;
import com.chungnamthon.cheonon.local_merchant.dto.MerchantDto;
import com.chungnamthon.cheonon.local_merchant.service.MerchantService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/merchants")
@RequiredArgsConstructor
public class MerchantController {

    private final MerchantService merchantService;

    @GetMapping
    public ResponseDto<Page<MerchantDto>> list(Pageable pageable) {
        Page<MerchantDto> data = merchantService.list(pageable);
        return ResponseDto.of(data, "Merchant list fetched successfully.");
    }

    @GetMapping("/{id}")
    public ResponseDto<MerchantDto> detail(@PathVariable Long id) {
        MerchantDto dto = merchantService.detail(id);
        return ResponseDto.of(dto, "Merchant detail fetched successfully.");
    }

    @GetMapping("/range")
    public ResponseDto<List<MerchantDto>> getMerchantsInView(
            @RequestParam("swLat") Double swLat,
            @RequestParam("swLng") Double swLng,
            @RequestParam("neLat") Double neLat,
            @RequestParam("neLng") Double neLng
    ) {
        List<MerchantDto> dto =  merchantService.getMerchantsInBounds(swLat, swLng, neLat, neLng);
        return ResponseDto.of(dto,"가맹점 조회 성공");
    }
}

