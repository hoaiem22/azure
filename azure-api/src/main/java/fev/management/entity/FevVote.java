/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fev.management.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EmVH <hoaiem.heli22@gmail.com>
 */
@Entity
@Table(name = "fev_vote", catalog = "fptueventclub", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FevVote.findAll", query = "SELECT f FROM FevVote f")
    , @NamedQuery(name = "FevVote.findById", query = "SELECT f FROM FevVote f WHERE f.id = :id")
    , @NamedQuery(name = "FevVote.findByNote", query = "SELECT f FROM FevVote f WHERE f.note = :note")})
public class FevVote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "note", length = 250)
    private String note;
    @JsonBackReference
    @JoinColumn(name = "candidate", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private FevMember candidate;
    @JsonBackReference
    @JoinColumn(name = "key", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private FevVoteKey key;

    public FevVote() {
    }

    public FevVote(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public FevMember getCandidate() {
        return candidate;
    }

    public void setCandidate(FevMember candidate) {
        this.candidate = candidate;
    }

    public FevVoteKey getKey() {
        return key;
    }

    public void setKey(FevVoteKey key) {
        this.key = key;
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
        if (!(object instanceof FevVote)) {
            return false;
        }
        FevVote other = (FevVote) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fev.management.entity.FevVote[ id=" + id + " ]";
    }
    
}
