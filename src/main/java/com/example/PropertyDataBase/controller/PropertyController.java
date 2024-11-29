package com.example.PropertyDataBase.controller;

import com.example.PropertyDataBase.entity.Property;
import com.example.PropertyDataBase.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/all")
    public List<Property> getAllProperties() {
        return propertyService.getAllProperties();
    }
}
