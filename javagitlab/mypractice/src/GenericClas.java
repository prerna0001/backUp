//generic class

import java.util.ArrayList;
import java.util.List;

public class GenericClas<T> {
public static void main(String args[]) {

    List<String> list = new ArrayList<>();
    list.add("Pranita");
    list.add("Rutu");

    System.out.println(list);

    System.out.println(list.get(0));

    for(String Names:list)
    {
        System.out.println(Names);
    }
}

}