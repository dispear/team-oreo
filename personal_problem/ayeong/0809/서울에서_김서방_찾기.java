

public class 서울에서김서방찾기 {
    public String solution1(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");

        return String.valueOf(new StringBuilder("김서방은 ").append(index).append("에 있다"));
    }