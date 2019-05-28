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
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "fev_event_album", catalog = "fptueventclub", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FevEventAlbum.findAll", query = "SELECT f FROM FevEventAlbum f")
    , @NamedQuery(name = "FevEventAlbum.findById", query = "SELECT f FROM FevEventAlbum f WHERE f.id = :id")
    , @NamedQuery(name = "FevEventAlbum.findByImg", query = "SELECT f FROM FevEventAlbum f WHERE f.img = :img")})
public class FevEventAlbum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "img", length = 250)
    private String img;
    @JsonBackReference
    @JoinColumn(name = "event", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private FevEvent event;

    public FevEventAlbum() {
    }

    public FevEventAlbum(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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
        if (!(object instanceof FevEventAlbum)) {
            return false;
        }
        FevEventAlbum other = (FevEventAlbum) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fev.management.entity.FevEventAlbum[ id=" + id + " ]";
    }
    
}
