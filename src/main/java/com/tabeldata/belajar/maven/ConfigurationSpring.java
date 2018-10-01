/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.belajar.maven;

import com.tabeldata.belajar.maven.no.di.OtherBean;
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
        aBean.setId("qwerqwerewqrewqr");
        aBean.setNama("Dimas Maryanto");
        return aBean;
    }

    @Bean
    public DataBean withBeans2(OtherBean bean) {
        DataBean aBean = new DataBean();
        aBean.setId("bean asli");
        aBean.setNama("Dimas Maryanto");
        aBean.setBean(bean);
        return aBean;
    }

    @Bean
    public OtherBean otherBean() {
        OtherBean aBean = new OtherBean();
        aBean.setId("otherId");
        aBean.setNama("Muhamad yusuf");
        return aBean;
    }
}
