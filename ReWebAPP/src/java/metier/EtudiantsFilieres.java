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
@Table(name = "ETUDIANTS_FILIERES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EtudiantsFilieres.findAll", query = "SELECT e FROM EtudiantsFilieres e")
    , @NamedQuery(name = "EtudiantsFilieres.findByIdAffectation", query = "SELECT e FROM EtudiantsFilieres e WHERE e.idAffectation = :idAffectation")})
public class EtudiantsFilieres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AFFECTATION")
    private Integer idAffectation;
    @JoinColumn(name = "ID_ETUDIANTS", referencedColumnName = "ID_ETUDIANT")
    @ManyToOne
    private Etudiants idEtudiants;
    @JoinColumn(name = "ID_FILIERE", referencedColumnName = "ID_FILIERE")
    @ManyToOne
    private Filieres idFiliere;

    public EtudiantsFilieres() {
    }

    public EtudiantsFilieres(Integer idAffectation) {
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

    public Filieres getIdFiliere() {
        return idFiliere;
    }

    public void setIdFiliere(Filieres idFiliere) {
        this.idFiliere = idFiliere;
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
        if (!(object instanceof EtudiantsFilieres)) {
            return false;
        }
        EtudiantsFilieres other = (EtudiantsFilieres) object;
        if ((this.idAffectation == null && other.idAffectation != null) || (this.idAffectation != null && !this.idAffectation.equals(other.idAffectation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.EtudiantsFilieres[ idAffectation=" + idAffectation + " ]";
    }
    
}
