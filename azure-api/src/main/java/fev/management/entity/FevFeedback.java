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
@Table(name = "fev_feedback", catalog = "fptueventclub", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FevFeedback.findAll", query = "SELECT f FROM FevFeedback f")
    , @NamedQuery(name = "FevFeedback.findById", query = "SELECT f FROM FevFeedback f WHERE f.id = :id")
    , @NamedQuery(name = "FevFeedback.findBySender", query = "SELECT f FROM FevFeedback f WHERE f.sender = :sender")
    , @NamedQuery(name = "FevFeedback.findByContent", query = "SELECT f FROM FevFeedback f WHERE f.content = :content")
    , @NamedQuery(name = "FevFeedback.findByNote", query = "SELECT f FROM FevFeedback f WHERE f.note = :note")})
public class FevFeedback implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "sender", length = 50)
    private String sender;
    @Column(name = "content", length = 5000)
    private String content;
    @Column(name = "note", length = 250)
    private String note;
    @JsonBackReference
    @JoinColumn(name = "status", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private FevFeedbackStatus status;

    public FevFeedback() {
    }

    public FevFeedback(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public FevFeedbackStatus getStatus() {
        return status;
    }

    public void setStatus(FevFeedbackStatus status) {
        this.status = status;
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
        if (!(object instanceof FevFeedback)) {
            return false;
        }
        FevFeedback other = (FevFeedback) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fev.management.entity.FevFeedback[ id=" + id + " ]";
    }
    
}
