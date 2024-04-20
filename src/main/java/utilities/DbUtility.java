package utilities;

public class DbUtility {

    public DbUtility(){
        System.out.println("DbUtility Constructor is called" + this.hashCode());
        //open connection to Oracle , mysql, mongo db
    }

    public void runQuery(String query){
        System.out.println("Query has run"+ query);
    }

}
