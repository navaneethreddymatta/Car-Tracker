package io.nav.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import io.nav.entity.Reading;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by navanee on 24-06-2017.
 */

@RestController
@RequestMapping(value = "/readings")
public class ReadingController {

    @RequestMapping(method = RequestMethod.POST)
    public void createReading(@RequestBody Reading reading) {
        System.out.println("-----------");
        System.out.println(reading.getId());
    }

}
