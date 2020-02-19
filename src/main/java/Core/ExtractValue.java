package Core;

import java.util.HashMap;
import java.util.Map;

public class ExtractValue {
    private Map map;

    public ExtractValue(){
        map = new HashMap();
        map.put('1',"/html/body/center/div/div[2]/span[9]");
        map.put('2', "/html/body/center/div/div[2]/span[10]");
        map.put('3', "/html/body/center/div/div[2]/span[11]");
        map.put('4',"/html/body/center/div/div[2]/span[5]");
        map.put('5',"/html/body/center/div/div[2]/span[6]");
        map.put('6',"/html/body/center/div/div[2]/span[7]");
        map.put('7',"/html/body/center/div/div[2]/span[1]");
        map.put('8', "/html/body/center/div/div[2]/span[2]");
        map.put('9',"/html/body/center/div/div[2]/span[3]");
        map.put('0',"/html/body/center/div/div[2]/span[13]");
        map.put('.',"/html/body/center/div/div[2]/span[14]");
        map.put('*',"/html/body/center/div/div[2]/span[16]");
        map.put('/',"/html/body/center/div/div[2]/span[12]");
        map.put('+',"/html/body/center/div/div[2]/span[4]");
        map.put('-',"/html/body/center/div/div[2]/span[8]");
        map.put('=',"/html/body/center/div/div[2]/span[15]");
    }

    public String getDigit(char numbers) {
        return map.get(numbers).toString();
        //return  map.getOrDefault(numbers,QUESTION_MARK).toString();
    }
}
