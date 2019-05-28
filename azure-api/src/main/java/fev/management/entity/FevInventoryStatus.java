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
@Table(name = "fev_inventory_status", catalog = "fptueventclub", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FevInventoryStatus.findAll", query = "SELECT f FROM FevInventoryStatus f")
    , @NamedQuery(name = "FevInventoryStatus.findById", query = "SELECT f FROM FevInventoryStatus f WHERE f.id = :id")
    , @NamedQuery(name = "FevInventoryStatus.findByStatus", query = "SELECT f FROM FevInventoryStatus f WHERE f.status = :status")
    , @NamedQuery(name = "FevInventoryStatus.findByNote", query = "SELECT f FROM FevInventoryStatus f WHERE f.note = :note")})
public class FevInventoryStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "status", length = 250)
    private String status;
    @Column(name = "note", length = 250)
    private String note;
    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "status")
    private Collection<FevInventory> fevInventoryCollection;

    public FevInventoryStatus() {
    }

    public FevInventoryStatus(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @XmlTransient
    public Collection<FevInventory> getFevInventoryCollection() {
        return fevInventoryCollection;
    }

    public void setFevInventoryCollection(Collection<FevInventory> fevInventoryCollection) {
        this.fevInventoryCollection = fevInventoryCollection;
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
        if (!(object instanceof FevInventoryStatus)) {
            return false;
        }
        FevInventoryStatus other = (FevInventoryStatus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fev.management.entity.FevInventoryStatus[ id=" + id + " ]";
    }
    
}
