/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fev.management.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "fev_transaction_type", catalog = "fptueventclub", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FevTransactionType.findAll", query = "SELECT f FROM FevTransactionType f")
    , @NamedQuery(name = "FevTransactionType.findById", query = "SELECT f FROM FevTransactionType f WHERE f.id = :id")
    , @NamedQuery(name = "FevTransactionType.findByType", query = "SELECT f FROM FevTransactionType f WHERE f.type = :type")
    , @NamedQuery(name = "FevTransactionType.findByNote", query = "SELECT f FROM FevTransactionType f WHERE f.note = :note")})
public class FevTransactionType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "type", length = 50)
    private String type;
    @Column(name = "note", length = 50)
    private String note;
    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "type")
    private Collection<FevTransaction> fevTransactionCollection;

    public FevTransactionType() {
    }

    public FevTransactionType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @XmlTransient
    public Collection<FevTransaction> getFevTransactionCollection() {
        return fevTransactionCollection;
    }

    public void setFevTransactionCollection(Collection<FevTransaction> fevTransactionCollection) {
        this.fevTransactionCollection = fevTransactionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FevTransactionType)) {
            return false;
        }
        FevTransactionType other = (FevTransactionType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fev.management.entity.FevTransactionType[ id=" + id + " ]";
    }
    
}
