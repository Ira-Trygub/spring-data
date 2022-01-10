package com.haw.se1lab;

import java.net.URI;

public class Video {
    private final String name;
    private final URI filmLink;
    private final String description;

    public Video(String name, URI filmLink, String description) {
        this.name = name;
        this.filmLink = filmLink;
        this.description = description;
    }
}


