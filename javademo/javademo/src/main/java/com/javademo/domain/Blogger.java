package com.javademo.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Blogger {
    // (strategy...
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private int age;
    @OneToMany(mappedBy = "blogger")
    private List<Story> strories;

    private Blogger() {

    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public List<Story> getStrories() {

        return strories;
    }

    public void setStrories(List<Story> strories) {

        this.strories = strories;
    }
}
