// 시저 암호

package com.ohgiraffers.test20240801;

public class 시저암호 {
        public String solution(String s, int n) {
            String answer = "";
            for(int i = 0; i < s.length(); i++ ) {
                int num = Integer.valueOf(s.charAt(i));
                if(num >= 65 && num <= 90) {
                    num += n;
                    if (num > 90) {
                        num-=26;
                    }
                    answer += (char)num;
                } else if (num >= 97 && num <= 122) {
                    num += n;
                    if (num > 122) {
                        num-=26;
                    }
                    answer += (char)num;
                } else if(num == 32) {
                    answer += " ";
                }
            }
            return answer;
        }
    }

