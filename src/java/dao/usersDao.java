/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import metier.Users;

/**
 *
 * @author Med
 */
public class usersDao {
    public static List<Users> getuser(String username, String password){
        EntityManagerFactory emf= javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em=emf.createEntityManager();
        return em.createQuery("from Users us where us.username='"+username+"' and us.password='"+password+"'").getResultList();
    }
}
