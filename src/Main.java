import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer>arrayList = new ArrayList<>(list);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 != 0 || arrayList.get(i) <= 0){
                arrayList.remove(i);
                i--;
            }
        }
        arrayList.sort(Integer::compare);
        System.out.println(arrayList);
    }
}