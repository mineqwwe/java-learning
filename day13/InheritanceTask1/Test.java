package day13.InheritanceTask1;

public class Test {
    public static void main(String[] args) {
        // 讲师(Lecturer)和助教(Tutor)
        Lecturer lecturer = new Lecturer("001","讲师","讲师讲师");
        System.out.println(lecturer.getName());

        Tutor tutor = new Tutor("002","助教","助教助教");
        System.out.println(tutor.getName());

        //维护专员(Maintainer),采购专员(Buyer)
        Maintainer maintainer = new Maintainer("003","维护专员","维护专员维护专员");
        System.out.println(maintainer.getName());

        Buyer buyer = new Buyer("004","采购专员","采购专员采购专员");
        System.out.println(buyer.getName());


    }
}
