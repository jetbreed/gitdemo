import java.util.Arrays;
import java.util.Scanner;

public class LogicDeclaration {
    String mySelectedCode;
    Scanner courseCode = new Scanner(System.in);
    String jetbreed[] = {"JSF", "ANDROID", "SPRING", "GIT"};
    String derby[] = {"JAVA", "HTML5", "JQUERY", "JSP"};
    String frank[] = {"PYTHON", "DATA ANALYSIS"};
    String code;

    public void myLogic() {
       mySelectedCode = courseCode.nextLine().toUpperCase();

        if (Arrays.stream(jetbreed).anyMatch(mySelectedCode::equals)) {
            System.out.println();
        } else if (Arrays.stream(jetbreed).anyMatch(mySelectedCode::equals)) {
            System.out.println("JEBREED");
        } else if (Arrays.stream(derby).anyMatch(mySelectedCode::equals)) {
            System.out.println("DERBY");
        } else if (Arrays.stream(frank).anyMatch(mySelectedCode::equals)) {
            System.out.println("FRANK");
        } else {
            System.out.println("GENERAL COURSE");
        }
    }
}

