package org.example;

import org.testng.annotations.Test;
import utilities.DBUtilSingleTon;

public class DbUtilSingletonTests {
    DBUtilSingleTon dbUtilSingleTon = DBUtilSingleTon.getInstance();
    @Test
    public void dbTest1(){
        dbUtilSingleTon.runQuery("select * from item");
    }

    @Test
    public void dbTest2(){
        dbUtilSingleTon.runQuery("select * from item");
    }

    @Test
    public void dbTest3(){
        dbUtilSingleTon.runQuery("select * from item");
    }

    @Test
    public void dbTest4(){
        DBUtilSingleTon dbUtilSingleTon = DBUtilSingleTon.getInstance();
        dbUtilSingleTon.runQuery("select * from item");
    }

    @Test
    public void dbTest5(){
        dbUtilSingleTon.runQuery("select * from item");
    }

}
