package metier;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-14T14:30:44")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, Date> datelogin;
    public static volatile SingularAttribute<Users, String> type;
    public static volatile SingularAttribute<Users, String> nom;
    public static volatile SingularAttribute<Users, String> prenom;
    public static volatile SingularAttribute<Users, String> username;

}