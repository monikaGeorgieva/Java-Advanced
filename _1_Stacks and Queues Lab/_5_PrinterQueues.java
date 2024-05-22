import java.util.ArrayDeque;
import java.util.Scanner;

public class _5_PrinterQueues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("print")){
            if (input.equals("cancel")){
                if (queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else{
                    System.out.println("Canceled " + queue.poll());
                }
            }else {
                queue.offer(input);
            }
            input = scanner.nextLine();
        }

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
//Lab.docx
//cancel
//cancel
//Presentation.pptx
//NoteNothing.txt
//SomeCode.java
//cancel
//print

//CanceledLab.docx
//Printer is on standby
//CanceledPresentation.pptx
//NoteNothing.txt
//SomeCode.java
