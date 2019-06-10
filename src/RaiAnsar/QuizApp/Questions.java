package RaiAnsar.QuizApp;

public class Questions {
    private String question;
    private String ans1, ans2, ans3, ans4;

    public Questions() {
        this.question = "In \"Need for Speed: Porsche Unleashed\", the player can only drive cars manufactured by Porsche.";
        this.ans1 = "Yes";
        this.ans2 = "Yes, of course";
        this.ans3 = "Yes but in dark Gray";
        this.ans4 = "Yes, Love it";
    }
    public Questions(String question, String ans1, String ans2, String ans3, String ans4) {
        this.question = question;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }
}
