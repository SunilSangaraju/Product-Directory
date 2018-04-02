import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
*
 * Used junit-4.8.1 jar file
*
*/
public class ProductsTest{

       private List<Product> products ;

       @Before
       public void before(){
              products = new ArrayList<Product>();
       }

       @After
       public void after(){
              products = null;
       }

       @Test
       public void addFirstSet(){
              products = new ArrayList<Product>();

              products = Products.addToList(products, getProducts(1,25));

              assertNotNull(products);

              products = Products.sortByName(products);

              assertTrue(products.size()==25);

              assertTrue("product1".equals(products.get(0).getName()));

       }

       @Test
       public void secondSet(){
              products = new ArrayList<Product>();

              products = Products.addToList(products, getProducts(26,50));

              assertNotNull(products);

              products = Products.sortByCategory(products);

              assertTrue(products.size()==25);

              assertTrue("category26".equals(products.get(0).getCategory()));

       }

       @Test
       public void thirdSet(){
              products = new ArrayList<Product>();

              products = Products.addToList(products, getProducts(51,75));

              products = Products.sortByExpiryDate(products);

              assertTrue(products.size()==25);

       }

       @Test
       public void fullTest(){
              products = new ArrayList<Product>();

              products = Products.addToList(products, getProducts(1,25));

              products = Products.sortByName(products);

              assertTrue("product1".equals(products.get(0).getName()));

              products = Products.addToList(products, getProducts(26,50));

              products = Products.sortByCategory(products);

              assertTrue("category1".equals(products.get(0).getCategory()));

              products = Products.addToList(products, getProducts(51,75));

              products = Products.sortByExpiryDate(products);     

              products = Products.filterByCategory(products, "category1");     

              products = Products.sortByNumber(products);

              assertTrue(products.size()==74);

              assertTrue(2 == products.get(0).getNumber());
       }


       private List<Product> getProducts(int start, int end){
              List<Product> current = new ArrayList<Product>();
              for(int i=start;i<=end;i++){
                  current.add(new Product(i,"product"+i,"category"+i,new Date()));
              }
              return current;
       }

}