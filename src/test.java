import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List list = Arrays.asList("a", "b", "b", "c", "a", "b", "c");
        List listNew = new ArrayList();
        listNew.addAll(list);
        for (int i = 0; i < listNew.size(); i++) {
         if ("b".equals(listNew.get(i))) {
         listNew.remove(i);
         System.out.println("aaaa");
         System.out.println("bbbb");
         System.out.println("cccc");
         System.out.println("顶顶顶顶");
             System.out.println("cccc");
         }
        }
//        Iterator<String> it = listNew.iterator();
//        while (it.hasNext() ) {
//String ss=it.next();
//if(ss.equals("b"))
//            it.remove();
//        }
        System.out.println(listNew);

    }
}
