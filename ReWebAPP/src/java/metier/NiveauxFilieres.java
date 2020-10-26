/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Med
 */
@Entity
@Table(name = "NIVEAUX_FILIERES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NiveauxFilieres.findAll", query = "SELECT n FROM NiveauxFilieres n")
    , @NamedQuery(name = "NiveauxFilieres.findByIdAffectation", query = "SELECT n FROM NiveauxFilieres n WHERE n.idAffectation = :idAffectation")
    , @NamedQuery(name = "NiveauxFilieres.findByIdNiveau", query = "SELECT n FROM NiveauxFilieres n WHERE n.niveauxFilieresPK.idNiveau = :idNiveau")
    , @NamedQuery(name = "NiveauxFilieres.findByIdFiliere", query = "SELECT n FROM NiveauxFilieres n WHERE n.niveauxFilieresPK.idFiliere = :idFiliere")})
public class NiveauxFilieres implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NiveauxFilieresPK niveauxFilieresPK;
    @Column(name = "ID_AFFECTATION")
    private Integer idAffectation;
    @JoinColumn(name = "ID_FILIERE", referencedColumnName = "ID_FILIERE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Filieres filieres;
    @JoinColumn(name = "ID_NIVEAU", referencedColumnName = "ID_NIVEAU", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Niveaux niveaux;

    public NiveauxFilieres() {
    }

    public NiveauxFilieres(NiveauxFilieresPK niveauxFilieresPK) {
        this.niveauxFilieresPK = niveauxFilieresPK;
    }

    public NiveauxFilieres(int idNiveau, int idFiliere) {
        this.niveauxFilieresPK = new NiveauxFilieresPK(idNiveau, idFiliere);
    }

    public NiveauxFilieresPK getNiveauxFilieresPK() {
        return niveauxFilieresPK;
    }

    public void setNiveauxFilieresPK(NiveauxFilieresPK niveauxFilieresPK) {
        this.niveauxFilieresPK = niveauxFilieresPK;
    }

    public Integer getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(Integer idAffectation) {
        this.idAffectation = idAffectation;
    }

    public Filieres getFilieres() {
        return filieres;
    }

    public void setFilieres(Filieres filieres) {
        this.filieres = filieres;
    }

    public Niveaux getNiveaux() {
        return niveaux;
    }

    public void setNiveaux(Niveaux niveaux) {
        this.niveaux = niveaux;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (niveauxFilieresPK != null ? niveauxFilieresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NiveauxFilieres)) {
            return false;
        }
        NiveauxFilieres other = (NiveauxFilieres) object;
        if ((this.niveauxFilieresPK == null && other.niveauxFilieresPK != null) || (this.niveauxFilieresPK != null && !this.niveauxFilieresPK.equals(other.niveauxFilieresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.NiveauxFilieres[ niveauxFilieresPK=" + niveauxFilieresPK + " ]";
    }
    
}
