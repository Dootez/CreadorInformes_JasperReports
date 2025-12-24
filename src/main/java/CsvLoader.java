

import org.apache.commons.csv.*;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvLoader {

    public static List<Alumno> cargarAlumnos() throws Exception {

        List<Alumno> alumnos = new ArrayList<>();

        CSVParser parser = CSVFormat.DEFAULT
                .withFirstRecordAsHeader()
                .parse(new InputStreamReader(
                        CsvLoader.class.getResourceAsStream("/alumnos.csv")
                ));

        for (CSVRecord record : parser) {
            Alumno alumno = new Alumno(
                    Integer.parseInt(record.get("Id")),
                    record.get("Nombre"),
                    record.get("Apellidos"),
                    Integer.parseInt(record.get("AñoNacimiento")),
                    record.get("Direccion"),
                    record.get("Curso"),
                    record.get("Tutor")
            );
            alumnos.add(alumno);
        }

        return alumnos;
    }
}
