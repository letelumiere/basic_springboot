package com.letelumiere.basic_springboot.bulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/bulletin") @AllArgsConstructor
public class BulletinController {
    @Autowired
    private BulletinRepository bulletinRepository;

    @Autowired
    private BulletinService bulletinService;
    

    //create-write
    //read
    //read-all
    //read-paging
    //update-modify contents
    //delete


}
