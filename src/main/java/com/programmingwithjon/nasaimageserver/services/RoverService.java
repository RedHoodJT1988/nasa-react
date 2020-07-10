package com.programmingwithjon.nasaimageserver.services;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.programmingwithjon.nasaimageserver.beans.RoverList;
import com.programmingwithjon.nasaimageserver.client.NasaRestClient;

@Component
public class RoverService {

    @Inject
    private NasaRestClient nasaRestClient;

    public RoverList getRoverList() {
        return nasaRestClient.getRoverList();
    }

}
