/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.belajar.maven;

import com.tabeldata.belajar.maven.with.di.spring.DataBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author dimasm93
 */
@Configuration
public class ConfigurationSpring {

    @Bean
    public DataBean withBeans() {
        DataBean aBean = new DataBean();
        aBean.setId("123423423");
        aBean.setNama("asldfjasdlkfj");
        return aBean;
    }
}
