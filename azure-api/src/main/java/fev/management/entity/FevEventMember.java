/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fev.management.entity;

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
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "fev_event_member", catalog = "fptueventclub", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"event", "member"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FevEventMember.findAll", query = "SELECT f FROM FevEventMember f")
    , @NamedQuery(name = "FevEventMember.findById", query = "SELECT f FROM FevEventMember f WHERE f.id = :id")
    , @NamedQuery(name = "FevEventMember.findByNote", query = "SELECT f FROM FevEventMember f WHERE f.note = :note")})
public class FevEventMember implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "note", length = 255)
    private String note;
    @JsonBackReference
    @JoinColumn(name = "member", referencedColumnName = "id")
    @ManyToOne
    private FevMember member1;
    @JsonBackReference
    @JoinColumn(name = "event", referencedColumnName = "id")
    @ManyToOne
    private FevEvent event;

    public FevEventMember() {
    }

    public FevEventMember(Integer id) {
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

    public FevMember getMember1() {
        return member1;
    }

    public void setMember1(FevMember member1) {
        this.member1 = member1;
    }

    public FevEvent getEvent() {
        return event;
    }

    public void setEvent(FevEvent event) {
        this.event = event;
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
        if (!(object instanceof FevEventMember)) {
            return false;
        }
        FevEventMember other = (FevEventMember) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fev.management.entity.FevEventMember[ id=" + id + " ]";
    }
    
}
