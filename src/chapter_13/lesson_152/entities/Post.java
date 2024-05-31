package chapter_13.lesson_152.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();


    //***********************************************************************************************
    // CONSTRUCTORS
    //***********************************************************************************************

    public Post() {
    }

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    //***********************************************************************************************
    // GETTERS AND SETTERS
    //***********************************************************************************************

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
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
        return comments;
    }


    //***********************************************************************************************
    // EQUALS AND TO STRING
    //***********************************************************************************************

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.title).append("\n")
                .append(this.likes).append(" Likes - ").append(dateTimeFormatter.format(this.moment)).append("\n")
                .append(this.content).append("\n")
                .append("Comments: ").append("\n");
        for (Comment c: comments) {
            stringBuilder.append(c.getText()).append("\n");
        }

        return stringBuilder.toString();
    }


    //***********************************************************************************************
    // METHODS
    //***********************************************************************************************

    public void addComment(Comment comment){
        this.comments.add(comment);
    }

    public void removeComment(Comment comment){
        this.comments.remove(comment);
    }


}
