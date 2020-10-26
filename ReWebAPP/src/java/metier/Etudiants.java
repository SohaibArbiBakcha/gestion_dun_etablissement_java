/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Med
 */
@Entity
@Table(name = "ETUDIANTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etudiants.findAll", query = "SELECT e FROM Etudiants e")
    , @NamedQuery(name = "Etudiants.findByIdEtudiant", query = "SELECT e FROM Etudiants e WHERE e.idEtudiant = :idEtudiant")
    , @NamedQuery(name = "Etudiants.findByCin", query = "SELECT e FROM Etudiants e WHERE e.cin = :cin")
    , @NamedQuery(name = "Etudiants.findByNom", query = "SELECT e FROM Etudiants e WHERE e.nom = :nom")
    , @NamedQuery(name = "Etudiants.findByPrenom", query = "SELECT e FROM Etudiants e WHERE e.prenom = :prenom")
    , @NamedQuery(name = "Etudiants.findByDateDeNaissance", query = "SELECT e FROM Etudiants e WHERE e.dateDeNaissance = :dateDeNaissance")
    , @NamedQuery(name = "Etudiants.findBySexe", query = "SELECT e FROM Etudiants e WHERE e.sexe = :sexe")
    , @NamedQuery(name = "Etudiants.findByNasionalite", query = "SELECT e FROM Etudiants e WHERE e.nasionalite = :nasionalite")
    , @NamedQuery(name = "Etudiants.findByLienDenaissance", query = "SELECT e FROM Etudiants e WHERE e.lienDenaissance = :lienDenaissance")
    , @NamedQuery(name = "Etudiants.findByValidation", query = "SELECT e FROM Etudiants e WHERE e.validation = :validation")})
public class Etudiants implements Serializable {

    @OneToMany(mappedBy = "idEtudiants")
    private Collection<EtudiantsGroupes> etudiantsGroupesCollection;

    @OneToMany(mappedBy = "idEtudiants")
    private Collection<EtudiantsFilieres> etudiantsFilieresCollection;

    @JoinTable(name = "ETUDIANTS_FILIERES", joinColumns = {
        @JoinColumn(name = "ID_ETUDIANTS", referencedColumnName = "ID_ETUDIANT")}, inverseJoinColumns = {
        @JoinColumn(name = "ID_FILIERE", referencedColumnName = "ID_FILIERE")})
    @ManyToMany
    private Collection<Filieres> filieresCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ETUDIANT")
    private Integer idEtudiant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CIN")
    private String cin;
    @Size(max = 30)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 30)
    @Column(name = "PRENOM")
    private String prenom;
    @Column(name = "DATE_DE_NAISSANCE")
    @Temporal(TemporalType.DATE)
    private Date dateDeNaissance;
    @Size(max = 10)
    @Column(name = "SEXE")
    private String sexe;
    @Size(max = 30)
    @Column(name = "NASIONALITE")
    private String nasionalite;
    @Size(max = 30)
    @Column(name = "LIEN_DENAISSANCE")
    private String lienDenaissance;
    @Size(max = 10)
    @Column(name = "VALIDATION")
    private String validation;
    @JoinTable(name = "ETUDIANTS_GROUPES", joinColumns = {
        @JoinColumn(name = "ID_ETUDIANTS", referencedColumnName = "ID_ETUDIANT")}, inverseJoinColumns = {
        @JoinColumn(name = "ID_GROUPE", referencedColumnName = "ID_GROUPE")})
    @ManyToMany
    private Collection<Groupes> groupesCollection;

    public Etudiants() {
    }

    public Etudiants(Integer idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public Etudiants(Integer idEtudiant, String cin) {
        this.idEtudiant = idEtudiant;
        this.cin = cin;
    }

    public Integer getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Integer idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNasionalite() {
        return nasionalite;
    }

    public void setNasionalite(String nasionalite) {
        this.nasionalite = nasionalite;
    }

    public String getLienDenaissance() {
        return lienDenaissance;
    }

    public void setLienDenaissance(String lienDenaissance) {
        this.lienDenaissance = lienDenaissance;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
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
        hash += (idEtudiant != null ? idEtudiant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiants)) {
            return false;
        }
        Etudiants other = (Etudiants) object;
        if ((this.idEtudiant == null && other.idEtudiant != null) || (this.idEtudiant != null && !this.idEtudiant.equals(other.idEtudiant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.Etudiants[ idEtudiant=" + idEtudiant + " ]";
    }

    @XmlTransient
    public Collection<Filieres> getFilieresCollection() {
        return filieresCollection;
    }

    public void setFilieresCollection(Collection<Filieres> filieresCollection) {
        this.filieresCollection = filieresCollection;
    }

    @XmlTransient
    public Collection<EtudiantsFilieres> getEtudiantsFilieresCollection() {
        return etudiantsFilieresCollection;
    }

    public void setEtudiantsFilieresCollection(Collection<EtudiantsFilieres> etudiantsFilieresCollection) {
        this.etudiantsFilieresCollection = etudiantsFilieresCollection;
    }

    @XmlTransient
    public Collection<EtudiantsGroupes> getEtudiantsGroupesCollection() {
        return etudiantsGroupesCollection;
    }

    public void setEtudiantsGroupesCollection(Collection<EtudiantsGroupes> etudiantsGroupesCollection) {
        this.etudiantsGroupesCollection = etudiantsGroupesCollection;
    }
    
}
