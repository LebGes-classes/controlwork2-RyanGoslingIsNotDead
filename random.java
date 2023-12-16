public class random {
    public static int randint(int num1, int num2) {
        int rand = (int) (Math.random() * num2 + num1);
        if (rand > num2) {
            rand = rand - num1;
        }
        return rand;
    }
    public static String randomStudent() {
        int rand = randint(1, 2);
        if (rand==1){
            return "Itis";
        } else {
            return "Ivmit";
        }
    }
    public static String randomRabot() {
        int rand = randint(1, 2);
        if (rand==1){
            return "Programming";
        } else {
            return "ElecEngineering";
        }
    }
}
