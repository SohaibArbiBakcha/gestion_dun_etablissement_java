/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import metier.Paiements;

/**
 *
 * @author Med
 */
public class paimentsDao {
    public static List<Paiements> getall(String cin){
        EntityManagerFactory emf= javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em =emf.createEntityManager();
        List<Paiements> li=em.createQuery("from Paiements p where p.cin='"+cin+"'").getResultList();
        return li;
    }
    
    public static List<Paiements> gettPaiements(){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em = emf.createEntityManager();
        List<Paiements> p= em.createQuery("from Paiements e").getResultList();
        return p;
    }
    
    public static void payer(String cin , String mois){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
        EntityManagerFactory emf=javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        List<Paiements> all= em.createNativeQuery("select* from PAIEMENTS").getResultList();
        int a=0;
        if(all.isEmpty()){
            a=1;
        }else{
            a=all.size()+1;
        }
        Date d=new Date();
        List<Paiements> l= em.createNativeQuery("select* from PAIEMENTS where CIN='"+cin+"'").getResultList();
        if(l.isEmpty()){
            em.createNativeQuery("insert into PAIEMENTS values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)").setParameter(1, a).setParameter(2, cin).setParameter(3, sdf.format(d.getYear())).setParameter(4, "paye").setParameter(5, null).setParameter(6, null).setParameter(7, null).setParameter(8, null).setParameter(9, null).setParameter(10, null).setParameter(11, null).setParameter(12, null).setParameter(13, null).setParameter(14, null).executeUpdate();
            em.createNativeQuery("update etudiants set VALIDATION='valide' where cin='"+cin+"'").executeUpdate();
        }else{
            em.createNativeQuery("update PAIEMENTS set "+mois+" = 'paye' where cin ='"+cin+"'").executeUpdate();
        }
        em.getTransaction().commit();
    }
}
