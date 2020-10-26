package metier;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import metier.Filieres;
import metier.Niveaux;
import metier.NiveauxFilieresPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-14T14:30:44")
@StaticMetamodel(NiveauxFilieres.class)
public class NiveauxFilieres_ { 

    public static volatile SingularAttribute<NiveauxFilieres, NiveauxFilieresPK> niveauxFilieresPK;
    public static volatile SingularAttribute<NiveauxFilieres, Niveaux> niveaux;
    public static volatile SingularAttribute<NiveauxFilieres, Filieres> filieres;
    public static volatile SingularAttribute<NiveauxFilieres, Integer> idAffectation;

}