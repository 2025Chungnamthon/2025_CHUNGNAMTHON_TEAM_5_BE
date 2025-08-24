package com.chungnamthon.cheonon.domain.map.service;

import com.chungnamthon.cheonon.domain.local_merchant.entity.Merchant;
import com.chungnamthon.cheonon.domain.map.dto.SearchResultDto;
import com.chungnamthon.cheonon.domain.local_merchant.repository.MerchantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SearchService {

    private final MerchantRepository merchantRepo;

    public Page<SearchResultDto> searchByName(String keyword, Pageable pageable) {
        Page<Merchant> page = merchantRepo
                .findByNameEqualsIgnoreCase(keyword, pageable);

        return page.map(m -> SearchResultDto.builder()
                .id(m.getId())
                .name(m.getName())
                .address(m.getAddress())
                .tel(m.getTel())
                .category(m.getCategory())
                .lat(m.getLatitude())
                .lng(m.getLongitude())
                .isAffiliate(m.getIsAffiliate())
                .build()
        );
    }
}
