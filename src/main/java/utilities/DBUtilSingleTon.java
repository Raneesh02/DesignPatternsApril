package utilities;

public class DBUtilSingleTon {

//    //Eager initialization
//    static DBUtilSingleTon dbUtilSingleTon = new DBUtilSingleTon();
//
//    public static DBUtilSingleTon getInstance(){
//        return dbUtilSingleTon;
//    }

    //Lazy Initialization
    static DBUtilSingleTon dbUtilSingleTon;

    public static DBUtilSingleTon getInstance()  {
        if(dbUtilSingleTon == null) {
            dbUtilSingleTon = new DBUtilSingleTon();
        }
        else{
            System.out.println("dbutil already created");
        }
        return dbUtilSingleTon;
    }
    //Lazy Initialization

    //Thread safe init
//    static DBUtilSingleTon dbUtilSingleTon;
//
//    public static synchronized DBUtilSingleTon getInstance()  {
//        if(dbUtilSingleTon == null) {
//            dbUtilSingleTon = new DBUtilSingleTon();
//        }
//        else{
//            System.out.println("dbutil already created");
//        }
//        return dbUtilSingleTon;
//    }
    //Thread safe init

    //Double Locking Thread Safe
//    private static DBUtilSingleTon dbUtil;
//
//    public static DBUtilSingleTon getInstance() {
//        if(dbUtil == null){
//            System.out.println("Thread inside if waiting to create resource");
//            synchronized (DBUtilSingleTon.class) {
//                if(dbUtil == null){
//                    dbUtil = new DBUtilSingleTon();
//                    System.out.println("DBUtilSingleton Instance Created" + dbUtil.hashCode());
//                }
//                else {
//                    System.out.println("Double locking worked");
//                }
//            }
//        }
//        System.out.println("DBUtilSingleton Instance Returned" + dbUtil.hashCode());
//        return dbUtil;
//    }
    //Double Locking Thread Safe

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
