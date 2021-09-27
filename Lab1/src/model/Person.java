/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ankitjagtap
 */
public class Person {

//* Name
//* Geographic data (Country)
//* Date of birth
//* Telephone numbers
//* FAX number
//* Email addresses
//* Social Security number
//* Medical record number
//* Health plan beneficiary number
//* Bank account numbers
//* Certificate/license number
//* Vehicle identifiers and serial numbers including license plates
//* Device identifiers and serial numbers
//* LinkedIn
//* Internet protocol addresses
//* Biometric identifiers (i.e. retinal scan, fingerprints)(Photograph)
//* Full face photos and comparable images
//* Any unique identifying number, characteristic, or code
    private String name;
    private String country;
    private String Date;
    private String tel_num;
    private String fax_num;
    private String email;
    private String ssn;
    private String Med_rec_num;
    private String hel_ben_num;
    private String ban_acc_num;
    private String certificate_num;
    private String serial_num;
    private String vehicle_id;
    private String device_id;
    private String linkedin;
    private String ip_add;
    private String unique_id;
    private String filename;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTel_num() {
        return tel_num;
    }

    public void setTel_num(String tel_num) {
        this.tel_num = tel_num;
    }

    public String getFax_num() {
        return fax_num;
    }

    public void setFax_num(String fax_num) {
        this.fax_num = fax_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMed_rec_num() {
        return Med_rec_num;
    }

    public void setMed_rec_num(String Med_rec_num) {
        this.Med_rec_num = Med_rec_num;
    }

    public String getHel_ben_num() {
        return hel_ben_num;
    }

    public void setHel_ben_num(String hel_ben_num) {
        this.hel_ben_num = hel_ben_num;
    }

    public String getBan_acc_num() {
        return ban_acc_num;
    }

    public void setBan_acc_num(String ban_acc_num) {
        this.ban_acc_num = ban_acc_num;
    }

    public String getCertificate_num() {
        return certificate_num;
    }

    public void setCertificate_num(String certificate_num) {
        this.certificate_num = certificate_num;
    }

    public String getSerial_num() {
        return serial_num;
    }

    public void setSerial_num(String serial_num) {
        this.serial_num = serial_num;
    }

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getIp_add() {
        return ip_add;
    }

    public void setIp_add(String ip_add) {
        this.ip_add = ip_add;
    }

    public String getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(String unique_id) {
        this.unique_id = unique_id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

   
}
