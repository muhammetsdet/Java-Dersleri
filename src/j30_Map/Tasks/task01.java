package j30_Map.Tasks;

import java.util.HashMap;
import java.util.Map;

public class task01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon", 296);
        map.put("Ebay", 301);
        map.put("Saturn", 326);
        map.put("MediaMarkt", 340);
        map.put("Apple Store", 320);
        // task -> urun fiyatları toplamını print eden code create ediniz...
        int sum=0;
      for (Integer w:map.values()) {
          sum+=w;
      }
        System.out.println("sum of values--> "+sum);
    }
}
