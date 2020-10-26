/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Med
 */
@Entity
@Table(name = "NIVEAUX")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Niveaux.findAll", query = "SELECT n FROM Niveaux n")
    , @NamedQuery(name = "Niveaux.findByIdNiveau", query = "SELECT n FROM Niveaux n WHERE n.idNiveau = :idNiveau")
    , @NamedQuery(name = "Niveaux.findByNomNiveau", query = "SELECT n FROM Niveaux n WHERE n.nomNiveau = :nomNiveau")})
public class Niveaux implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_NIVEAU")
    private Integer idNiveau;
    @Size(max = 30)
    @Column(name = "NOM_NIVEAU")
    private String nomNiveau;
    @JoinTable(name = "NIVEAUX_FILIERES", joinColumns = {
        @JoinColumn(name = "ID_NIVEAU", referencedColumnName = "ID_NIVEAU")}, inverseJoinColumns = {
        @JoinColumn(name = "ID_FILIERE", referencedColumnName = "ID_FILIERE")})
    @ManyToMany
    private Collection<Filieres> filieresCollection;
    @OneToMany(mappedBy = "idNiveau")
    private Collection<Groupes> groupesCollection;

    public Niveaux() {
    }

    public Niveaux(Integer idNiveau) {
        this.idNiveau = idNiveau;
    }

    public Integer getIdNiveau() {
        return idNiveau;
    }

    public void setIdNiveau(Integer idNiveau) {
        this.idNiveau = idNiveau;
    }

    public String getNomNiveau() {
        return nomNiveau;
    }

    public void setNomNiveau(String nomNiveau) {
        this.nomNiveau = nomNiveau;
    }

    @XmlTransient
    public Collection<Filieres> getFilieresCollection() {
        return filieresCollection;
    }

    public void setFilieresCollection(Collection<Filieres> filieresCollection) {
        this.filieresCollection = filieresCollection;
    }

    @XmlTransient
    public Collection<Groupes> getGroupesCollection() {
        return groupesCollection;
    }

    public void setGroupesCollection(Collection<Groupes> groupesCollection) {
        this.groupesCollection = groupesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNiveau != null ? idNiveau.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Niveaux)) {
            return false;
        }
        Niveaux other = (Niveaux) object;
        if ((this.idNiveau == null && other.idNiveau != null) || (this.idNiveau != null && !this.idNiveau.equals(other.idNiveau))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.Niveaux[ idNiveau=" + idNiveau + " ]";
    }
    
}
