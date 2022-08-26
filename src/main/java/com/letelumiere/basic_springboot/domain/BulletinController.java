package com.letelumiere.basic_springboot.domain;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letelumiere.basic_springboot.domain.model.Bulletin;
import com.letelumiere.basic_springboot.domain.model.BulletinDTO;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/bulletin") 
public class BulletinController {

    @Autowired
    private BulletinService bulletinService;
    
    @PostMapping("/contents")
    public ResponseEntity<Bulletin> InsertContents(@RequestBody BulletinDTO bulletinDto){
        bulletinService.writeContents(bulletinDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/contents")
    public ResponseEntity<List<Bulletin>> readAll(){
        return ResponseEntity.ok(bulletinService.readAll());
    }

    @GetMapping("/contents/page/{pageNum}")
    public ResponseEntity<Page<Bulletin>> readAll(@PathVariable int pageNum){
        return ResponseEntity.ok(bulletinService.readAllWithPageable(pageNum));
    }

    @GetMapping("/user/{user_id}")
    public ResponseEntity findByUserId(@PathVariable String user_id, @RequestBody Bulletin bulletin){
        bulletinService.readAll();
        return ResponseEntity.ok().build();
    }


    

    @DeleteMapping("/contents/{contents_id}")
    public ResponseEntity deleteContents(@PathVariable String contents_id, @RequestBody Bulletin bulletin){
        bulletinService.delete(bulletin);
        return ResponseEntity.ok().build();
    }
}



    //create-write
    //read
    //read-all
    //read-paging
    //update-modify contents
    //delete
