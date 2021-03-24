package com.codecool.chessopen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ChessResults {

    public List<String> getCompetitorsNamesFromFile(String fileName){
        Map<String, Integer> mapForList = new HashMap<>();

        List<String> mostPoints = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            mostPoints = setOrder(mostPoints);
        } catch (IOException e) {
            System.out.printf("File not found!");
        }
        return mostPoints;
    }

    public List<String> setOrder(List<String> list) {
        List<String> namesWithTotalPoints = new ArrayList<>();
        Map<String, Integer> mapForList = new HashMap<>();
        return Collections.emptyList();
    }

}
