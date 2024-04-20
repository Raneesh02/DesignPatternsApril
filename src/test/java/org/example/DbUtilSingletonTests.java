package org.example;

import org.testng.annotations.Test;
import utilities.DBUtilSingleTon;

public class DbUtilSingletonTests {
    DBUtilSingleTon dbUtilSingleTon = DBUtilSingleTon.getInstance();

    @Test
    public void testDbUtil(){
        DBUtilSingleTon dbUtilSingleTon = DBUtilSingleTon.getInstance();
        dbUtilSingleTon.runQuery("feawf");
        DBUtilSingleTon.method();
    }


    @Test
    public void dbTest2(){
        DBUtilSingleTon dbUtilSingleTon = DBUtilSingleTon.getInstance();
        dbUtilSingleTon.runQuery("select * from item");
    }

    @Test
    public void dbTest3(){
        DBUtilSingleTon dbUtilSingleTon = DBUtilSingleTon.getInstance();
        dbUtilSingleTon.runQuery("select * from item");
    }

    @Test
    public void dbTest4(){
        DBUtilSingleTon dbUtilSingleTon = DBUtilSingleTon.getInstance();
        dbUtilSingleTon.runQuery("select * from item");
    }

    @Test
    public void dbTest5(){
        DBUtilSingleTon dbUtilSingleTon = DBUtilSingleTon.getInstance();
        dbUtilSingleTon.runQuery("select * from item");
    }

}
