package org.example;

import org.testng.annotations.Test;
import utilities.DBUtilSingleTon;
import utilities.MultiTh;

public class DbUtilSingletonTests {

    @Test
    public void testMultiTh(){

        for(int i=1;i<=100;i++) {
            MultiTh th = new MultiTh();
            th.start();
        }

    }

    @Test
    public void testMultiTh2(){

        for(int i=1;i<=100;i++) {
            MultiTh th = new MultiTh();
            th.start();
        }

    }

//    @Test
//    public void testDbUtil(){
//        DBUtilSingleTon dbUtilSingleTon = DBUtilSingleTon.getInstance();
//        dbUtilSingleTon.runQuery("feawf");
//        DBUtilSingleTon.method();
//    }


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
