package src.ch14;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member){
        //put으로 넣도록 구현되어 있음
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId){
        if (hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
        }
        System.out.println("no element");
        return false;
    }

    public void showAll(){

        Iterator<Integer> ir = hashMap.keySet().iterator();

        while (ir.hasNext()){ //다음 값이 없을 때까지

            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
    }
}
