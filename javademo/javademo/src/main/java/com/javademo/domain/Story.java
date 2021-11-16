package com.javademo.domain;

import javax.persistence.*;
import java.util.Date;
// POJO
@Entity
public class Story {

    @GeneratedValue
    @Id
    private Long id;
    private String title;
    private String content;
    private Date posted;
    @ManyToOne
    private Blogger blogger;

    private Story() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPosted() {
        return posted;
    }

    public void setPosted(Date posted) {
        this.posted = posted;
    }

    public Blogger getBlogger() {
        return blogger;
    }

    public void setBlogger(Blogger author) {
        this.blogger = author;
    }

    @Override
    public String toString() {
        return "Story [title=" + title + "]";
    }
}