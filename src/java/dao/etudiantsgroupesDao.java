/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import metier.EtudiantsGroupes;

/**
 *
 * @author Med
 */
public class etudiantsgroupesDao {
    public static void affecterGroupe(String id , String groupe){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<EtudiantsGroupes> gr = em.createQuery("from EtudiantsGroupes eg").getResultList();
        int a=0;
        if(gr.isEmpty()){
            a=1;
        }else{
            a=gr.size()+1;
        }
        int etud=Integer.valueOf(id);
        em.createNativeQuery("insert into Etudiants_groupes values(?,?,?)").setParameter(1, a).setParameter(2, etud).setParameter(3, groupe).executeUpdate();
        em.getTransaction().commit();
    }
}
