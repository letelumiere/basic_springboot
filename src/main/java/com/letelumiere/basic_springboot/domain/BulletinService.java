package com.letelumiere.basic_springboot.domain;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.letelumiere.basic_springboot.domain.model.Bulletin;
import com.letelumiere.basic_springboot.domain.model.BulletinDTO;
import com.letelumiere.basic_springboot.domain.repository.BulletinRepository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class BulletinService {
    private final BulletinRepository bulletinRepository;

    public List<Bulletin> readAll(){
        return bulletinRepository.findAll();
    }

    public List<Bulletin> readAllWithPageable(int pageNum){
        PageRequest pageable = PageRequest.of(pageNum, pageNum + 10);
        Page<Bulletin> bulletin = bulletinRepository.findAll(pageable);
        return bulletinRepository.findAll();
    }
/*    
    public BulletinDTO readReferenceById(String user_id){
        return bulletinRepository.readReferenceByUserId(user_id);
    }
 */
    public Optional<Bulletin> readById(Long title_id){
        return bulletinRepository.findById(title_id);
    }

    @Transactional
    public Bulletin writeContents(BulletinDTO bulletinDto){
        return bulletinRepository.save(bulletinDto.toEntity());
    }

    public void delete(Bulletin bulletin){
        bulletinRepository.delete(bulletin);
    }
}
