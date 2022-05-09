package com.daMyx.app.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DB
{
    public Object load_intial_audio_file(){
        JSONParser jsonParser = new JSONParser();
        Object obj = 0;
        String initial_audio = "src/main/resources/initial_audio.json";
        try (FileReader reader = new FileReader(initial_audio))
        {
            obj = jsonParser.parse(reader);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return obj;
    }
}