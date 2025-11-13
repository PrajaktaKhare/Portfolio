package com.prajakta.Portfolio.Model;

public class Project {

    private String name;
    private String description;
    private String image; // Make sure this exists
    private String[] tags; // Make sure this exists
    private String link;

    // Constructor including image and tags
    public Project(String name, String description, String image, String[] tags, String link) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.tags = tags;
        this.link = link;
    }

    // Another constructor if image or link optional
    public Project(String name, String description, String[] tags) {
        this.name = name;
        this.description = description;
        this.tags = tags;
    }

    // Getters for Thymeleaf
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getImage() { return image; }
    public String[] getTags() { return tags; }
    public String getLink() { return link; }
}