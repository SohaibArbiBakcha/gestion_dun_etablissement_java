/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import metier.Assurances;

/**
 *
 * @author Med
 */
public class assurancesDao {
    public static void asser(String cin , String asser){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Assurances> as= em.createNativeQuery("select * from ASSURANCES").getResultList();
        int a=0;
        if(as.isEmpty()){
            a=1;
        }else{
            a=as.size()+1;
        }
        if(asser.equals("paye")){
            em.createNativeQuery("insert into ASSURANCES values(?,?,?)").setParameter(1, a).setParameter(2, cin).setParameter(3, "assure").executeUpdate();
        }
    }
    
    public static List<Assurances> getAssurance(String cin){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em = emf.createEntityManager();
        List<Assurances> ass= em.createQuery("from Assurances a where a.cin='"+cin+"'").getResultList();
        return ass;
    }
    
    public static List<Assurances> getAll(){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em = emf.createEntityManager();
        List<Assurances> ass= em.createQuery("from Assurances a").getResultList();
        return ass;
    }
}
