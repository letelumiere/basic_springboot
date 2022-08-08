package com.letelumiere.basic_springboot.bulletin;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BulletinRepository extends CrudRepository<BulletinVo, Integer>{        

}
