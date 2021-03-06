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
@Table(name = "fev_member_status", catalog = "fptueventclub", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FevMemberStatus.findAll", query = "SELECT f FROM FevMemberStatus f")
    , @NamedQuery(name = "FevMemberStatus.findById", query = "SELECT f FROM FevMemberStatus f WHERE f.id = :id")
    , @NamedQuery(name = "FevMemberStatus.findByStatus", query = "SELECT f FROM FevMemberStatus f WHERE f.status = :status")
    , @NamedQuery(name = "FevMemberStatus.findByNote", query = "SELECT f FROM FevMemberStatus f WHERE f.note = :note")})
public class FevMemberStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "status", nullable = false, length = 50)
    private String status;
    @Column(name = "note", length = 255)
    private String note;
    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "status")
    private Collection<FevMember> fevMemberCollection;

    public FevMemberStatus() {
    }

    public FevMemberStatus(Integer id) {
        this.id = id;
    }

    public FevMemberStatus(Integer id, String status) {
        this.id = id;
        this.status = status;
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
    public Collection<FevMember> getFevMemberCollection() {
        return fevMemberCollection;
    }

    public void setFevMemberCollection(Collection<FevMember> fevMemberCollection) {
        this.fevMemberCollection = fevMemberCollection;
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
        if (!(object instanceof FevMemberStatus)) {
            return false;
        }
        FevMemberStatus other = (FevMemberStatus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fev.management.entity.FevMemberStatus[ id=" + id + " ]";
    }
    
}
