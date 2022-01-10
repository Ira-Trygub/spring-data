package com.haw.se1lab;

import javax.persistence.Entity;
import java.net.URI;

public class GIFLabel {
    private final String name;
   // private final URI gifLink;
   private final String gifLink;

    public GIFLabel(String name, String gifLink) {
        this.name = name;
        this.gifLink = gifLink;
    }

}
