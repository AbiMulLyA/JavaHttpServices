package repository.generates;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.List;

public class PrettyPrintJson {
    private static PrettyPrintJson prettyPrintJson;
    public static PrettyPrintJson instance(){
        if(prettyPrintJson == null) prettyPrintJson = new PrettyPrintJson();
        return prettyPrintJson;
    }
    public static String prettyPrint(String data){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(data);
        return gson.toJson(je);
    }
}
