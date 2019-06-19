package RaiAnsar.QuizApp;

public class Questions {
    private String question;
    private String correctAns;
    private String ans1, ans2, ans3, ans4;

    ReadJson JSONData = new ReadJson();


    public Questions(int index) {
        JSONData.run();
        System.out.println(JSONData.getCategory(index));
        this.question = JSONData.getQuestions(index);
        this.correctAns = JSONData.getCorrectAnswer(index);
        String answers[] = JSONData.getAnswers(index);
        System.out.println(this.question);
        System.out.println(answers[1]);
        System.out.println(answers[2]);
        this.ans1 = answers[0];
        this.ans2 = answers[1];
        this.ans3 = answers[2];
        this.ans4 = answers[3];
    }
    public Questions(String question, String ans1, String ans2, String ans3, String ans4) {
        this.question = question;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
    }

    public void endQuiz(){

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
