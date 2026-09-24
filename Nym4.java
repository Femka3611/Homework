public class Nym4 {
    public static void main(String[] args){
        int sm = 0;
        for (int i = 99; i <= 999; i++) {
            String s = String.valueOf(i);
            if (s.chars().distinct().count() == s.length()) { sm += i; }
            //System.out.println(s);
        }
        System.out.println(sm);
    }
    
}
