package com.programmingwithjon.nasaimageserver.endpoints;

import java.util.List;

import javax.inject.Inject;

import com.programmingwithjon.nasaimageserver.services.DatesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

public class DatesEndpoint {
    @Inject
    private DatesService datesService;

    @RequestMapping(value = "dates", method = RequestMethod.GET)
    public List<String> getDates() { return datesService.getDates(); }
}
