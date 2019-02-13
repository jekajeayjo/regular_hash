/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author User
 */
public class Intersection {

    private static final String BEGIN = "НачПериода";
    private static final String END = "КонПериода";
    ArrayList<String> periodList;
int countPeriod=0;

    public String findAll(String input) {
        periodList = new ArrayList<>();
        if (input == "") {
            return "Входных периодов нет";
        }
     
        for (String list : input.split(",")) {
            periodList.add(list);
         
        }
        
        String checkInfinity = checkInfinity(periodList);
        String checkIntersection = checkIntersection(periodList);
        if (checkInfinity != null) {
   
            return checkInfinity;
        } else {
            return checkIntersection;
        }

    }

    private String checkIntersection(List<String> periodList) {
        List<String> intersection = new ArrayList<>();

        int isOpened = 0;
        int isIntersetion = 0;
        for (String period : periodList) {
            
            if (period.contains(BEGIN)) {
               
                if (isOpened > 0) {
                    intersection.add(period);
                    isIntersetion++; countPeriod++;
                }
                isOpened++;
                
            } else if (period.contains(END)) {
                if (isIntersetion > 0) {
                    intersection.add(period);
                    isIntersetion--;
                }
                isOpened--;
            }

        }
        if (intersection.isEmpty()) {

            return  "Нет пересечения, количество периодов:"+countPeriod;
        } else {
            String result = String.join(", ", intersection);
            return "Есть пересечения: " + result;
        }
    }

    private String checkInfinity(List<String> periodList) {
        long beginCount = 0;
        long endCount = 0;
        String isInfinity = null;
        int BeginEnd=0;
        //HashMap<Boolean,Long>groupedBeginEndMap=new HashMap<>();
        for (String list : periodList) {
            if (list.contains(BEGIN)) {
                int found=0;
                String foundNum=list.substring(10);
                for (String number :periodList)
                {
                if (number.contains(END)&&number.contains(foundNum))
                    BeginEnd++;
                }
                
                beginCount++;
            } else if (list.contains(END)) {
                endCount++;
            }
            // System.out.println(beginCount+"-"+endCount);
        }
        //System.out.println(BeginEnd+"BeginEnd");
        if (beginCount > endCount) {
            isInfinity = "+бесконечность";
        } else if (beginCount < endCount) {
            isInfinity = "-бесконечность";
        }
        else if (BeginEnd==0) {
            isInfinity = "- +бесконечность";
        }
        else if (BeginEnd<beginCount&&BeginEnd<endCount&&BeginEnd==endCount)
               isInfinity = "- + бесконечность";
        return isInfinity;
    }
}
