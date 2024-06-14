import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _5_PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> phonebook = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.contains("search")){
            //John-0888080808
            String name = input.split("-")[0];
            String phoneNumber = input.split("-")[1];


            phonebook.put(name,phoneNumber);
            input = scanner.nextLine();
        }


        String input2 = scanner.nextLine();

        while (!input2.equals("stop")){
            if (phonebook.containsKey(input2)){
                System.out.printf("%s -> %s \n",input2,phonebook.get(input2));
            }else {
                System.out.printf("Contact %s does not exist.\n",input2);
            }
            input2 = scanner.nextLine();
        }
    }
}

//John-0888080808
//search
//Maria
//John
//stop

//output:
//Contact Maria does not exist.
//John -> 0888080808
