package com.wywowo.databasetest.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Hpju on 2017/9/13
 */
@Entity
public class Help {
    @Id
    private Long id;
    @Property(nameInDb = "HELPNAME")
    private String username;
    @Property(nameInDb = "HELPONCE")
    private String nickname;
    public String getNickname() {
        return this.nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 1992418585)
    public Help(Long id, String username, String nickname) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
    }
    @Generated(hash = 1599309290)
    public Help() {
    }

}
