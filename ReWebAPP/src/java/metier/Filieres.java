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
@Table(name = "FILIERES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Filieres.findAll", query = "SELECT f FROM Filieres f")
    , @NamedQuery(name = "Filieres.findByIdFiliere", query = "SELECT f FROM Filieres f WHERE f.idFiliere = :idFiliere")
    , @NamedQuery(name = "Filieres.findByNomFiliere", query = "SELECT f FROM Filieres f WHERE f.nomFiliere = :nomFiliere")
    , @NamedQuery(name = "Filieres.findByPrixMensuel", query = "SELECT f FROM Filieres f WHERE f.prixMensuel = :prixMensuel")})
public class Filieres implements Serializable {

    @OneToMany(mappedBy = "idFiliere")
    private Collection<Groupes> groupesCollection;

    @OneToMany(mappedBy = "idFiliere")
    private Collection<EtudiantsFilieres> etudiantsFilieresCollection;

    @ManyToMany(mappedBy = "filieresCollection")
    private Collection<Etudiants> etudiantsCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FILIERE")
    private Integer idFiliere;
    @Size(max = 30)
    @Column(name = "NOM_FILIERE")
    private String nomFiliere;
    @Column(name = "PRIX_MENSUEL")
    private Integer prixMensuel;

    public Filieres() {
    }

    public Filieres(Integer idFiliere) {
        this.idFiliere = idFiliere;
    }

    public Integer getIdFiliere() {
        return idFiliere;
    }

    public void setIdFiliere(Integer idFiliere) {
        this.idFiliere = idFiliere;
    }

    public String getNomFiliere() {
        return nomFiliere;
    }

    public void setNomFiliere(String nomFiliere) {
        this.nomFiliere = nomFiliere;
    }

    public Integer getPrixMensuel() {
        return prixMensuel;
    }

    public void setPrixMensuel(Integer prixMensuel) {
        this.prixMensuel = prixMensuel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFiliere != null ? idFiliere.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Filieres)) {
            return false;
        }
        Filieres other = (Filieres) object;
        if ((this.idFiliere == null && other.idFiliere != null) || (this.idFiliere != null && !this.idFiliere.equals(other.idFiliere))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.Filieres[ idFiliere=" + idFiliere + " ]";
    }

    @XmlTransient
    public Collection<Etudiants> getEtudiantsCollection() {
        return etudiantsCollection;
    }

    public void setEtudiantsCollection(Collection<Etudiants> etudiantsCollection) {
        this.etudiantsCollection = etudiantsCollection;
    }

    @XmlTransient
    public Collection<EtudiantsFilieres> getEtudiantsFilieresCollection() {
        return etudiantsFilieresCollection;
    }

    public void setEtudiantsFilieresCollection(Collection<EtudiantsFilieres> etudiantsFilieresCollection) {
        this.etudiantsFilieresCollection = etudiantsFilieresCollection;
    }

    @XmlTransient
    public Collection<Groupes> getGroupesCollection() {
        return groupesCollection;
    }

    public void setGroupesCollection(Collection<Groupes> groupesCollection) {
        this.groupesCollection = groupesCollection;
    }
    
}
