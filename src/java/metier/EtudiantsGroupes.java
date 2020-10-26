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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Med
 */
@Entity
@Table(name = "ETUDIANTS_GROUPES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EtudiantsGroupes.findAll", query = "SELECT e FROM EtudiantsGroupes e")
    , @NamedQuery(name = "EtudiantsGroupes.findByIdAffectation", query = "SELECT e FROM EtudiantsGroupes e WHERE e.idAffectation = :idAffectation")})
public class EtudiantsGroupes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AFFECTATION")
    private Integer idAffectation;
    @JoinColumn(name = "ID_ETUDIANTS", referencedColumnName = "ID_ETUDIANT")
    @ManyToOne
    private Etudiants idEtudiants;
    @JoinColumn(name = "ID_GROUPE", referencedColumnName = "ID_GROUPE")
    @ManyToOne
    private Groupes idGroupe;

    public EtudiantsGroupes() {
    }

    public EtudiantsGroupes(Integer idAffectation) {
        this.idAffectation = idAffectation;
    }

    public Integer getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(Integer idAffectation) {
        this.idAffectation = idAffectation;
    }

    public Etudiants getIdEtudiants() {
        return idEtudiants;
    }

    public void setIdEtudiants(Etudiants idEtudiants) {
        this.idEtudiants = idEtudiants;
    }

    public Groupes getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(Groupes idGroupe) {
        this.idGroupe = idGroupe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAffectation != null ? idAffectation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtudiantsGroupes)) {
            return false;
        }
        EtudiantsGroupes other = (EtudiantsGroupes) object;
        if ((this.idAffectation == null && other.idAffectation != null) || (this.idAffectation != null && !this.idAffectation.equals(other.idAffectation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.EtudiantsGroupes[ idAffectation=" + idAffectation + " ]";
    }
    
}
