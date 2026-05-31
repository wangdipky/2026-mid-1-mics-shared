package com.vjv.rest.common;

import tools.jackson.databind.ObjectMapper;

/**
 * AbstractRest.
 * @author QuangDK.
 */
public class AbstractRest {

    protected HandleSuccess handleSuccess = new HandleSuccess();

    protected HandleError handleError = new HandleError();

    protected ObjectMapper mapper = new ObjectMapper();
}