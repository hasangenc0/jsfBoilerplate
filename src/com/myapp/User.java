package com.myapp;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "user", eager = true)
public class User {
    private String first, last;

    public User() {
        this.first = "Hasan";
        this.last = "Genc";
    }
}
