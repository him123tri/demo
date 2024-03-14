package Interview;
import java.util.HashMap;

class Execution {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Harry Potter", 90);
        map.put("HarryPotter2",100);
        // Map inside hashMap:
        HashMap<String, HashMap<String, Integer>> valuesWithAuthorDetails = new HashMap<>();
        valuesWithAuthorDetails.put("Himanshu",map);
        valuesWithAuthorDetails.put("Bhavana",map);
        Books b = new Books();
        b.setBooks(valuesWithAuthorDetails);
        System.out.println(b.getBooks());


    }
}
