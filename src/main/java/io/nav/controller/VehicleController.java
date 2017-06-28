package io.nav.controller;

import io.nav.entity.Vehicle;
import io.nav.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by navanee on 24-06-2017.
 */

@RestController
@RequestMapping(value = "/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Vehicle> getVehicles() {
        return vehicleService.getVehicles();
    }

    @CrossOrigin(origins = "http://mocker.egen.io")
    @RequestMapping(method = RequestMethod.PUT)
    public void updateVehicle(@RequestBody Vehicle[] vehicles) {
        vehicleService.loadVehicles(vehicles);
    }

}
