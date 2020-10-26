<%-- 
    Document   : nomgroup
    Created on : 12 mars 2020, 17:41:18
    Author     : Med
--%>

<%@page import="metier.Groupes"%>
<%@page import="metier.Niveaux"%>
<%@page import="java.util.List"%>
<%@page import="metier.Filieres"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    EntityManagerFactory emf= javax.persistence.Persistence.createEntityManagerFactory("ReWebAPPPU");
    EntityManager em= emf.createEntityManager();
    String f=request.getParameter("f");
    String n=request.getParameter("n");
    List<Filieres> fil=em.createQuery("from Filieres f where id_filiere="+f).getResultList();
    List<Niveaux> niv=em.createQuery("from Niveaux n where id_niveau="+n).getResultList();
    List<Groupes> gr=em.createQuery("from Groupes g").getResultList();
    int a=0;
    for(int i=0 ; i<gr.size() ; i++){
    }
    out.println(fil.get(0).getNomFiliere()+niv.get(0).getNomNiveau());
%>
