public class GrilFriendTest {

    public static void main(String[] args) {

        GrilFriend[] arr = new GrilFriend[4];

        GrilFriend g1 = new GrilFriend("张三", 18, '女', "唱");
        GrilFriend g2 = new GrilFriend("李四", 19, '女', "跳");
        GrilFriend g3 = new GrilFriend("王五", 20, '女', "RAP");
        GrilFriend g4 = new GrilFriend("赵六", 21, '女', "打篮球");
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        int avgAge = (g1.getAge() + g2.getAge() + g3.getAge() + g4.getAge()) / 4;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < avgAge) {
                arr[i].toString();
                count++;

            }

        }
        System.out.println("年龄平均值:" + avgAge);
        System.out.println("年龄比平均值低的女朋友有" + count + "个");

    }
}