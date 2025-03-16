import java.util.*;

public class Encode_And_Decode_Strings_271 {

    static Map<Integer, String> map = new HashMap<>();

    public String encode(List<String> strs) {

        if(strs.isEmpty()){
            return "";
        }

        StringBuilder encoded = new StringBuilder();
        for(int i = 0; i < strs.size(); i++){
            map.put(i, strs.get(i));

            encoded.append(i);
            encoded.append(".");
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {

        if(str.isEmpty()){
            return new ArrayList<>();
        }

        String[] input = str.split("\\.");

        List<String> strs = new ArrayList<>();
        for(String num:input){
            strs.add(map.get(Integer.parseInt(num)));
        }
        return strs;
    }
}