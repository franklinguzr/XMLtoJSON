import org.json.*;
public class Main {
public static void main(String[] arg){
        try{
        JSONObject jsobject = XML.toJSONObject(LabJson.XML_EJEMPLO);
        String jsonPretty = jsobject.toString(LabJson.PRETTY_PRINT_IDENT_FACTOR);
        System.out.print(jsonPretty);
        }catch(JSONException jex){
        System.out.print(jex.toString());
        }
        }
}
