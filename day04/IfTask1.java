public class IfTask1{
    public static void main(String[] args){

        int newPhone = 7988;
        int oldOphone = 1500;
        float discount = 0.8f;

        float notGiveCost = newPhone - oldOphone;
        float doGiveCost = newPhone*discount;

        if(notGiveCost < doGiveCost){
            System.out.println("不使用以旧换新");
        }else if(notGiveCost > doGiveCost){
            System.out.println("使用以旧换新");
        }else{
            System.out.println("都可以");
        }
        System.out.println("不使用以旧换新："+ notGiveCost);
        System.out.println("使用以旧换新："+ doGiveCost);

    }
}