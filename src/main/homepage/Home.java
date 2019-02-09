package main.homepage;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "home", eager = true)
public class Home {
    public Home() {

        System.out.println("Home started!");
    }

    public String getMessage() {

        return "Hasan Home";
    }
}
