package tw.designpattern.structural.composite3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason_Chien on 2017/5/5.
 */
public class FamilyTree {
    public static void main(String[] args) {
        Member member1=new Member.MemberBuilder("jason").setAge(50).setBelong("Chien").build();
        Member member2=new Member.MemberBuilder("Sarah").setAge(50).setBelong("Chien").build();
        Member member3=new Member.MemberBuilder("Billy").setAge(50).setBelong("Chien").build();
        member3.addMember(member1);
        member3.addMember(member2);

        System.out.println(member3);
        for (Member member : member3.getFamilyName()) {
            System.out.println(member);
        }

    }

}
class Member{
    private String name;
    private int age;
    private String belong;
    private List<Member> FamilyName;

    public Member(MemberBuilder memberBuilder) {
        this.name = memberBuilder.name;
        this.age = memberBuilder.age;
        this.belong = memberBuilder.belong;
        FamilyName = new ArrayList<>();
    }

    public void addMember(Member member) {
        FamilyName.add(member);
    }

    public List<Member> getFamilyName() {
        return FamilyName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", belong='" + belong + '\'' +
                '}';
    }

    static class MemberBuilder{
        private String name;
        private int age;
        private String belong;

        public MemberBuilder(String name) {
            this.name = name;
        }

        public MemberBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public MemberBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public MemberBuilder setBelong(String belong) {
            this.belong = belong;
            return this;
        }

        public Member build(){
            return new Member(this);
        }

    }


}