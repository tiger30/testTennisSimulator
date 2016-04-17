package robustech.icestone.demosimtennis.models;

import java.util.HashMap;
import java.util.List;

/**
 * Created by IceStone on 4/17/2016.
 */
public class Player {
    private String name;
    private HashMap<TennisGame, List<GameSet>> mapGameScore;

    public Player(String name, HashMap<TennisGame, List<GameSet>> mapGameScore) {
        this.name = name;
        this.mapGameScore = mapGameScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<TennisGame, List<GameSet>> getMapGameScore() {
        return mapGameScore;
    }

    public void setMapGameScore(HashMap<TennisGame, List<GameSet>> mapGameScore) {
        this.mapGameScore = mapGameScore;
    }
}
