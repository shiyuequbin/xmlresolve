package com.springboot_xml.xml_pfa.domain;


import java.io.Serializable;

/**
 * @ProjectName: springboot
 * @Package: com.example.springboot.domain
 * @ClassName: User
 * @Description: java类作用描述
 * @Author: qubin
 * @CreateDate: 2019/5/19 22:20
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/5/19 22:20
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

public class User implements Serializable{
    private Integer id;
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
