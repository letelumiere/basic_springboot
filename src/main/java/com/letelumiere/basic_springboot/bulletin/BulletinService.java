package com.letelumiere.basic_springboot.bulletin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BulletinService {

    @Autowired
    private BulletinRepository bulletinRepository;

    public List<BulletinVo> findAll(){
        return bulletinRepository.findAll();
    }
}
