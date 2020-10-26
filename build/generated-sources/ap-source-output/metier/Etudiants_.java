package metier;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import metier.Groupes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-14T14:30:44")
@StaticMetamodel(Etudiants.class)
public class Etudiants_ { 

    public static volatile SingularAttribute<Etudiants, Date> dateDeNaissance;
    public static volatile SingularAttribute<Etudiants, String> lienDenaissance;
    public static volatile CollectionAttribute<Etudiants, Groupes> groupesCollection;
    public static volatile SingularAttribute<Etudiants, String> nasionalite;
    public static volatile SingularAttribute<Etudiants, String> cin;
    public static volatile SingularAttribute<Etudiants, String> sexe;
    public static volatile SingularAttribute<Etudiants, String> nom;
    public static volatile SingularAttribute<Etudiants, String> prenom;
    public static volatile SingularAttribute<Etudiants, String> validation;
    public static volatile SingularAttribute<Etudiants, Integer> idEtudiant;

}