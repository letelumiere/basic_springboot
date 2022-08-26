package com.letelumiere.basic_springboot.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.letelumiere.basic_springboot.entity.Bulletin;


@Repository
public interface BulletinRepository extends JpaRepository<Bulletin, Long>{


    
    /*  
    public List<BulletinVo> readAll();
    
    public List<BulletinVo> readAllByUser(String user_id);
    public List<BulletinVo> readAllByTitle(String title_id);
    public BulletinVo readByUser(String user_id);
    public BulletinVo updateByUser(String user_id, String title_id, String password);
    public void deleteByTitle(String title_id, String user_id, String password); 
    */

}


