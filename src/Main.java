import dataStructures.Pair;

public class Main {
    public static void main(String[] args){
        Pair<Integer, Character> p = new Pair<>(null, 'a');
        Pair<Integer, Integer> p2 = new Pair<>();
        p2.setFirst(2);
        p2.setSecond(1);
        p.swap();
        p2.swap(p);
        System.out.println(p+""+p2);
        System.out.println(p.equals(p2));
    }
}
