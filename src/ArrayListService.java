import java.util.*;

public class ArrayListService {
    //ArrayList CRUD
    private List<String> arrList = new ArrayList<String>();

    public void addItem(String[] items){
        arrList.addAll(Arrays.asList(items));
    }
    public void addItem(String item){
        arrList.add(item);
    }
//    probably not the right functionality for a read
//    public void readItem(String item){
//        arrList.indexOf(item);
//    }
    public void readItem(int index){
        arrList.get(index);
    }
    public void updateItem(String item, String update){
        int index = arrList.indexOf(item);
        //I feel like this might result in misplacement, needs testing
        arrList.remove(index);
        arrList.add(index, update);
    }
    public void deleteItem(String item){
        arrList.remove(item);

    }

    @Override
    public String toString() {
        return arrList.toString();
    }
}
