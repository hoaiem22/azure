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
@Table(name = "fev_transaction", catalog = "fptueventclub", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FevTransaction.findAll", query = "SELECT f FROM FevTransaction f")
    , @NamedQuery(name = "FevTransaction.findById", query = "SELECT f FROM FevTransaction f WHERE f.id = :id")
    , @NamedQuery(name = "FevTransaction.findByContent", query = "SELECT f FROM FevTransaction f WHERE f.content = :content")
    , @NamedQuery(name = "FevTransaction.findByMoney", query = "SELECT f FROM FevTransaction f WHERE f.money = :money")
    , @NamedQuery(name = "FevTransaction.findByNote", query = "SELECT f FROM FevTransaction f WHERE f.note = :note")})
public class FevTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "content", length = 50)
    private String content;
    @Column(name = "money")
    private Integer money;
    @Column(name = "note", length = 50)
    private String note;
    @JsonBackReference
    @JoinColumn(name = "event", referencedColumnName = "id")
    @ManyToOne
    private FevEvent event;
    @JsonBackReference
    @JoinColumn(name = "burden", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private FevMember burden;
    @JsonBackReference
    @JoinColumn(name = "type", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private FevTransactionType type;

    public FevTransaction() {
    }

    public FevTransaction(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public FevEvent getEvent() {
        return event;
    }

    public void setEvent(FevEvent event) {
        this.event = event;
    }

    public FevMember getBurden() {
        return burden;
    }

    public void setBurden(FevMember burden) {
        this.burden = burden;
    }

    public FevTransactionType getType() {
        return type;
    }

    public void setType(FevTransactionType type) {
        this.type = type;
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
        if (!(object instanceof FevTransaction)) {
            return false;
        }
        FevTransaction other = (FevTransaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fev.management.entity.FevTransaction[ id=" + id + " ]";
    }
    
}
