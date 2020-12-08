import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void setDate() {
    }

    @Test
    void getDate() {
    }

    @Test
    void checkDate() {
        Date date = new Date();
        // 1
        String case1 = date.checkDate(20,6,1900);
        String expResult = "20/6/1900";
        assertEquals(expResult,case1);
        //2
        String case2 = date.checkDate(20,6,2100);
        expResult = "20/6/2100";
        assertEquals(expResult,case2);
        //3
        String case3 = date.checkDate(20,6,2000);
        expResult = "20/6/2000";
        assertEquals(expResult,case3);
        //4
        String case4 = date.checkDate(20,6,2001);
        expResult = "20/6/2001";
        assertEquals(expResult,case4);
        // 5
        String case5 = date.checkDate(20,1,1900);
        expResult = "20/1/1900";
        assertEquals(expResult,case5);
        // 6
        String case6 = date.checkDate(20,1,2100);
        expResult = "20/1/2100";
        assertEquals(expResult,case6);
        // 7
        String case7 = date.checkDate(20,1,2000);
        expResult = "20/1/2000";
        assertEquals(expResult,case7);
        // 8
        String case8 = date.checkDate(20,1,2001);
        expResult = "20/1/2001";
        assertEquals(expResult,case8);
        //9
        String case9 = date.checkDate(20,2,1900);
        expResult = "20/2/1900";
        assertEquals(expResult,case9);
        //10
        String case10 = date.checkDate(20,2,2100);
        expResult = "20/2/2100";
        assertEquals(expResult,case10);
        //11
        String case11 = date.checkDate(20,2,2000);
        expResult = "20/2/2000";
        assertEquals(expResult,case11);
        //12
        String case12 = date.checkDate(20,2,2001);
        expResult = "20/2/2001";
        assertEquals(expResult,case12);
        //13
        String case13 = date.checkDate(29,6,1900);
        expResult = "29/6/1900";
        assertEquals(expResult,case13);
        //14
        String case14 = date.checkDate(29,6,2100);
        expResult = "29/6/2100";
        assertEquals(expResult,case14);
        //15
        String case15 = date.checkDate(29,6,2000);
        expResult = "29/6/2000";
        assertEquals(expResult,case15);
        //16
        String case16 = date.checkDate(29,6,2001);
        expResult = "29/6/2001";
        assertEquals(expResult,case16);
        //17
        String case17 = date.checkDate(29,1,1900);
        expResult = "29/1/1900";
        assertEquals(expResult,case17);
        //18
        String case18 = date.checkDate(29,1,2100);
        expResult = "29/1/2100";
        assertEquals(expResult,case18);
        //19
        String case19 = date.checkDate(29,1,2000);
        expResult = "29/1/2000";
        assertEquals(expResult,case19);
        //20
        String case20 = date.checkDate(29,6,2001);
        expResult = "29/6/2001";
        assertEquals(expResult,case20);
        //21
        String case21 = date.checkDate(29,2,1900);
        expResult = "Error";
        assertEquals(expResult,case21);
        //22
        String case22 = date.checkDate(29,2,2100);
        expResult = "Error";
        assertEquals(expResult,case22);
        //23
        String case23 = date.checkDate(29,2,2000);
        expResult = "29/2/2000";
        assertEquals(expResult,case23);
        //24
        String case24 = date.checkDate(29,2,2001);
        expResult = "Error";
        assertEquals(expResult,case24);
        //25
        String case25 = date.checkDate(30,6,1900);
        expResult = "30/6/1900";
        assertEquals(expResult,case25);
        //26
        String case26 = date.checkDate(30,6,2100);
        expResult = "30/6/2100";
        assertEquals(expResult,case26);
        //27
        String case27 = date.checkDate(30,6,2000);
        expResult = "30/6/2000";
        assertEquals(expResult,case27);
        //28
        String case28 = date.checkDate(30,6,2001);
        expResult = "30/6/2001";
        assertEquals(expResult,case28);
        //29
        String case29 = date.checkDate(30,1,1900);
        expResult = "30/1/1900";
        assertEquals(expResult,case29);
        //30
        String case30 = date.checkDate(30,1,2100);
        expResult = "30/1/2100";
        assertEquals(expResult,case30);
        //31
        String case31 = date.checkDate(30,1,2000);
        expResult = "30/1/2000";
        assertEquals(expResult,case31);
        //32
        String case32 = date.checkDate(30,1,2001);
        expResult = "30/1/2001";
        assertEquals(expResult,case32);
        //33
        String case33 = date.checkDate(30,2,1900);
        expResult = "Error";
        assertEquals(expResult,case33);
        //34
        String case34 = date.checkDate(30,2,2100);
        expResult = "Error";
        assertEquals(expResult,case34);
        //35
        String case35 = date.checkDate(30,2,2000);
        expResult = "Error";
        assertEquals(expResult,case35);
        //36
        String case36 = date.checkDate(30,2,2001);
        expResult = "Error";
        assertEquals(expResult,case36);
        //37
        String case37 = date.checkDate(31,6,1900);
        expResult = "Error";
        assertEquals(expResult,case37);
        //38
        String case38 = date.checkDate(31,6,2100);
        expResult = "Error";
        assertEquals(expResult,case38);
        //39
        String case39 = date.checkDate(31,6,2000);
        expResult = "Error";
        assertEquals(expResult,case39);
        //40
        String case40 = date.checkDate(31,6,2001);
        expResult = "Error";
        assertEquals(expResult,case40);
        //41
        String case41 = date.checkDate(31,6,1900);
        expResult = "Error";
        assertEquals(expResult,case41);
        //42
        String case42 = date.checkDate(31,1,2100);
        expResult = "31/1/2100";
        assertEquals(expResult,case42);
        //43
        String case43 = date.checkDate(31,1,2000);
        expResult = "31/1/2000";
        assertEquals(expResult,case43);
        //44
        String case44 = date.checkDate(31,1,2001);
        expResult = "31/1/2001";
        assertEquals(expResult,case44);
        //45
        String case45 = date.checkDate(31,2,1900);
        expResult = "Error";
        assertEquals(expResult,case45);
        //46
        String case46 = date.checkDate(31,2,2100);
        expResult = "Error";
        assertEquals(expResult,case46);
        //47
        String case47 = date.checkDate(31,2,2000);
        expResult = "Error";
        assertEquals(expResult,case47);
        //482001
        String case48 = date.checkDate(31,2,2001);
        expResult = "Error";
        assertEquals(expResult,case48);
    }

    @Test
    void main() {
    }
}