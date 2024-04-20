package org.example;

import org.testng.annotations.Test;
import utilities.DbUtility;

public class DbUtilTests {

    @Test
    public void dbTest1(){
        DbUtility dbUtility = new DbUtility();
        dbUtility.runQuery("select * from item");
    }

    @Test
    public void dbTest2(){
        DbUtility dbUtility = new DbUtility();
        dbUtility.runQuery("select * from item");
    }

    @Test
    public void dbTest3(){
        DbUtility dbUtility = new DbUtility();
        dbUtility.runQuery("select * from item");
    }

    @Test
    public void dbTest4(){
        DbUtility dbUtility = new DbUtility();
        dbUtility.runQuery("select * from item");
    }

    @Test
    public void dbTest5(){
        DbUtility dbUtility = new DbUtility();
        dbUtility.runQuery("select * from item");
    }

}
