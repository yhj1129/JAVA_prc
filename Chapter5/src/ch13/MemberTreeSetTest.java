package src.ch13;


import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        //return s1.compareTo(s2); // 원래 정렬과 같음
        return s1.compareTo(s2)*(-1);//내림차순으로 정렬된다
    }
}

public class MemberTreeSetTest {

    public static void main(String[] args) {


//        MemberTreeSet memberTreeSet = new MemberTreeSet();
//
//        Member memberHong = new Member(1004, "홍");
//        Member memberLee = new Member(1001, "리");
//        Member memberKim = new Member( 1002, "김");
//        Member memberKang = new Member(1003, "강");
//
//        memberTreeSet.addMember(memberHong);
//        memberTreeSet.addMember(memberLee);
//        memberTreeSet.addMember(memberKim);
//        memberTreeSet.addMember(memberKang);
//
//        memberTreeSet.showAllMember();

        TreeSet<String> set = new TreeSet<String>(new MyCompare()); //정렬할 방식을 넣어줘야한다
        set.add("Park");
        set.add("Kim");
        set.add("Lee");

        System.out.println(set); //오름차순으로 정렬되어 나온다

    }
}
