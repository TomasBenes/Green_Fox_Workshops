package com.company;

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public void posting () {
        System.out.println(this.title);
        System.out.println("Author: " + this.authorName);
        System.out.println("Posted: " + this.publicationDate);
        System.out.println("   - " + this.text);
    }
}
