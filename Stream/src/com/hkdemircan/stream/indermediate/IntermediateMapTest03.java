package com.hkdemircan.stream.indermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IntermediateMapTest03 {
    public static void main(String[] args) {
        List<Match> matchList = Arrays.asList(
                new Match("FootballMatch", 11),
                new Match("BasketballMatch", 7),
                new Match("Soccer", 7),
                new Match("Tennis", 2)
        );

        Optional<String> matchName = matchList.stream()
                .map(Match::getName)
                .filter(name -> name.endsWith("Match"))
                .sorted()
                .findFirst();
        System.out.println("Result: " + matchName.orElse("match no found"));
    }
}
class Match {

    private String name;
    private Integer playerCount;

    public Match(String name, Integer playerCount) {
        this.name = name;
        this.playerCount = playerCount;
    }

    public String getName() {
        return name;
    }

    public Integer getPlayerCount() {
        return playerCount;
    }
}