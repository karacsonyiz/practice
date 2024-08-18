package server.Entity;

import jakarta.persistence.Entity;

@Entity
public class Survey {

    private long id;
    private String question;
    private String answer;

    public Survey(long id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public Survey() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
