package com.vjv.rest.common;

import com.vjv.rest.dto.BaseRes;
import com.vjv.rest.dto.SuccessData;
import org.springframework.http.HttpStatus;

import java.util.UUID;

/**
* HandleSuccess.
* @author QuangDK.
*/
public class HandleSuccess {

    /**
     * Handles success data for REST API.
     * @param {{@link Object}} response
     * @return {{@link BaseRes}}
     */
    public BaseRes handleSuccess(Object response, Long start) {

        SuccessData successData = new SuccessData();

        // Set Request ID.
        successData.setRequestId(UUID.randomUUID().toString());

        // Set Status Code.
        successData.setStatusCode(200);

        // Set Data Response.
        successData.setData(response);

        // Set Time
        successData.setStartTime(start);

        return new BaseRes(successData, HttpStatus.OK);
    }

}