/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.belajar.maven.with.di.spring;

import org.springframework.stereotype.Component;

/**
 *
 * @author dimasm93
 */
public class DataBean {
    
    private String id;
    private String nama;

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

    @Override
    public String toString() {
        return String.format("{%s, %s}", this.id, this.nama); //To change body of generated methods, choose Tools | Templates.
    }
    
}
