package tg.ip.net.itchallengers.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Droit.class)
public abstract class Droit_ {

	public static volatile ListAttribute<Droit, Privilege> listPrivileges;
	public static volatile SingularAttribute<Droit, String> libelle;
	public static volatile ListAttribute<Droit, Utilisateur> listUtilisateurs;
	public static volatile SingularAttribute<Droit, Long> id;
	public static volatile SingularAttribute<Droit, String> cle;

}

