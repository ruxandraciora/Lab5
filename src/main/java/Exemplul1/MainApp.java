package Exemplul1;
import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
public class MainApp {
    public static void scriere(List<exemplul1.Persoana> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/persoane.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<exemplul1.Persoana> citire() {
        try {
            File file=new File("src/main/resources/persoane.json");
            ObjectMapper mapper=new ObjectMapper();
            List<exemplul1.Persoana> persoane = mapper
                    .readValue(file, new TypeReference<List<exemplul1.Persoana>>(){});
            return persoane;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        List<exemplul1.Persoana> persoane=citire();
        System.out.println(persoane);
        for(exemplul1.Persoana p:persoane){
            System.out.println(p);
        }
        persoane.add(new exemplul1.Persoana("Maria",33));
        scriere(persoane);
    }
}