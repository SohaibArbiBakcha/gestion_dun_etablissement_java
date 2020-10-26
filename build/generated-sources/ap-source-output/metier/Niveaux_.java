package metier;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import metier.Filieres;
import metier.Groupes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-14T14:30:44")
@StaticMetamodel(Niveaux.class)
public class Niveaux_ { 

    public static volatile SingularAttribute<Niveaux, String> nomNiveau;
    public static volatile CollectionAttribute<Niveaux, Groupes> groupesCollection;
    public static volatile SingularAttribute<Niveaux, Integer> idNiveau;
    public static volatile CollectionAttribute<Niveaux, Filieres> filieresCollection;

}