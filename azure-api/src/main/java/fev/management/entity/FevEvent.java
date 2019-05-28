/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fev.management.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "fev_event", catalog = "fptueventclub", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FevEvent.findAll", query = "SELECT f FROM FevEvent f")
    , @NamedQuery(name = "FevEvent.findById", query = "SELECT f FROM FevEvent f WHERE f.id = :id")
    , @NamedQuery(name = "FevEvent.findByName", query = "SELECT f FROM FevEvent f WHERE f.name = :name")
    , @NamedQuery(name = "FevEvent.findByStart", query = "SELECT f FROM FevEvent f WHERE f.start = :start")
    , @NamedQuery(name = "FevEvent.findByEnd", query = "SELECT f FROM FevEvent f WHERE f.end = :end")
    , @NamedQuery(name = "FevEvent.findByTime", query = "SELECT f FROM FevEvent f WHERE f.time = :time")
    , @NamedQuery(name = "FevEvent.findByPlace", query = "SELECT f FROM FevEvent f WHERE f.place = :place")
    , @NamedQuery(name = "FevEvent.findByNote", query = "SELECT f FROM FevEvent f WHERE f.note = :note")})
public class FevEvent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "start")
    @Temporal(TemporalType.DATE)
    private Date start;
    @Column(name = "end")
    @Temporal(TemporalType.DATE)
    private Date end;
    @Column(name = "time")
    @Temporal(TemporalType.DATE)
    private Date time;
    @Column(name = "place", length = 250)
    private String place;
    @Column(name = "note", length = 255)
    private String note;
    @JsonBackReference
    @OneToMany(mappedBy = "event")
    private Collection<FevEventMember> fevEventMemberCollection;
    @JsonBackReference
    @OneToMany(mappedBy = "event")
    private Collection<FevTransaction> fevTransactionCollection;
    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "event")
    private Collection<FevEventAlbum> fevEventAlbumCollection;
    @JsonBackReference
    @JoinColumn(name = "leader", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private FevMember leader;

    public FevEvent() {
    }

    public FevEvent(Integer id) {
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

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @XmlTransient
    public Collection<FevEventMember> getFevEventMemberCollection() {
        return fevEventMemberCollection;
    }

    public void setFevEventMemberCollection(Collection<FevEventMember> fevEventMemberCollection) {
        this.fevEventMemberCollection = fevEventMemberCollection;
    }

    @XmlTransient
    public Collection<FevTransaction> getFevTransactionCollection() {
        return fevTransactionCollection;
    }

    public void setFevTransactionCollection(Collection<FevTransaction> fevTransactionCollection) {
        this.fevTransactionCollection = fevTransactionCollection;
    }

    @XmlTransient
    public Collection<FevEventAlbum> getFevEventAlbumCollection() {
        return fevEventAlbumCollection;
    }

    public void setFevEventAlbumCollection(Collection<FevEventAlbum> fevEventAlbumCollection) {
        this.fevEventAlbumCollection = fevEventAlbumCollection;
    }

    public FevMember getLeader() {
        return leader;
    }

    public void setLeader(FevMember leader) {
        this.leader = leader;
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
        if (!(object instanceof FevEvent)) {
            return false;
        }
        FevEvent other = (FevEvent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fev.management.entity.FevEvent[ id=" + id + " ]";
    }
    
}
