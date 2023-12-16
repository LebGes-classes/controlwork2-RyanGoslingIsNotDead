public class IvmitStudent extends Student{
    private int baliIvmit;
    IvmitStudent(){}
    public IvmitStudent(String type){
        super(type);
        this.baliIvmit = 0;
    }
    public int getBaliIvmit() {
        return baliIvmit;
    }
    @Override
    public void makeProgramming(){
        this.baliIvmit = baliIvmit+random.randint(3, 4);
    }
    @Override
    public void makeElecEngineering(){
        this.baliIvmit = baliIvmit+random.randint(4, 5);
    }
}

