package org.gradle.controller;

import org.gradle.model.Sample;
import org.gradle.service.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping("/sample")
    public Sample sample(String sampleName) {
        return sampleService.createSample(sampleName);
    }

}