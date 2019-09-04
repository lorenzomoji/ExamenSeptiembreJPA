package org.formacio.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "t_cases")
@SequenceGenerator(name="sequencia_casas", sequenceName="SEQ_CAS")
public class Casa {

	/**
	 * Casa ha d'emprar l'estrategia per l'id IDENTITY
	 */
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CAS_ID", nullable = false)
    private Long id;
	
	@Column(name = "adreça")
	private String adreca;
	
	@ManyToOne
	private Municipi municipi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdreca() {
		return adreca;
	}

	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}

	public Municipi getMunicipi() {
		return municipi;
	}

	public void setMunicipi(Municipi municipi) {
		this.municipi = municipi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Casa))
			return false;
		Casa other = (Casa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
