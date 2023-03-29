package org.example.practice;

import java.util.HashMap;
import java.util.Map;

public class DiscountSale {
    public static int DiscountSaleSolution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();

        // map에 키와 값으로 want와 number을 추가
        for(int i=0; i<want.length; i++){
            map.put(want[i],number[i]);
        }

        for(int i=0; i<=discount.length-10;i++){
            Map<String, Integer> discntMap = new HashMap<String, Integer>();

            for(int j=i; j<i+10;j++){
                if(discntMap.containsKey(discount[j])){ // 중복된 key이면 값이 1만큼 증가
                    Integer discnt = discntMap.get(discount[j]);
                    discntMap.put(discount[j],++discnt);
                }else {
                    discntMap.put(discount[j],1);
                }
            }

            if(map.equals(discntMap)){
                answer++;
            }
        }

        return answer;
    }
}

