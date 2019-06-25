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

/**
 *
 * @author EmVH <hoaiem.heli22@gmail.com>
 */
@Entity
@Table(name = "fev_member_group", catalog = "fptueventclub", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FevMemberGroup.findAll", query = "SELECT f FROM FevMemberGroup f")
    , @NamedQuery(name = "FevMemberGroup.findById", query = "SELECT f FROM FevMemberGroup f WHERE f.id = :id")
    , @NamedQuery(name = "FevMemberGroup.findByGroup", query = "SELECT f FROM FevMemberGroup f WHERE f.group = :group")
    , @NamedQuery(name = "FevMemberGroup.findByNote", query = "SELECT f FROM FevMemberGroup f WHERE f.note = :note")})
public class FevMemberGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "group", nullable = false, length = 255)
    private String group;
    @Column(name = "note", length = 255)
    private String note;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group1")
    private Collection<FevVoteCandidate> fevVoteCandidateCollection;

    public FevMemberGroup() {
    }

    public FevMemberGroup(Integer id) {
        this.id = id;
    }

    public FevMemberGroup(Integer id, String group) {
        this.id = id;
        this.group = group;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @XmlTransient
    public Collection<FevVoteCandidate> getFevVoteCandidateCollection() {
        return fevVoteCandidateCollection;
    }

    public void setFevVoteCandidateCollection(Collection<FevVoteCandidate> fevVoteCandidateCollection) {
        this.fevVoteCandidateCollection = fevVoteCandidateCollection;
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
        if (!(object instanceof FevMemberGroup)) {
            return false;
        }
        FevMemberGroup other = (FevMemberGroup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fev.management.entity.FevMemberGroup[ id=" + id + " ]";
    }
    
}
