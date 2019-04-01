package com.myapp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "login", eager = true)
@SessionScoped
public class Login {
    // form event
    public String action = "register";
    public String event = "";
    public String username = "";
    public String password = "";
    public String error = "";

    // mock user data
    private String _username = "hasan";
    private String _password = "genc";

    public Login() {
    }

    public String action () {
        return this.action;
    }

    public String getEvent () {
        return this.event;
    }

    public String getError () {
        return this.error;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setAction (String action) {
        this.action = action;
    }

    public void setEvent (String event) {
        this.event = event;
    }

    public void setError (String error) {
        this.error = error;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void signIn() {
        if (username.equals(_username) && password.equals(_password)) {
            setError(null);
        } else {
            setError("Wrong username or password.");
        }
    }

    public void signUp() {
        setError(null);
    }

    public void eventHandler(ActionEvent e) {
        System.out.println(this.event);
        // navigate proper event
        if (this.event.equals("signIn")) {
            signIn();
        } else if (this.event.equals("signUp")) {
            signUp();
        }
    }

}
