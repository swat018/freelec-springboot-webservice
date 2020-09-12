package com.swat018.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author jinwoopark
 */
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
