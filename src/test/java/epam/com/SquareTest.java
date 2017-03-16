package epam.com;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SquareTest {
    Square square =new Square();

    @DataProvider (name = "DateProviderForSquare")
    public Object [] [] paramForSquareTest (){
        return new Object [] []{
                {2, 3, 6},
                {2, 4, 8}
        };
    }

    @Test (dataProvider = "DateProviderForSquare")
    public void squareTest (int a, int b, int res) {
        Assert.assertEquals(square.findSquare(a, b),res);
    }

}
