package tg.ip.net.itchallengers.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Privilege.class)
public abstract class Privilege_ {

	public static volatile SingularAttribute<Privilege, String> libelle;
	public static volatile SingularAttribute<Privilege, Droit> droit;
	public static volatile SingularAttribute<Privilege, Long> id;
	public static volatile SingularAttribute<Privilege, String> cle;

}

