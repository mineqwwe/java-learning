public class girlFriend {
    private String name;
    private double hight;
    private double weight;

    // auto generated
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void show() {
        System.out.println("我女朋友叫" + name + ", 身高" + hight + "厘米, 体重=" + weight + "斤");

    }

    public void wash() {
        System.out.println("女朋友帮我洗衣服");

    }

    public void cook() {
        System.out.println("女朋友给我做饭");

    }

}