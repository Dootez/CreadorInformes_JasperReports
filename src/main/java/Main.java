

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import java.io.InputStream;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            // 1. Cargar datos
            List<Alumno> alumnos = CsvLoader.cargarAlumnos();

            // 2. Cargar JRXML
            InputStream jrxml =
                    Main.class.getResourceAsStream("/alumnos.jrxml");

            JasperReport report =
                    JasperCompileManager.compileReport(jrxml);

            // 3. DataSource
            JRBeanCollectionDataSource dataSource =
                    new JRBeanCollectionDataSource(alumnos);

            // 4. Generar informe
            JasperPrint print =
                    JasperFillManager.fillReport(report, null, dataSource);

            // 5. Mostrar
            JasperViewer.viewReport(print, false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
