import com.oracle.graal.compiler.enterprise.phases.strings.w;

public class LoopsTask7 {
    public static void main(String[] args) {
        int startYear = 1988;
        int endYear = 2019;
        while (startYear <= endYear) {
            if ((startYear % 4 == 0 && !(startYear % 100 == 0)) || startYear % 400 == 0) {
                System.out.println("闰年:" + startYear);
            }
            startYear++;

        }

    }
}