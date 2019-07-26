import java.util.Scanner;

public class findValueOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String list[] = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean isExit = false;
        String alert = "";
        while (!isExit) {
            System.out.println("input student name");
            String name = scanner.nextLine();
            for (int i = 0; i < list.length; i++) {
                if (list[i].equals(name)) {
                    System.out.println(" position of " + name + " is " + i);
                    isExit = true;
                    break;
                }
            }
            if(!isExit){
                System.out.println("not found");
            }
        }
    }
}
