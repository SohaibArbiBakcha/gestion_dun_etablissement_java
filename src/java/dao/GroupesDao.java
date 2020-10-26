/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import metier.Filieres;
import metier.Groupes;
import metier.Niveaux;

/**
 *
 * @author Med
 */
public class GroupesDao {
    public static void ajouterGroupe(String f , String n){
        int fil=Integer.valueOf(f);
        int niv=Integer.valueOf(n);
        EntityManagerFactory emf= javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();
        Filieres fl=new Filieres();
        fl.setIdFiliere(fil);
        Niveaux nv=new Niveaux();
        nv.setIdNiveau(niv);
        Groupes gr=new Groupes();
        gr.setIdFiliere(fl);
        gr.setIdNiveau(nv);
        List<Filieres> filiere= em.createNativeQuery("select * from filieres where id_filiere=?",Filieres.class).setParameter(1, fil).getResultList();
        String filieres="";
        if(filiere.isEmpty()==false){
            filieres=filiere.get(0).getNomFiliere();
        }
        List<Niveaux> niveau=em.createNativeQuery("select * from niveaux where id_niveau=?",Niveaux.class).setParameter(1, niv).getResultList();
        String niveaux="";
        if(niveau.isEmpty()==false){
            niveaux=niveau.get(0).getNomNiveau();
        }
        List<Groupes> groupe= em.createNativeQuery("select * from groupes where id_filiere=? and id_niveau=?",Groupes.class).setParameter(1, fil).setParameter(2, niv).getResultList();
        int i=0;
        if(groupe.isEmpty()==false){
            i=groupe.size()+1;
        }else{
            i=1;
        }
        gr.setIdGroupe(filieres+niveaux+""+i);
        em.persist(gr);
        em.getTransaction().commit();
    }
    
    public static List<Groupes> getall(){
        EntityManagerFactory emf= javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
        EntityManager em= emf.createEntityManager();
        List<Groupes> gr= em.createQuery("from Groupes g order by g.idGroupe").getResultList();
        return gr;
    }
}
