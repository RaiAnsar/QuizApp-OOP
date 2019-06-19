package RaiAnsar.QuizApp;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.*;

public class ReadJson {
 private String questions[] = new String[10];
 private String answers[][] = new String[10][4];
 private String correctAnswer[] = new String[10];
 private String category[] = new String[10];
 private String difficulty[] = new String[10];

    public ReadJson() {
        this.questions = questions;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        this.category = category;
        this.difficulty = difficulty;
    }

    public void run() {
        Gson gson = new Gson();

        try {

            System.out.println("Reading JSON from a file");
            System.out.println("----------------------------");

            BufferedReader file = new BufferedReader(new FileReader("C:\\AllProjects\\Quizzat\\new.json"));
            Results results  =new  Results();

            Root resultObj = gson.fromJson(file, Root.class);

            if (resultObj !=null){
                int qNumber=0;
                for(Results x : resultObj.getResults()){

                    category[qNumber] = x.getCategory(); difficulty[qNumber] = x.getDifficulty();
                    questions[qNumber] = x.getQuestion(); correctAnswer[qNumber] = x. getCorrectAnswer();
                    answers[qNumber][0]= x.getCorrectAnswer();
                    for(int i = 1; i<=3; i++){
                        answers[qNumber][i] = x.getIncorrectAnswers().get(i-1);
                    }
                    qNumber++;
                }
                System.out.println(category[1]);
                System.out.println(difficulty[1]);
                System.out.println(answers[1][1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getQuestions(int index) {
        return questions[index];
    }

    public String[] getAnswers(int index) {
        String localString[] = new String[4];
        for (int i = 0; i <4 ; i++) {
            localString[i] = answers[index][i];
        }
        Collections.shuffle(Arrays.asList(localString));
        return localString;
    }

    public String getCorrectAnswer(int index) {
        return correctAnswer[index];
    }

    public String getCategory(int index) {
        return category[index];
    }

    public String getDifficulty(int index) {
        return difficulty[index];
    }
}
