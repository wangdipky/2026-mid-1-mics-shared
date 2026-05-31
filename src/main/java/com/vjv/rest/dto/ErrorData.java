package com.vjv.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
* ErrorData.
* @author QuangDK.
*/
public class ErrorData extends BaseResponseData {

    @Getter
    private final boolean isSuccess = false;

    @Getter
    @Setter
    private int statusCode;

    @Getter
    @Setter
    private String message;

    @JsonIgnore
    @Getter
    @Setter
    private HttpStatus httpStatus;
}