/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Med
 */
@Embeddable
public class NiveauxFilieresPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_NIVEAU")
    private int idNiveau;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FILIERE")
    private int idFiliere;

    public NiveauxFilieresPK() {
    }

    public NiveauxFilieresPK(int idNiveau, int idFiliere) {
        this.idNiveau = idNiveau;
        this.idFiliere = idFiliere;
    }

    public int getIdNiveau() {
        return idNiveau;
    }

    public void setIdNiveau(int idNiveau) {
        this.idNiveau = idNiveau;
    }

    public int getIdFiliere() {
        return idFiliere;
    }

    public void setIdFiliere(int idFiliere) {
        this.idFiliere = idFiliere;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idNiveau;
        hash += (int) idFiliere;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NiveauxFilieresPK)) {
            return false;
        }
        NiveauxFilieresPK other = (NiveauxFilieresPK) object;
        if (this.idNiveau != other.idNiveau) {
            return false;
        }
        if (this.idFiliere != other.idFiliere) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.NiveauxFilieresPK[ idNiveau=" + idNiveau + ", idFiliere=" + idFiliere + " ]";
    }
    
}
