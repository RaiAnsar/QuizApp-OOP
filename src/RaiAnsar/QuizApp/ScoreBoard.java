package RaiAnsar.QuizApp;

public class ScoreBoard {
    private double score;
    private int correctCount = 0;
    private int incorrectCount = 0;

    public ScoreBoard() {
        score = 0;
        this.correctCount = 0;
        this.incorrectCount = 0;
    }

    public ScoreBoard(double score, int correctCount, int incorrectCount) {
        this.score = score;
        this.correctCount = correctCount;
        this.incorrectCount = incorrectCount;
    }

    public double getScore() {
        return score;
    }

    public int getCorrectCount() {
        return correctCount;
    }

    public int getIncorrectCount() {
        return incorrectCount;
    }

    public void scores(Boolean bool){
       this.score = 0;
        if (bool){
            this.correctCount +=1;
            this.score += 10;
        } else {
            this.incorrectCount +=1;
            this.score -= 1;
        }
    }
}


