package utilities;

public class MultiTh extends Thread{

    public void run(){
        DBUtilSingleTon.getInstance();
    }

}
