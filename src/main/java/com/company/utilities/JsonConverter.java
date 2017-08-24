package com.company.utilities;
import com.google.gson.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class JsonConverter {
    private static final Gson gson = new GsonBuilder()
            .create();
    public  <T>     T                           getDeserializedClass             (Class<T>resultClass,   String jsonBody){
        return gson.fromJson(jsonBody,resultClass);
    }
    public  <T> List<T> getDeserializedListOfClass                               (Class<T>resultClass,    String jsonBody){
        JsonParser jsonParser = new JsonParser();
        JsonArray jsonArray = jsonParser.parse(jsonBody).getAsJsonArray();
        List<T> objs = new ArrayList<T>();
        for (JsonElement jsonElement:jsonArray) {
            objs.add(gson.fromJson( jsonElement.toString(), resultClass));
        }
        return objs;
    }
    public String getJsonFromFile(String file) {

        try {
            return Util.inputStreamToString(new FileInputStream(new File(file).getAbsoluteFile()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    public <T> String getJsonFromClass                                           (Class <T> resultClass, Object object){
        return gson.toJson(object,resultClass);
    }
}
