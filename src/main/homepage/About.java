package main.homepage;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "about", eager = true)
public class About {
    private String name, title;

    public About() {
        this.name = "Hasan";
        this.title = "About Page";
    }

    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return this.title;
    }

}
