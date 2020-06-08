package com.soap.controllers;

import com.soap.model.FindRegionMonumentsRequest;
import com.soap.model.FindRegionMonumentsResponse;
import com.soap.services.FindRegionMonumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * @author Grigorios Ladas
 */
@Endpoint
public class FindRegionMonumentsController {


    private static final String NAMESPACE_URI = "http://www.soap.com/model";
    private final FindRegionMonumentsService findRegionMonumentsService;


    @Autowired
    public FindRegionMonumentsController(FindRegionMonumentsService findRegionMonumentsService) {
        this.findRegionMonumentsService = findRegionMonumentsService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findRegionMonumentsRequest")
    @ResponsePayload
    public FindRegionMonumentsResponse findRegionMonumentsResponse(@RequestPayload FindRegionMonumentsRequest request) {
        return findRegionMonumentsService.findCountryMonumentsResponse(request);
    }


}