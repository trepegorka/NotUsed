package mypackage;
import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer>list = new ArrayList<>();
        for(int i=0; i<100000; i++){
            list.add(i);
        }
        int a=99000;
        for(int i=0; i<list.size(); i++){
            if (list.get(i)==a){
                System.out.println("found it");
            }
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println(timeSpent);
    }
}
