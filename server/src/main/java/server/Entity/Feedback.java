package server.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Access(value= AccessType.FIELD)
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int ratingScore;
    private String ratingText;
    private LocalDateTime ratingDate;
    private User user;
    private boolean canEditOrDelete;

    public Feedback() {
    }

    public Feedback(long id, int ratingScore, String ratingText, LocalDateTime ratingDate, User user, boolean canEditOrDelete) {
        this.id = id;
        this.ratingScore = ratingScore;
        this.ratingText = ratingText;
        this.ratingDate = ratingDate;
        this.user = user;
        this.canEditOrDelete = canEditOrDelete;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRatingScore() {
        return ratingScore;
    }

    public void setRatingScore(int ratingScore) {
        this.ratingScore = ratingScore;
    }

    public String getRatingText() {
        return ratingText;
    }

    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    public LocalDateTime getRatingDate() {
        return ratingDate;
    }

    public void setRatingDate(LocalDateTime ratingDate) {
        this.ratingDate = ratingDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isCanEditOrDelete() {
        return canEditOrDelete;
    }

    public void setCanEditOrDelete(boolean canEditOrDelete) {
        this.canEditOrDelete = canEditOrDelete;
    }
}
