package ch04.sec07;

public class BreakOutterExample {
    public static void main(String[] args) {
        int a = 5;
        char b = 'a';
        System.out.println(Integer.parseInt("12345"));
        Outter: for(char upper='A'; upper<='Z'; upper++){
        for(char lower='a'; lower<='z'; lower++){
            System.out.println(upper+"-"+lower);
            if(lower=='g') break Outter;
        }
        }
        System.out.println("프로그램 실행종료");
    }
}
