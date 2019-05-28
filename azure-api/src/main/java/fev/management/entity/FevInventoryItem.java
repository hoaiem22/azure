/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fev.management.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "fev_inventory_item", catalog = "fptueventclub", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FevInventoryItem.findAll", query = "SELECT f FROM FevInventoryItem f")
    , @NamedQuery(name = "FevInventoryItem.findById", query = "SELECT f FROM FevInventoryItem f WHERE f.id = :id")
    , @NamedQuery(name = "FevInventoryItem.findByName", query = "SELECT f FROM FevInventoryItem f WHERE f.name = :name")
    , @NamedQuery(name = "FevInventoryItem.findByAddress", query = "SELECT f FROM FevInventoryItem f WHERE f.address = :address")
    , @NamedQuery(name = "FevInventoryItem.findByPrice", query = "SELECT f FROM FevInventoryItem f WHERE f.price = :price")
    , @NamedQuery(name = "FevInventoryItem.findByNote", query = "SELECT f FROM FevInventoryItem f WHERE f.note = :note")})
public class FevInventoryItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", length = 250)
    private String name;
    @Column(name = "address", length = 250)
    private String address;
    @Column(name = "price", length = 50)
    private String price;
    @Column(name = "note", length = 250)
    private String note;
    @JsonBackReference
    @OneToMany(mappedBy = "item")
    private Collection<FevInventory> fevInventoryCollection;

    public FevInventoryItem() {
    }

    public FevInventoryItem(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
        if (!(object instanceof FevInventoryItem)) {
            return false;
        }
        FevInventoryItem other = (FevInventoryItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fev.management.entity.FevInventoryItem[ id=" + id + " ]";
    }
    
}
