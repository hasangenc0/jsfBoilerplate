package main.homepage;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "home", eager = true)
public class Home {
    String title, content;

    public Home() {

        this.title = "Hasan Genc Website";
        this.content = "Welcome to my site";
    }

    public String getContent() {

        return this.content;
    }

    public String getTitle() {

        return this.title;
    }
}
