package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Delivery;
import com.klef.fsad.exam.repository.DeliveryRepository;

@Service
public class DeliveryService
{

    @Autowired
    DeliveryRepository deliveryRepository;

    public Delivery addDelivery(Delivery delivery)
    {
        return deliveryRepository.save(delivery);
    }

    public String deleteDelivery(int id)
    {
        deliveryRepository.deleteById(id);
        return "Delivery Deleted Successfully";
    }

}