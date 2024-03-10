import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Blackline {

    public static void main(String[] args) {
        String versions[] = {"3.1.1", "3.1.2", "3.0", "3", "3.0.0", "3.0.5"};

        for (String string : versions) {
            String s = string.replace(".", "");
            if (Integer.valueOf(s) > 305) {
                System.out.println(s);
            }
        }

    }}