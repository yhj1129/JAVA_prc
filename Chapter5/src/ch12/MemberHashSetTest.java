package ch12;


public class MemberHashSetTest {

    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "리");
        Member memberKim = new Member( 1002, "김");
        Member memberKang = new Member(1003, "강");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberKang);

        Member memberHong = new Member(1003, "홍");
        memberHashSet.addMember(memberHong);

        memberHashSet.showAllMember();
    }
}
