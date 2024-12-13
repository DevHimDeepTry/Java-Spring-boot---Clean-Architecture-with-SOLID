package com.src.springBootForBeginner.applicationBusinessRules.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiResponseWithoutData {
    private final int status;
    private final String message;
}