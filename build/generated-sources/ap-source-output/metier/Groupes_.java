package metier;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import metier.Etudiants;
import metier.Filieres;
import metier.Niveaux;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-14T14:30:44")
@StaticMetamodel(Groupes.class)
public class Groupes_ { 

    public static volatile CollectionAttribute<Groupes, Etudiants> etudiantsCollection;
    public static volatile SingularAttribute<Groupes, Filieres> idFiliere;
    public static volatile SingularAttribute<Groupes, Niveaux> idNiveau;
    public static volatile SingularAttribute<Groupes, String> idGroupe;

}