package io.nav.controller;

import io.nav.entity.Reading;
import io.nav.entity.Vehicle;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by navanee on 24-06-2017.
 */

@RestController
@RequestMapping(value = "/vehicles")
public class VehicleController {

    @RequestMapping(method = RequestMethod.GET)
    public void getVehicle() {
        System.out.println("###########");
        System.out.println("get vehicles");
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateVehicle(@RequestBody Vehicle[] vehicles) {
        System.out.println("###########");
        System.out.println(vehicles);
    }

}
