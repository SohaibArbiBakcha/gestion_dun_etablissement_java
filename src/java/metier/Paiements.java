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
@Table(name = "PAIEMENTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paiements.findAll", query = "SELECT p FROM Paiements p")
    , @NamedQuery(name = "Paiements.findByIdPaiement", query = "SELECT p FROM Paiements p WHERE p.idPaiement = :idPaiement")
    , @NamedQuery(name = "Paiements.findByCin", query = "SELECT p FROM Paiements p WHERE p.cin = :cin")
    , @NamedQuery(name = "Paiements.findByAnneeScolaire", query = "SELECT p FROM Paiements p WHERE p.anneeScolaire = :anneeScolaire")
    , @NamedQuery(name = "Paiements.findBySept", query = "SELECT p FROM Paiements p WHERE p.sept = :sept")
    , @NamedQuery(name = "Paiements.findByOct", query = "SELECT p FROM Paiements p WHERE p.oct = :oct")
    , @NamedQuery(name = "Paiements.findByNov", query = "SELECT p FROM Paiements p WHERE p.nov = :nov")
    , @NamedQuery(name = "Paiements.findByDec", query = "SELECT p FROM Paiements p WHERE p.dec = :dec")
    , @NamedQuery(name = "Paiements.findByJanv", query = "SELECT p FROM Paiements p WHERE p.janv = :janv")
    , @NamedQuery(name = "Paiements.findByFevr", query = "SELECT p FROM Paiements p WHERE p.fevr = :fevr")
    , @NamedQuery(name = "Paiements.findByMar", query = "SELECT p FROM Paiements p WHERE p.mar = :mar")
    , @NamedQuery(name = "Paiements.findByAvr", query = "SELECT p FROM Paiements p WHERE p.avr = :avr")
    , @NamedQuery(name = "Paiements.findByMai", query = "SELECT p FROM Paiements p WHERE p.mai = :mai")
    , @NamedQuery(name = "Paiements.findByJuin", query = "SELECT p FROM Paiements p WHERE p.juin = :juin")
    , @NamedQuery(name = "Paiements.findByJuil", query = "SELECT p FROM Paiements p WHERE p.juil = :juil")})
public class Paiements implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PAIEMENT")
    private Integer idPaiement;
    @Size(max = 10)
    @Column(name = "CIN")
    private String cin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ANNEE_SCOLAIRE")
    private String anneeScolaire;
    @Size(max = 10)
    @Column(name = "SEPT")
    private String sept;
    @Size(max = 10)
    @Column(name = "OCT")
    private String oct;
    @Size(max = 10)
    @Column(name = "NOV")
    private String nov;
    @Size(max = 10)
    @Column(name = "DEC")
    private String dec;
    @Size(max = 10)
    @Column(name = "JANV")
    private String janv;
    @Size(max = 10)
    @Column(name = "FEVR")
    private String fevr;
    @Size(max = 10)
    @Column(name = "MAR")
    private String mar;
    @Size(max = 10)
    @Column(name = "AVR")
    private String avr;
    @Size(max = 10)
    @Column(name = "MAI")
    private String mai;
    @Size(max = 10)
    @Column(name = "JUIN")
    private String juin;
    @Size(max = 10)
    @Column(name = "JUIL")
    private String juil;

    public Paiements() {
    }

    public Paiements(Integer idPaiement) {
        this.idPaiement = idPaiement;
    }

    public Paiements(Integer idPaiement, String anneeScolaire) {
        this.idPaiement = idPaiement;
        this.anneeScolaire = anneeScolaire;
    }

    public Integer getIdPaiement() {
        return idPaiement;
    }

    public void setIdPaiement(Integer idPaiement) {
        this.idPaiement = idPaiement;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getAnneeScolaire() {
        return anneeScolaire;
    }

    public void setAnneeScolaire(String anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }

    public String getSept() {
        return sept;
    }

    public void setSept(String sept) {
        this.sept = sept;
    }

    public String getOct() {
        return oct;
    }

    public void setOct(String oct) {
        this.oct = oct;
    }

    public String getNov() {
        return nov;
    }

    public void setNov(String nov) {
        this.nov = nov;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public String getJanv() {
        return janv;
    }

    public void setJanv(String janv) {
        this.janv = janv;
    }

    public String getFevr() {
        return fevr;
    }

    public void setFevr(String fevr) {
        this.fevr = fevr;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public String getAvr() {
        return avr;
    }

    public void setAvr(String avr) {
        this.avr = avr;
    }

    public String getMai() {
        return mai;
    }

    public void setMai(String mai) {
        this.mai = mai;
    }

    public String getJuin() {
        return juin;
    }

    public void setJuin(String juin) {
        this.juin = juin;
    }

    public String getJuil() {
        return juil;
    }

    public void setJuil(String juil) {
        this.juil = juil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaiement != null ? idPaiement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paiements)) {
            return false;
        }
        Paiements other = (Paiements) object;
        if ((this.idPaiement == null && other.idPaiement != null) || (this.idPaiement != null && !this.idPaiement.equals(other.idPaiement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.Paiements[ idPaiement=" + idPaiement + " ]";
    }
    
}
