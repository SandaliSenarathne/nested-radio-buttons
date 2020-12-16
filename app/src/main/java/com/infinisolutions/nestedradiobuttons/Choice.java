package com.infinisolutions.nestedradiobuttons;

public class Choice {

    private int questionId, choiceId;
    private String choiceText, choiceImageURL;
    private boolean correctness;

    public Choice(int questionId, int choiceId, String choiceText, String choiceImageURL, boolean correctness){
        this.questionId = questionId;
        this.choiceId = choiceId;
        this.choiceText = choiceText;
        this.choiceImageURL = choiceImageURL;
        this.correctness = correctness;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(int choiceId) {
        this.choiceId = choiceId;
    }

    public String getChoiceText() {
        return choiceText;
    }

    public void setChoiceText(String choiceText) {
        this.choiceText = choiceText;
    }

    public String getChoiceImageURL() {
        return choiceImageURL;
    }

    public void setChoiceImageURL(String choiceImageURL) {
        this.choiceImageURL = choiceImageURL;
    }

    public boolean isCorrectness() {
        return correctness;
    }

    public void setCorrectness(boolean correctness) {
        this.correctness = correctness;
    }
}
