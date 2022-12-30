package ch10;

public class MemberArrayListTest {

    public static void main(String[] args) {

        ch10.MemberArrayList memberArrayList = new ch10.MemberArrayList();

        ch10.Member memberLee = new ch10.Member(1001, "리");
        ch10.Member memberKim = new ch10.Member( 1002, "김");
        ch10.Member memberKang = new ch10.Member(1003, "강");
        ch10.Member memberHong = new ch10.Member(1004, "홍");
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberKang);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();
        memberArrayList.removeMember(memberKang.getMemberId());
        memberArrayList.showAllMember();
    }
}
