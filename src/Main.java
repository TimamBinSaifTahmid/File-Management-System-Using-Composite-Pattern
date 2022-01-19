public class Main {
    public static void main(String[] args) {
        File strategy =new File("Strategy Pattern","ppt");
        File observer =new File("Observer Pattern","ppt");
        File midSyllabus =new File("Mid Syllabus","doc");
        File composite =new File("Composite Pattern","ppt");
        File finalSyllabus =new File("Final Syllabus","pdf");
        File assignment1 =new File("Assignment-1","pdf");
        File assignment2 =new File("Assignment-2","pdf");
        File readME =new File("readME","text");
        Folder midExam =new Folder("Mid Exam","Folder");
        Folder finalExam =new Folder("Final Exam","Folder");
        Folder lectures =new Folder("Lectures","Folder");
        Folder assignments =new Folder("Assignments","Folder");
        Folder dp =new Folder("Design Pattern","Folder");

       observer.doubleClick();

        midExam.add(strategy);
        midExam.add(observer);
        midExam.singleClick();
        midExam.doubleClick();
        midExam.add(midSyllabus);
        finalExam.add(composite);
        finalExam.add(finalSyllabus);
        lectures.add(midExam);
        lectures.add(finalExam);
        assignments.add(assignment1);
        assignments.add(assignment2);
        dp.add(lectures);
        dp.add(readME);
        dp.add(assignments);
        dp.singleClick();
        dp.doubleClick();
        dp.remove(readME);
        dp.doubleClick();

    }
}
