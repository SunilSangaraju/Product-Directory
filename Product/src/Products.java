import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Products {

       public static List<Product> addToList(List<Product> old, List<Product> current){
              return current.stream().collect(Collectors.toCollection(()->old));
       }

       public static List<Product> sortByNumber(List<Product> products){
              return sorted(products,(e1, e2) -> Integer.compare(e1.getNumber(),e2.getNumber()));
       }

       public static List<Product> sortByName(List<Product> products){
              return sorted(products,(e1, e2) -> e1.getName().compareTo(e2.getName()));
       }

       public static List<Product> sortByCategory(List<Product> products){
              return sorted(products,(e1, e2) -> e1.getCategory().compareTo(e2.getCategory()));
       }

       public static List<Product> sortByExpiryDate(List<Product> products){
              return sorted(products,(e1, e2) -> e1.getExpiryDate().compareTo(e2.getExpiryDate()));
       }

       private static List<Product> sorted(List<Product> products,Comparator<Product> sortValue){
              return products.stream().sorted(sortValue).collect(Collectors.toList());
       }

       public static List<Product> filterByCategory(List<Product> products,String category){
              return products.stream().filter(product->!category.equals(product.getCategory())).collect(Collectors.toList());
       }

}

