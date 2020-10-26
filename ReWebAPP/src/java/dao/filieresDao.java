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
/**
 *
 * @author Med
 */
public class filieresDao {
    public static void ajouterFiliere(String nomFiliere , String prix){
        EntityManagerFactory emf= javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        List<Filieres> l= em.createNativeQuery("select * from filieres").getResultList();
        Filieres f=new Filieres();
        if(l.isEmpty()){
            f.setIdFiliere(1);
        }else{
            f.setIdFiliere(l.size()+1);
        }
        f.setNomFiliere(nomFiliere);
        f.setPrixMensuel(Integer.valueOf(prix));
        em.persist(f);
        em.getTransaction().commit();
    }
    public static List<Filieres> getAllF(){
        EntityManagerFactory emf= javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em= emf.createEntityManager();
        return em.createQuery("from Filieres f").getResultList();
    }
}
