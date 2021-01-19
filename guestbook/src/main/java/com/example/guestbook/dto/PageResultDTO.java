package com.example.guestbook.dto;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Data
public class PageResultDTO<DTO , EN> {

    private List<DTO> dtoList;

    // DTO 객체로 변환해서 자료구조로 담아주어야 한다.
    public PageResultDTO(Page<EN> result, Function<EN,DTO> fn){
        dtoList = result.stream().map(fn).collect(Collectors.toList());
    }


}
