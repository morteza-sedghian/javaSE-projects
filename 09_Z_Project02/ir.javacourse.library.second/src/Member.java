public class Member {
    private final int memberID;
    private String fullName;
    private char memberSex;

    public Member(int memberID, String fullName, char memberSex) {
        this.memberID = memberID;
        this.fullName = fullName;
        this.memberSex = memberSex;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMemberSex(char memberSex) {
        this.memberSex = memberSex;
    }

    public int getMemberID() {
        return memberID;
    }

    public String getFullName() {
        return fullName;
    }

    public char getMemberSex() {
        return memberSex;
    }
}