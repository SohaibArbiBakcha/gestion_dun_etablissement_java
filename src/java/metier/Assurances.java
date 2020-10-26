/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Med
 */
@Entity
@Table(name = "ASSURANCES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Assurances.findAll", query = "SELECT a FROM Assurances a")
    , @NamedQuery(name = "Assurances.findByIdAssurances", query = "SELECT a FROM Assurances a WHERE a.idAssurances = :idAssurances")
    , @NamedQuery(name = "Assurances.findByCin", query = "SELECT a FROM Assurances a WHERE a.cin = :cin")
    , @NamedQuery(name = "Assurances.findByValidation", query = "SELECT a FROM Assurances a WHERE a.validation = :validation")})
public class Assurances implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ASSURANCES")
    private Integer idAssurances;
    @Size(max = 10)
    @Column(name = "CIN")
    private String cin;
    @Size(max = 10)
    @Column(name = "VALIDATION")
    private String validation;

    public Assurances() {
    }

    public Assurances(Integer idAssurances) {
        this.idAssurances = idAssurances;
    }

    public Integer getIdAssurances() {
        return idAssurances;
    }

    public void setIdAssurances(Integer idAssurances) {
        this.idAssurances = idAssurances;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAssurances != null ? idAssurances.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assurances)) {
            return false;
        }
        Assurances other = (Assurances) object;
        if ((this.idAssurances == null && other.idAssurances != null) || (this.idAssurances != null && !this.idAssurances.equals(other.idAssurances))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.Assurances[ idAssurances=" + idAssurances + " ]";
    }
    
}
