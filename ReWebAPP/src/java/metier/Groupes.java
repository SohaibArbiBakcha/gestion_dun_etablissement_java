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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "GROUPES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groupes.findAll", query = "SELECT g FROM Groupes g")
    , @NamedQuery(name = "Groupes.findByIdGroupe", query = "SELECT g FROM Groupes g WHERE g.idGroupe = :idGroupe")})
public class Groupes implements Serializable {

    @OneToMany(mappedBy = "idGroupe")
    private Collection<EtudiantsGroupes> etudiantsGroupesCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ID_GROUPE")
    private String idGroupe;
    @ManyToMany(mappedBy = "groupesCollection")
    private Collection<Etudiants> etudiantsCollection;
    @JoinColumn(name = "ID_FILIERE", referencedColumnName = "ID_FILIERE")
    @ManyToOne
    private Filieres idFiliere;
    @JoinColumn(name = "ID_NIVEAU", referencedColumnName = "ID_NIVEAU")
    @ManyToOne
    private Niveaux idNiveau;

    public Groupes() {
    }

    public Groupes(String idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(String idGroupe) {
        this.idGroupe = idGroupe;
    }

    @XmlTransient
    public Collection<Etudiants> getEtudiantsCollection() {
        return etudiantsCollection;
    }

    public void setEtudiantsCollection(Collection<Etudiants> etudiantsCollection) {
        this.etudiantsCollection = etudiantsCollection;
    }

    public Filieres getIdFiliere() {
        return idFiliere;
    }

    public void setIdFiliere(Filieres idFiliere) {
        this.idFiliere = idFiliere;
    }

    public Niveaux getIdNiveau() {
        return idNiveau;
    }

    public void setIdNiveau(Niveaux idNiveau) {
        this.idNiveau = idNiveau;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGroupe != null ? idGroupe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupes)) {
            return false;
        }
        Groupes other = (Groupes) object;
        if ((this.idGroupe == null && other.idGroupe != null) || (this.idGroupe != null && !this.idGroupe.equals(other.idGroupe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.Groupes[ idGroupe=" + idGroupe + " ]";
    }

    @XmlTransient
    public Collection<EtudiantsGroupes> getEtudiantsGroupesCollection() {
        return etudiantsGroupesCollection;
    }

    public void setEtudiantsGroupesCollection(Collection<EtudiantsGroupes> etudiantsGroupesCollection) {
        this.etudiantsGroupesCollection = etudiantsGroupesCollection;
    }
    
}
