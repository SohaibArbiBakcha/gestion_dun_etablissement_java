package metier;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import metier.Groupes;
import metier.Niveaux;
import metier.NiveauxFilieres;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-14T14:30:44")
@StaticMetamodel(Filieres.class)
public class Filieres_ { 

    public static volatile CollectionAttribute<Filieres, Groupes> groupesCollection;
    public static volatile SingularAttribute<Filieres, String> nomFiliere;
    public static volatile SingularAttribute<Filieres, Integer> idFiliere;
    public static volatile CollectionAttribute<Filieres, NiveauxFilieres> niveauxFilieresCollection;
    public static volatile CollectionAttribute<Filieres, Niveaux> niveauxCollection;

}