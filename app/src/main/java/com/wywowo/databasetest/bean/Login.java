package com.wywowo.databasetest.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Hpju on 2017/9/13
 */
@Entity
public class Login {
    @Id
    private Long id;
    @Property(nameInDb = "PASSWORD")
    private String password;
    @Property(nameInDb = "USERNAME")
    private String username;
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 1822789773)
    public Login(Long id, String password, String username) {
        this.id = id;
        this.password = password;
        this.username = username;
    }
    @Generated(hash = 1827378950)
    public Login() {
    }
}
