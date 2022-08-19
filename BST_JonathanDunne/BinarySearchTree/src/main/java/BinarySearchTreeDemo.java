import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;


public class BinarySearchTreeDemo {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(12);
        bst.insert(8);
        bst.insert(19);
        bst.insert(28);
        bst.insert(1);
        bst.insert(68);
        bst.order();

        ObjectMapper map = new ObjectMapper();

        try {
            String tree = map.writerWithDefaultPrettyPrinter().writeValueAsString(bst);
            System.out.println(tree);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
       
    }
}
