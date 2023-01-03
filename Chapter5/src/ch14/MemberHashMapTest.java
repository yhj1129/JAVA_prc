package src.ch14;


import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class MemberHashMapTest {

    public static void main(String[] args) {


        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberHong = new Member(1004, "홍");
        Member memberLee = new Member(1001, "리");
        Member memberKim = new Member( 1002, "김");
        Member memberKang = new Member(1003, "강");

        memberHashMap.addMember(memberHong);
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberKang);

        memberHashMap.showAll();
        System.out.println(memberHashMap);

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1001,"kim");
        hashMap.put(1002,"Lee");
        hashMap.put(1003,"Park");
        hashMap.put(1004,"Yoo");

        System.out.println(hashMap); //그냥 toString은 {1001=kim, 1002=Lee, 1003=Park, 1004=Yoo}으로 나온다


    }
}
