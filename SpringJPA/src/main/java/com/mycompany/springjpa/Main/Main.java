/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springjpa.Main;

import com.mycompany.springjpa.Entity.UserEntity;
import com.mycompany.springjpa.Repository.UserRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author iviettech
 */
public class Main {
    public static void main(String[] args){
        
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/WEB-INF/Beans.xml");
        UserRepository userRepository = context.getBean("userRepository",UserRepository.class); //ten bean = ten class
        
//        UserEntity user = new UserEntity();
//        user.setFirstName("Hoang");
//        user.setLastName("Pham");
//        user.setEmail("t@t");
//        
//        UserEntity result = userRepository.save(user);
//        
//        if(result !=null)
//        {
//          System.out.println("insert succes with id=" +result.getId());
//        }
         //update
//        UserEntity user = userRepository.findOne(5);
//        user.setEmail("abc@bac");
//        UserEntity result = userRepository.save(user);
//        System.out.println("User:"+user.toString());
          //delete
//          userRepository.delete(4);
          
//          List<UserEntity> listUser = (List<UserEntity>) userRepository.findAll();
//          for (UserEntity l:listUser){
//          
//          System.out.println(l.toString());
//          }

//       List<UserEntity> listUser = userRepository.findUserByFirstName("a%");
       List<UserEntity> listUser = userRepository.findUserByFirstNameNative("a%");
       for(UserEntity l:listUser)
       {
         System.out.println(l.toString());
       }

//        EntityManagerFactory entityManagerFactory = context.getBean(EntityManagerFactory.class);
//        EntityManager entityManager= entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//        
//        //case1 : add new user
////         UserEntity user = new UserEntity();
////         user.setFirstName("Toan");
////         user.setLastName("Pham");
////         user.setEmail("h@h");
////         System.out.println("add new user succesful");
////         entityManager.persist(user);
//         
//        //case2: find user 
////         UserEntity user = entityManager.find(UserEntity.class,2); //7= id thang can tim
////         
////         System.out.println(user.toString());
//         
//         
//         //case 3: remove
////         entityManager.remove(user);
//         Query query = entityManager.createQuery("select u from UserEntity u where u.firstName like ?1");
////         entityManager.createNativeQuery("select * from user");
//         query.setParameter(1, "a%");
////         UserEntity user =(UserEntity) query.getSingleResult();
//        List<UserEntity> user =(List<UserEntity>) query.getResultList();
//        for (UserEntity t:user)
//        {
//          System.out.println(user.toString());
//        }
//         transaction.commit();
//         entityManager.close();

        
}
}
