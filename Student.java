public abstract class Student {
    private String type;
    Student(){}
    public Student(String type){
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public abstract void makeProgramming();
    public abstract void makeElecEngineering();

}
