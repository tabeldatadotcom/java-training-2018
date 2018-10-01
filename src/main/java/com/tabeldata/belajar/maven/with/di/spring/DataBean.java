/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.belajar.maven.with.di.spring;

import com.tabeldata.belajar.maven.no.di.OtherBean;
import org.springframework.stereotype.Component;

/**
 *
 * @author dimasm93
 */
public class DataBean {

    public DataBean() {
    }

    public DataBean(OtherBean bean) {
        this.bean = bean;
    }
    
    
    
    private String id;
    private String nama;
    private OtherBean bean;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public OtherBean getBean() {
        return bean;
    }

    public void setBean(OtherBean bean) {
        this.bean = bean;
    }
    
    

    @Override
    public String toString() {
        return String.format("{%s, %s, otherBean: { %s, %s }}", 
                this.id, 
                this.nama, 
                this.bean.getId(), 
                this.bean.getNama()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
