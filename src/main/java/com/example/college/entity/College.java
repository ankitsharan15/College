package com.example.college.entity;

import org.springframework.context.annotation.Lazy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by gaurav on 29/05/17.
 */

@Entity
@Table(name = "college")
public class College  implements Serializable {
    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "websiteurl")
    private String websiteurl;

    @Column(name = "description")
    private String description;

    @Column(name = "director")
    private String director;

    @Column(name = "affiliationcode")
    private String affiliationcode;

    public College() {
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", websiteurl='" + websiteurl + '\'' +
                ", description='" + description + '\'' +
                ", director='" + director + '\'' +
                ", affiliationcode='" + affiliationcode + '\'' +
                '}';
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setAffiliationcode(String affiliationcode) {
        this.affiliationcode = affiliationcode;
    }

    public String getDirector() {

        return director;
    }

    public String getAffiliationcode() {
        return affiliationcode;
    }

    public College(String name, String location, String websiteurl, String description, String director, String affiliationcode) {
        this.name = name;
        this.location = location;
        this.websiteurl = websiteurl;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getWebsiteurl() {
        return websiteurl;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setWebsiteurl(String websiteurl) {
        this.websiteurl = websiteurl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
