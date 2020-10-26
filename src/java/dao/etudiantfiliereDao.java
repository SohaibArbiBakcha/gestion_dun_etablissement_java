/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import metier.Etudiants;
import metier.EtudiantsFilieres;
import metier.Filieres;

/**
 *
 * @author Med
 */
public class etudiantfiliereDao {
    public static void affecterEtudiantFiliere(String etud , String fil){
        EntityManagerFactory emf= javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        List<EtudiantsFilieres> l= em.createNativeQuery("select * from ETUDIANTS_FILIERES",EtudiantsFilieres.class).getResultList();
        int s=0;
        if(l.isEmpty()){
            s=1;
        }else{
            s=l.size()+1;
        }
        em.createNativeQuery("insert into ETUDIANTS_FILIERES values(?,?,?)").setParameter(1, s).setParameter(2, Integer.valueOf(etud)).setParameter(3, Integer.valueOf(fil)).executeUpdate();
        em.getTransaction().commit();
    }
    
    public static List<EtudiantsFilieres> getidFiliere(int id){
        EntityManagerFactory emf= javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em=emf.createEntityManager();
        List<EtudiantsFilieres> l=em.createNativeQuery("select * from ETUDIANTS_FILIERES where ID_ETUDIANTS="+id).getResultList();
        return l;
    }
}
