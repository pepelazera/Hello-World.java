package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
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

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments; // When is talking about a collection or list, I can't do the set method, only the get method.
    }

    public void addComment(Comment comment) {
        comments.add(comment); // Here, instead of use set method, I created an add constructor to add the variable "comment" of type "Comment" to the ArrayList
    }

    public void removeComment(Comment comment) {
        comments.remove(comment); // Here I did the same, but to remove a comment
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(title).append("\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append(content);
        sb.append("\n\nComments: \n");

        for (Comment c : comments) { // For each comment in the list comments...
            sb.append(c.getText()).append("\n"); // I add all of this comments in the sb StringBuilder
        } // the get text is used to get the String value of the variable comment

        return sb.toString(); // Here, I converted the StringBuilder for toString method
    }
}
