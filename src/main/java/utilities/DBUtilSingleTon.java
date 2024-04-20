package utilities;

public class DBUtilSingleTon {

//    //Eager initialization
//    static DBUtilSingleTon dbUtilSingleTon = new DBUtilSingleTon();
//
//    public static DBUtilSingleTon getInstance(){
//        return dbUtilSingleTon;
//    }

    //Lazy Initialization
//    static DBUtilSingleTon dbUtilSingleTon;
//
//    public static DBUtilSingleTon getInstance()  {
//        if(dbUtilSingleTon == null) {
//            dbUtilSingleTon = new DBUtilSingleTon();
//        }
//        else{
//            System.out.println("dbutil already created");
//        }
//        return dbUtilSingleTon;
//    }
    //Lazy Initialization

    //Thread safe init
    static DBUtilSingleTon dbUtilSingleTon;

    public static synchronized DBUtilSingleTon getInstance()  {
        if(dbUtilSingleTon == null) {
            dbUtilSingleTon = new DBUtilSingleTon();
        }
        else{
            System.out.println("dbutil already created");
        }
        return dbUtilSingleTon;
    }
    //Thread safe init

    //Control the constructor
    private DBUtilSingleTon(){
        System.out.println("DBUtilSingleTon Constructor is called" + this.hashCode());
        //open connection to Oracle , mysql, mongo db
    }

    public void runQuery(String query){
        System.out.println("Query has run"+ query);
        //closeConnection()
    }

    public static void method(){
        System.out.println("method");
    }

}
