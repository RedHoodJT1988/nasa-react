package com.programmingwithjon.nasaimageserver.endpoints;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.programmingwithjon.nasaimageserver.beans.RoverList;
import com.programmingwithjon.nasaimageserver.services.RoverService;

@CrossOrigin
@RestController
@RequestMapping("api/v1/")
public class RoverEndpoint {

    @Inject
    private RoverService roverService;

    @RequestMapping(value = "rovers", method = RequestMethod.GET)
    public RoverList getRovers() {
        return roverService.getRoverList();
    }
}
