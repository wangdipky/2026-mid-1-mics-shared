package com.vjv.rest.dto;

import org.jspecify.annotations.Nullable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

/**
* BaseRest.
* @author QuangDK.
*/
public class BaseRes extends ResponseEntity<BaseResponseData> {

    public BaseRes(HttpStatusCode status) {
        super(status);
    }

    public BaseRes(@Nullable BaseResponseData body, HttpStatusCode status) {
        super(body, status);
    }

    public BaseRes(HttpHeaders headers, HttpStatusCode status) {
        super(headers, status);
    }

    public BaseRes(@Nullable BaseResponseData body, @Nullable HttpHeaders headers, int rawStatus) {
        super(body, headers, rawStatus);
    }

    public BaseRes(@Nullable BaseResponseData body, @Nullable HttpHeaders headers, HttpStatusCode statusCode) {
        super(body, headers, statusCode);
    }
}