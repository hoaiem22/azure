package fev.management.model;
import fev.management.entity.FevMember;

import java.io.Serializable;
import java.util.Date;

public class FevMemberView extends FevMember implements Serializable{
    private Integer id;
    private String fullname;
    private String studentID;
    private Date birthdate;
    private String sex;
    private String address;
    private String phone;
    private Integer point;
    private String note;
    private String position;
    private String status;

    public FevMemberView() {
    }

    public FevMemberView(Integer id, String fullname, String studentID, Date birthdate, String sex, String address, String phone, Integer point, String note, String position, String status) {
        this.id = id;
        this.fullname = fullname;
        this.studentID = studentID;
        this.birthdate = birthdate;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
        this.point = point;
        this.note = note;
        this.position = position;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
