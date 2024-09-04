import java.util.LinkedHashMap;
import java.util.Map;

void main() {
  System.out.println(intToRoman(3749)); //MMMDCCXLIX
}

public String intToRoman(int num) {
  Map<Integer, String> map = init();
  StringBuilder sb = new StringBuilder();

  for (Map.Entry<Integer, String> entry : map.entrySet()) {
    while(num >= entry.getKey()) {
      num -= entry.getKey();
      sb.append(entry.getValue());
    }
  }
  return sb.toString();
}


private Map<Integer, String> init() {
  Map<Integer, String> map = new LinkedHashMap<>();
  map.put(1000, "M");
  map.put(900, "CM");
  map.put(500, "D");
  map.put(400, "CD");
  map.put(100, "C");
  map.put(90, "XC");
  map.put(50, "L");
  map.put(40, "XL");
  map.put(10, "X");
  map.put(9, "IX");
  map.put(5, "V");
  map.put(4, "IV");
  map.put(1, "I");
  return map;
}
