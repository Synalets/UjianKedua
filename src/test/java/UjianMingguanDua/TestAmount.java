package UjianMingguanDua;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAmount {
    Account account;
    Amount amount;

    @BeforeMethod
    public void setUp(){
        account = new Account();
        amount = new Amount();
    }
    @Test
    public void testAmountwithdraw(){
        account.name = "Stella";
        account.acc_no = 120511111;
        account.amount = 500000;
        account.withdraw(5000);
    }

    @Test
    public void Insert(){
        account.name = "Stella";
        account.acc_no = 12051111;
        account.amount = 50000;
        account.display();
    }

    @Test
    @Parameters
    public void Asserttrue (String text){
        String actual = "Input Data Berhasil";
        String expect = "Input Data Berhasil";
        Assert.assertTrue(actual.equals(expect));
    }
}
