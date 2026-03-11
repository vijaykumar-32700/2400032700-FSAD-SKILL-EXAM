package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Delivery;
import com.klef.fsad.exam.service.DeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryController
{

    @Autowired
    DeliveryService deliveryService;

    @PostMapping("/add")
    public Delivery addDelivery(@RequestBody Delivery delivery)
    {
        return deliveryService.addDelivery(delivery);
    }

   
    @DeleteMapping("/delete/{id}")
    public String deleteDelivery(@PathVariable int id)
    {
        return deliveryService.deleteDelivery(id);
    }

}