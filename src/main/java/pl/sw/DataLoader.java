package pl.sw;

/*7. Utwórzmy poza pakietem model klasę DataLoader której główna publiczna metoda będzie przyjmować argument typu String ze
ścieżką do pliku a metoda będzie zwracać List<String> zawierającą poszczególne rzędy wczytane z pliku. Obsłużmy wewnątrz klasy
exception związany z nieznalezieniem pliku. Zwracajmy w tym przypadku pustą listę i wydrukujmy do konsoli komunikat o błędzie.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class DataLoader {

    public static List<String> loadFile(String path) {
        List<String> loadedRows = new ArrayList<>();

        try {
            FileReader fr = new FileReader(path);
            BufferedReader bufferReader = new BufferedReader(fr);

            String line;

            while ((line = bufferReader.readLine()) != null) {
                loadedRows.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Błąd! Nie znaleziono pliku " + path);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Błąd! w dostępie do pliku " + path);

        }
        return loadedRows;
    }

    public List<String> loadDataSecond(String path) {
        try {
            return Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}

