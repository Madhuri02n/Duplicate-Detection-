import java.io.*;
import java.util.*;

public class DuplicateEmails {

    public static void main(String[] args) throws Exception {

        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        BufferedReader br = new BufferedReader(new FileReader("emails.txt"));
        String email;

        while ((email = br.readLine()) != null) {

            if (seen.contains(email)) {
                duplicates.add(email);
            } else {
                seen.add(email);
            }
        }

        br.close();

        System.out.println("Duplicate Emails:");

        for (String dup : duplicates) {
            System.out.println(dup);
        }
    }
}