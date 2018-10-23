package com.codeclan.files_lab.FilesLabHomework.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.soap.Name;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userName")
    private String userName;

    @JsonIgnore
    @OneToMany(mappedBy = "userName")
    private String UserNames;

    public String getUserNames() {
        return UserNames;
    }

    public void setUserNames(String userNames) {
        UserNames = userNames;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }




}
