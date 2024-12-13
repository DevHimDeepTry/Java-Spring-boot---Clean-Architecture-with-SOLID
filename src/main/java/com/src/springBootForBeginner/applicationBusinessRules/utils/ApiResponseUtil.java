package com.src.springBootForBeginner.applicationBusinessRules.utils;


import com.src.springBootForBeginner.applicationBusinessRules.constants.ApiResponseWithData;
import com.src.springBootForBeginner.applicationBusinessRules.constants.ApiResponseWithoutData;
import org.springframework.http.ResponseEntity;

public class ApiResponseUtil {

    private ApiResponseUtil() {}

    public static <T> ResponseEntity<ApiResponseWithData<T>> createResponse(int status, String message, T data) {
        return ResponseEntity.status(status)
                .body(new ApiResponseWithData<>(status, message, data));
    }

    public static ResponseEntity<ApiResponseWithoutData> createResponse(int status, String message) {
        return ResponseEntity.status(status)
                .body(new ApiResponseWithoutData(status, message));
    }

}