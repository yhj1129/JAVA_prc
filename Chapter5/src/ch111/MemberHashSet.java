package src.ch111;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;
    public MemberHashSet(){
        hashSet = new HashSet<>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){
//        for (int i=0; i< HashSet.size();i++){
//            Member member = HashSet.get(i);
//
//            int tempId = member.getMemberId();
//            if (tempId==memberId){
//                HashSet.remove(i);
//                return true;
//            }
//        }
//        System.out.println(memberId + "가 존재하지 않습니다.");
//        return false;

        Iterator<Member> ir = hashSet.iterator();
        while (ir.hasNext()){
            Member member = ir.next();

            int tempId = member.getMemberId();
            if (tempId==memberId){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for (Member member : hashSet){
            System.out.println(member);
        }
        System.out.println();
    }
}
