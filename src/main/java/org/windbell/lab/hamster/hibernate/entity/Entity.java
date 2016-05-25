package org.windbell.lab.hamster.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Where;

@MappedSuperclass
@SuppressWarnings("serial")
abstract class Entity extends BaseEntity{
	@Where(clause = "DELETED = 1")
	@Column(name="DELETED")
	private boolean deleted=false;
	
	public final boolean isDeleted() {
		return deleted;
	}
	public final void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}
