import java.util.ArrayList;

public class day7 extends Lessons{

    public day7(Student student) {
        super("Day 7 Lessons", 10);
    }

    public boolean getLesson() {
        ArrayList qArray = new ArrayList();
        qArray.add(0, "What is Agile?");
        qArray.add(1, "What is Scrum?");
        qArray.add(2, "What are teh scrum roles?");
        qArray.add(3, "What are the scrum artifacts?");
        qArray.add(4, "What are the scrum meetings?");
        qArray.add(5, "Who is the Scrum Master?");
        qArray.add(6, "What is the Sprint?");
        qArray.add(7, "What is the Demo Meeting?");
        qArray.add(8, "What is the Retro Meeting ?");
        qArray.add(9, "What is the Acceptence Criterias ?");

        String answer = "";
        do {
            for (int i = 0; i < lessonLenght; i++) {

                System.out.println((i + 1) + ". question:");
                System.out.println(qArray.get(i));
                System.out.println();
                System.out.println("Please enter \"Y\" for the next question.");
                System.out.println("Please enter \"E\" for the main page. ");

                answer = scan.next().toLowerCase();
                while (!(answer.equals("y") || answer.equals("e") )) {
                    System.out.println("Invalid entry,please try again.");
                    answer = this.scan.next().toLowerCase();
                }
                if (answer.equals("e")) break;

                System.out.println("------------------------------------------");


            }
        } while (answer.equals("y"));


        return true;


    }
}


