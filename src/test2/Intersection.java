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

    public String findAll(String input) {
        periodList = new ArrayList<>();
        String checkInfinity = null;
        for (String list : input.split(",")) {
            periodList.add(list);
            // System.out.println(list);
        }
        String checkInfinity1 = checkInfinity(periodList);
        if (checkInfinity1 != null) {
            System.out.println(checkInfinity1);
            return checkInfinity1;
        }
        List<String> intesection = new ArrayList<>();
        int isOpened = 0;
        int isIntersetion = 0;
        for (String period : periodList) {
            if (period.contains(BEGIN)) {
                if (isOpened > 0) {
                    intesection.add(period);
                    isIntersetion++;
                }
                isOpened++;
            } else if (period.contains(END)) {
                if (isIntersetion > 0) {
                    intesection.add(END);
                    isIntersetion--;
                }
                isOpened--;
            }
            
        }
        if (intesection.isEmpty()) {

            return "Нет пересечения";
        } else {
String result=String.join(", ",intesection );
            return " есть пересечения: "+result;
        }
    }

    private String checkInfinity(List<String> periodList) {
        long beginCount = 0;
        long endCount = 0;
        String isInfinity = null;
        //HashMap<Boolean,Long>groupedBeginEndMap=new HashMap<>();
        for (String list : periodList) {
            if (list.contains(BEGIN)) {
                beginCount++;
            } else if (list.contains(END)) {
                endCount++;
            }
            // System.out.println(beginCount+"-"+endCount);
        }
        if (beginCount > endCount) {
            isInfinity = "+бесконечность";
        } else if (beginCount < endCount) {
            isInfinity = "-бесконечность";
        }
        return isInfinity;
    }
}
