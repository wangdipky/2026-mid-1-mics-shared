package com.vjv.rest.common;

import com.vjv.rest.dto.BaseRes;
import com.vjv.rest.dto.ErrorData;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;

import java.util.UUID;

/**
* HandleError.
* @author QuangDK.
*/
public class HandleError {

    /**
     * Handles error data for REST API.
     * @param {{@link Exception}} exception
     * @return {{@link BaseRes}}
     */
    public BaseRes handleError(Exception exception, Long start) {

        ErrorData errorData = new ErrorData();

        // Set Request ID.
        errorData.setRequestId(UUID.randomUUID().toString());

        // Get Message.
        errorData.setMessage(exception.getMessage());

        // Set Status.
        setStatus(exception, errorData);

        // Set Time
        errorData.setStartTime(start);

        return new BaseRes(errorData, errorData.getHttpStatus());
    }

    private void setStatus(Exception exception, ErrorData data) {

        // Default is Success
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        int result = 500;

        if(equalClass(BadRequestException.class, exception)) {
            result = 400;
            httpStatus = HttpStatus.BAD_REQUEST;
        }

        // Set data
        data.setHttpStatus(httpStatus);
        data.setStatusCode(result);
    }

    private boolean equalClass(Class<?> classN, Exception exception) {
        return exception.getClass().equals(classN);
    }
}