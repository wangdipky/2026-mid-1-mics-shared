package com.vjv.rest.dto;

import lombok.Getter;
import lombok.Setter;

/**
* BaseResponseData.
* @author QuangDK.
*/
@Getter
@Setter
public class BaseResponseData {

    private String requestId;

    private Long startTime;
}