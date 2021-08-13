public class Library {
    static Member[] libraryMembers;
    static Book[] libraryBooks;
    public static void main(String[] args) {
        Member myMem = new Member(1, "Morteza Sedghian", 'M');
        System.out.println(myMem.getMemberID() + myMem.getFullName() + myMem.getMemberSex());
    }
}
