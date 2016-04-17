package robustech.icestone.demosimtennis.models;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IceStone on 4/17/2016.
 */
public class Player {

    public static final List<String> pointsDescription = Arrays.asList("love", "fifteen", "thirty", "forty");

    String name;
    private int score;


    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void winBall() {
        this.score = this.score + 1;
    }


    public String getScoreDescription(){
        return pointsDescription.get(score);
    }

}