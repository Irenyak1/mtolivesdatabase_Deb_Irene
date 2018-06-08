package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //This tells Hibernate to make a table out of this class
public class Member {

    @Id
    @GeneratedValue
    @Column (name="id")
    private Long id;
    @Column (name="name")
    private String name;
    @Column (name="gender")
    private String gender;
    @Column (name="dateofbirth")
    private String dateofbirth;
    @Column (name="maritalstatus")
    private String maritalstatus;
    @Column (name="churchfamily")
    private String churchfamily;
    @Column (name="fellowshipgroup")
    private String fellowshipgroup;
    @Column (name="highestlevelofeducation")
    private String highestlevelofeducation;
    @Column (name="profession")
    private String profession;
    @Column (name="occupation")
    private String occupation;
    @Column (name="placeofwork")
    private String placeofwork;
    @Column (name="placeofresidence")
    private String placeofresidence;
    @Column (name="phonecontact")
    private String phonecontact;
    @Column (name="emailaddress")
    private String emailaddress;
    @Column (name="dateofbaptism")
    private String dateofbaptism;
    @Column (name="placeofbaptism")
    private String placeofbaptism;
    @Column (name="nameofpastorwhobaptised")
    private String nameofpastorwhobaptised;
    @Column (name="formerreligion")
    private String formerreligion;
    @Column (name="image_url")
    private String image_url;

    public Member (){ super();}

    public Member( String name, String gender, String dateofbirth, String maritalstatus, String churchfamily, String fellowshipgroup, String highestlevelofeducation, String profession, String occupation, String placeofwork, String placeofresidence, String phonecontact, String emailaddress, String dateofbaptism, String placeofbaptism, String nameofpastorwhobaptised, String formerreligion, String image_url) {
        super();
        this.name = name;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
        this.maritalstatus = maritalstatus;
        this.churchfamily = churchfamily;
        this.fellowshipgroup = fellowshipgroup;
        this.highestlevelofeducation = highestlevelofeducation;
        this.profession = profession;
        this.occupation = occupation;
        this.placeofwork = placeofwork;
        this.placeofresidence = placeofresidence;
        this.phonecontact = phonecontact;
        this.emailaddress = emailaddress;
        this.dateofbaptism = dateofbaptism;
        this.placeofbaptism = placeofbaptism;
        this.nameofpastorwhobaptised = nameofpastorwhobaptised;
        this.formerreligion = formerreligion;
        this.image_url = image_url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getChurchfamily() {
        return churchfamily;
    }

    public void setChurchfamily(String churchfamily) {
        this.churchfamily = churchfamily;
    }

    public String getFellowshipgroup() {
        return fellowshipgroup;
    }

    public void setFellowshipgroup(String fellowshipgroup) {
        this.fellowshipgroup = fellowshipgroup;
    }

    public String getHighestlevelofeducation() {
        return highestlevelofeducation;
    }

    public void setHighestlevelofeducation(String highestlevelofeducation) {
        this.highestlevelofeducation = highestlevelofeducation;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPlaceofwork() {
        return placeofwork;
    }

    public void setPlaceofwork(String placeofwork) {
        this.placeofwork = placeofwork;
    }

    public String getPlaceofresidence() {
        return placeofresidence;
    }

    public void setPlaceofresidence(String placeofresidence) {
        this.placeofresidence = placeofresidence;
    }

    public String getPhonecontact() {
        return phonecontact;
    }

    public void setPhonecontact(String phonecontact) {
        this.phonecontact = phonecontact;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getDateofbaptism() {
        return dateofbaptism;
    }

    public void setDateofbaptism(String dateofbaptism) {
        this.dateofbaptism = dateofbaptism;
    }

    public String getPlaceofbaptism() {
        return placeofbaptism;
    }

    public void setPlaceofbaptism(String placeofbaptism) {
        this.placeofbaptism = placeofbaptism;
    }

    public String getNameofpastorwhobaptised() {
        return nameofpastorwhobaptised;
    }

    public void setNameofpastorwhobaptised(String nameofpastorwhobaptised) {
        this.nameofpastorwhobaptised = nameofpastorwhobaptised;
    }

    public String getFormerreligion() {
        return formerreligion;
    }

    public void setFormerreligion(String formerreligion) {
        this.formerreligion = formerreligion;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
