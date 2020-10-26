/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import metier.Niveaux;

/**
 *
 * @author Med
 */
public class niveauxDao {
    public static void ajouterniveau(String nom_niveau){
        EntityManagerFactory emf= javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em=emf.createEntityManager();
        List<Niveaux> id=em.createQuery("from Niveaux n").getResultList();
        em.getTransaction().begin();
        Niveaux n=new Niveaux();
        n.setIdNiveau(id.size()+1);
        n.setNomNiveau(nom_niveau);
        em.persist(n);
        em.getTransaction().commit();
    }
    public static List<Niveaux> getAllN(){
        EntityManagerFactory emf= javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em= emf.createEntityManager();
        return em.createQuery("from Niveaux n").getResultList();
    }
}
