package org.example.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OpenChat {
    public static String[] OpenChatSolution(String[] record) {
        Map<String, String> nameMap = new HashMap<>();
        Map<String, String> exitMap = new HashMap<>();
        exitMap.put("Enter", "들어왔습니다.");
        exitMap.put("Leave", "나갔습니다.");

        String[] nameList = new String[record.length];
        String[] exitList = new String[record.length];
        int index = 0;

        for (String str : record) {
            String[] obj = str.split(" ");
            if (!obj[0].equals("Leave")) {
                nameMap.put(obj[1], obj[2]);
            }
            if (!obj[0].equals("Change")) {
                nameList[index] = obj[1];
                exitList[index] = obj[0];
                index++;
            }
        }

        String[] answer = new String[index];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            sb.setLength(0); // StringBuilder 재사용
            sb.append(nameMap.get(nameList[i])).append("님이 ").append(exitMap.get(exitList[i]));
            answer[i] = sb.toString();
        }

        System.out.println(Arrays.toString(answer));

        return answer;

    }
}
