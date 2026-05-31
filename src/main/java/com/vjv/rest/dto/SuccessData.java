package com.vjv.rest.dto;

import lombok.Getter;
import lombok.Setter;

/**
* SuccessData.
* @author QuangDK.
*/
public class SuccessData extends BaseResponseData {

    @Getter
    private final boolean isSuccess = true;

    @Getter
    @Setter
    private int statusCode;

    @Getter
    @Setter
    private Object data;
}