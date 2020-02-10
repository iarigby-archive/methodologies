import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
public class School extends ConsoleProgram {

    private HashMap<String, ArrayList<String>> teachersSubjects;
    private HashMap<String, ArrayList<String>> subjectsTeachers;
    private HashMap<String, ArrayList<String>> studentSubjects;
    private HashMap<String, ArrayList<String>> subjectStudents;
    
    public School() {
        teachersSubjects = new HashMap<String, ArrayList<String>>();
        subjectsTeachers = new HashMap<String, ArrayList<String>>();
        studentSubjects = new HashMap<String, ArrayList<String>>();
        subjectStudents = new HashMap<String, ArrayList<String>>();
    }

    public static void main(String[] args) {
        School s = new School();
        s.addTeacher("teacher");
        s.addSubject("teacher", "subject");
        s.addPupil("pupil", "subject");
        System.out.println(s.getTeachers("pupil").next());
    }
    public void addTeacher(String teacher) {
        ArrayList<String> subjects = new ArrayList<String>();
        teachersSubjects.put(teacher, subjects);
    }

    public void addSubject(String teacher, String subject) {
        // TODO if teacher exists 
        teachersSubjects.get(teacher).add(subject);
        
        if (subjectsTeachers.containsKey(subject)) {
            subjectsTeachers.get(subject).add(teacher);
        } else {
            ArrayList<String> teachers = new ArrayList<String>();
            teachers.add(teacher);
            subjectsTeachers.put(subject, teachers);
        }
    }

    public void addPupil(String pupil, String subject) {
        studentSubjects.get(pupil).add(subject);
        
        if (subjectStudents.containsKey(subject)) {
            subjectStudents.get(subject).add(pupil);
        } else {
            ArrayList<String> student = new ArrayList<String>();
            student.add(pupil);
            subjectStudents.get(subject).add(pupil);
        }
    }

    public Iterator<String> getTeachers(String pupil) {
        ArrayList<String> it = new ArrayList<>();
        for (String subject : studentSubjects.get(pupil)) {
            for (String teacher : subjectsTeachers.get(subject)) {
                if (! it.contains(teacher))
                    it.add(teacher);
            }
        }
        return it.iterator();
    }

    // public Iterator<String> getPupils(String teacher) {
    //     // igive
        
    // }

    public void removeTeacher(String teacher) {

    }
}