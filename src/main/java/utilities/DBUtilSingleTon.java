package utilities;

public class DBUtilSingleTon {

    public static DBUtilSingleTon dbUtilSingleTon = new DBUtilSingleTon();

    //Control the constructor
    private DBUtilSingleTon(){
        System.out.println("DBUtilSingleTon Constructor is called" + this.hashCode());
        //open connection to Oracle , mysql, mongo db
    }

    public static DBUtilSingleTon getInstance(){
        return dbUtilSingleTon;
    }

    public void runQuery(String query){
        System.out.println("Query has run"+ query);
        //closeConnection()
    }

}
