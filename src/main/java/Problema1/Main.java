package Problema1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PerecheNumere> lista = citire();

        for(PerecheNumere p:lista)
            System.out.println(p);

    }

    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/perechi.json");
            mapper.writeValue(file, lista);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    static List<PerecheNumere> citire()
    {
        try {
            File file = new File("src/main/resources/perechi.json");
            ObjectMapper mapper = new ObjectMapper();
            List<PerecheNumere> perechi = mapper.readValue(file, new TypeReference<List<PerecheNumere>>() {});
            return perechi;
        } catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }



}
