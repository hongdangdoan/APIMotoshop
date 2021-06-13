/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.motorshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author hungh
 */
@Entity
public class Staff {
    
    @Id
    @Column(name = "staffId", nullable = false)
    private String id;  //editable false        
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "phone", nullable = false)
    private String phone;
    
    @Column(name = "password", nullable = false)
    private String passWord;
    
    @Column(name = "createdDate", nullable = false)
    private String createdDate;
    
    @Column(name = "departId", nullable = false)
    private String dpId;    //editable true

    public Staff() {}

    public Staff(String id, String dpId, String name, String phone, String createdDate) {
        this.id = id;
        this.dpId = dpId;
        this.name = name;
        this.phone = phone;        
        this.createdDate = createdDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }    

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }      
    
    public String getDpId() {
        return dpId;
    }

    public void setDpId(String dpId) {
        this.dpId = dpId;
    }
}
