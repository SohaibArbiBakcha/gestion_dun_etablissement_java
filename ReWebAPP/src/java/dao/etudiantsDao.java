/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import metier.Etudiants;

/**
 *
 * @author Med
 */
public class etudiantsDao {
    public static void ajouteretudiant(String cin , String nom , String prenom , String date_De_Naissance , String sexe , String nasionalite , String lien_DeNaissance) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        EntityManagerFactory emf= javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em= emf.createEntityManager();
        List<Etudiants> id=em.createNativeQuery("select * from etudiants").getResultList();
        em.getTransaction().begin();
        int a=0;
        if(id.isEmpty()){
            a=1;
        }else{
            a=id.size()+1;
        }
        try {
            em.createNativeQuery("insert into etudiants values(?,?,?,?,?,?,?,?,?)").setParameter(1, a).setParameter(2, cin).setParameter(3, nom).setParameter(4, prenom).setParameter(5, sdf.parse(date_De_Naissance)).setParameter(6, sexe).setParameter(7, nasionalite).setParameter(8, lien_DeNaissance).setParameter(9, null).executeUpdate();
        } catch (ParseException ex) {
            Logger.getLogger(etudiantsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        em.getTransaction().commit();
    }
    public static List<Etudiants> getAll(){
        EntityManagerFactory emf=javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em= emf.createEntityManager();
        List<Etudiants> l= em.createQuery("from Etudiants e order by e.nom , e.prenom").getResultList();
        return l;
    }
    
    public static List<Etudiants> getEtudiantWithCIN(String cin){
        EntityManagerFactory emf=javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em= emf.createEntityManager();
        List<Etudiants> l= em.createQuery("from Etudiants e where e.cin='"+cin+"'").getResultList();
        return l;
    }
}
