package com.ing.springboot.training.d01.s05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class FileSavingServiceExample {

    private final FileSavingService fileSavingService;

    @Autowired
    public FileSavingServiceExample(final FileSavingService fileSavingService) {
        this.fileSavingService = fileSavingService;
    }

    @PostConstruct
    public void init() {
        fileSavingService.saveFile("some file");
    }
}
