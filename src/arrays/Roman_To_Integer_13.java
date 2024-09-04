import java.util.HashMap;
import java.util.Map;

void main () {
  System.out.println(romanToInt("MCMXCIV"));
}


private int romanToInt(String s) {
    var romanMap = init();
    int result = 0;
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (i + 1 < chars.length && romanMap.get(chars[i]) < romanMap.get(chars[i + 1])) {
        result -= romanMap.get(chars[i]);
      } else
        result += romanMap.get(chars[i]);
    }
    return result;
}



private Map<Character, Integer> init() {

  Map<Character, Integer> map = new HashMap<>();
  map.put('I', 1);
  map.put('V', 5);
  map.put('X', 10);
  map.put('L', 50);
  map.put('C', 100);
  map.put('D', 500);
  map.put('M', 1000);

  return map;
}
