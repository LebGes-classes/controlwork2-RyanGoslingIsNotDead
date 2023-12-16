
public class ItisStudent extends Student{
    private int baliItis;
    ItisStudent(){}
    public ItisStudent(String type){
        super(type);
        this.baliItis = 0;
    }
    public int getBaliItis() {
        return baliItis;
    }
    @Override
    public void makeProgramming(){
        this.baliItis = baliItis+random.randint(4, 5);
    }
    @Override
    public void makeElecEngineering(){
        this.baliItis = baliItis+random.randint(3, 4);
    }
}
