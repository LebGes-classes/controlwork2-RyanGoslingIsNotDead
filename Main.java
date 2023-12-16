import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Student> spisok = new ArrayList<>();
        int CountHuman = random.randint(1, 10);
        int CountRabot = random.randint(1, 10);
        for (int i=0; i<CountHuman;i++){
            String typeStudent = random.randomStudent();
            if (typeStudent.equals("Itis")){
                ItisStudent student = new ItisStudent("Itis");
                for (int j=0; j<CountRabot;j++){
                    String typeRabot = random.randomRabot();
                    if (typeRabot.equals("Programming")){
                        student.makeProgramming();
                    } else {
                        student.makeElecEngineering();
                    }
                }
                spisok.add(student);
            } else {
                IvmitStudent student = new IvmitStudent("Ivmit");
                for (int j=0; j<CountRabot;j++){
                    String typeRabot = random.randomRabot();
                    if (typeRabot.equals("Programming")){
                        student.makeProgramming();
                    } else {
                        student.makeElecEngineering();
                    }
                }
                spisok.add(student);
            }
        }
        System.out.print(spisok);


    }
}