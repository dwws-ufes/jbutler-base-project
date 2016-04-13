package br.ufes.inf.nemo.marvin.people.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport_;

@Generated(value = "Dali", date = "2016-03-11T12:28:07.149-0300")
@StaticMetamodel(Telephone.class)
public class Telephone_ extends PersistentObjectSupport_ {
	public static volatile SingularAttribute<Telephone, String> number;
	public static volatile SingularAttribute<Telephone, ContactType> type;
}
