package com.codecool.chessopen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ChessResults {

    public List<String> getCompetitorsNamesFromFile(String fileName){
        Map<String, Integer> mapForList = new HashMap<>();

        List<String> mostPoints = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                mapForList.put()
            }
            mostPoints = setOrder(mostPoints);
        } catch (IOException e) {
            System.out.printf("File not found!");
        }
        return mostPoints;

//        List<String> mostPoints = new ArrayList<>();
//        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                mostPoints.add(line);
//            }
//            mostPoints = setOrder(mostPoints);
//        } catch (IOException e) {
//            System.out.printf("File not found!");
//        }
//        return mostPoints;
    }

    public List<String> setOrder(List<String> list) {
        List<String> namesWithTotalPoints = new ArrayList<>();
        Map<String, Integer> mapForList = new HashMap<>();


//        for (int i = 0; i < list.size(); i++) {
//            int totalPoints = 0;
//            for (int j = 0; j < list.get(i).length() ; j++) {//összeadja a pontokat
//                char temp = list.get(i).charAt(j);
//                if (Character.isDigit(temp)) {
//                    totalPoints += temp;
//                }
//            }
//        }



        return Collections.emptyList();
    }

}
