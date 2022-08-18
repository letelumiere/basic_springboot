package com.letelumiere.basic_springboot.bulletin;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class BulletinService {
    private final BulletinRepository bulletinRepository;

    public List<Bulletin> readAll(){
        return bulletinRepository.findAll();
    }

    public Page<Bulletin> readAllWithPageable(int pageNum){
        PageRequest pageable = PageRequest.of(pageNum, pageNum + 10);
        Page<Bulletin> bulletin = bulletinRepository.findAll(pageable);
        return bulletin;
    }

    public Bulletin readReferenceById(Long user_id){
        return bulletinRepository.getReferenceById(user_id);
    }

    public Optional<Bulletin> readById(Long title_id){
        return bulletinRepository.findById(title_id);
    }
/*
    @Transactional
    public Long writeContents(Bulletin bulletin){
        return bulletinRepository.save(bulletin).;
    }
*/

    public void delete(Bulletin bulletin){
        bulletinRepository.delete(bulletin);
    }
}
