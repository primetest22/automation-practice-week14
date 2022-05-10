package resources.testdata;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import sun.security.util.Password;


public class TestData {

     @DataProvider(name = "credentials")
      public Object[][] getData(){

          Object[][] data = new Object[][]{

                  {" ","123456 ", "An email address required."},
                  {"abcd@gmail.com"," ", "Password is required."},
                  {"adfdfgfg","123456", "Invalid email address."},
                  {"abcd@gmail.com ","123456", "Authentication failed."}

          };
          return data;
      }

@FindBy(xpath = "")
    WebElement ffg;
    @DataProvider(name = "productdata")
    public Object[][] getProductData(){
        String[][] data = new String[][]{
                {"Blouse", "2", "M", "White"},
                {"Printed Dress", "3", "L", "Orange"},
                {"Printed Chiffon Dress", "4", "S", "Green"},
                {"Printed Summer Dress with Price $28.98", "2", "M", "Blue"},
        };
        return data;
    }


}
