package com.myapp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "navigator", eager = true)
@SessionScoped
public class Navigator {

    public String about() {
        return "about";
    }

    public String login() {
        return "login";
    }
}
