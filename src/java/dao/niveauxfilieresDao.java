/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import metier.Filieres;
import metier.Niveaux;
import metier.NiveauxFilieres;

/**
 *
 * @author Med
 */
public class niveauxfilieresDao {
    public static void affecterNiveauGroupe(String f , String n){
        EntityManagerFactory emf= javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        Integer a=Integer.valueOf(f) , b=Integer.valueOf(n);
        List<NiveauxFilieres> l=em.createNativeQuery("select * from niveaux_filieres",NiveauxFilieres.class).getResultList();
        int size=0;
        if(l.isEmpty()){
            size=1;
        }else{
            size=l.size()+1;
        }
        em.createNativeQuery("insert into niveaux_filieres values(?,?,?)").setParameter(1, size).setParameter(2, b).setParameter(3, a).executeUpdate();
        //List<NiveauxFilieres> l=em.createQuery("from NiveauxFilieres n").getResultList();
        em.getTransaction().commit();
    }
}
