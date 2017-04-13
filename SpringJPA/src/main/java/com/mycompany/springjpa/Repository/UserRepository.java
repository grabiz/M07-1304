/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springjpa.Repository;

import com.mycompany.springjpa.Entity.UserEntity;
import java.io.Serializable;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author iviettech
 */

@Repository
//@Transactional
public interface UserRepository extends CrudRepository<UserEntity,Integer>{   //Serializable => Integer --> tuong ung voi type id ben Entity co annotation @Id
    
    @Query(value ="select u from UserEntity u where u.firstName like ?1")
    public List<UserEntity> findUserByFirstName(String name);
    
    @Query(value ="select * from user u where u.firstname like ?1",nativeQuery=true)  //firstname =>column cua table,user = ten table trong DB
    public List<UserEntity> findUserByFirstNameNative(String name);
}
