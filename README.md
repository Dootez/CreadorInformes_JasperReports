# 📄 CreadorInformes_JasperReports

Proyecto Java para la **creación de informes profesionales con JasperReports**, cargando datos desde archivos CSV y generando informes visualmente cuidados.

Desarrollado como parte de la asignatura **Diseño de Interfaces**, pero estructurado con buenas prácticas para uso real.

---

## 🚀 Características

- 📊 Carga de datos desde archivos **CSV**
- 🧠 Uso de **POJOs** (modelo Alumno)
- 🎨 Diseño de informes con **JasperReports (JRXML)**
- 📅 Fecha automática en el informe
- 📄 Estilo visual mejorado:
  - Cabecera clara
  - Encabezados destacados
  - Filas alternas (zebra)
  - Márgenes y tipografía cuidada
- 📁 Exportación sencilla a **PDF**

---

## 🛠️ Tecnologías usadas

- **Java**
- **Maven**
- **JasperReports**
- **Apache Commons CSV**
- **IntelliJ IDEA**

---

## 📂 Estructura del proyecto
```
CreadorInformes_JasperReports/
├── src/
│ └── main/
│ ├── java/
│ │ └── com.escuela/
│ │ ├── Alumno.java
│ │ └── Main.java
│ └── resources/
│ ├── alumnos.csv
│ └── alumnos.jrxml
├── pom.xml
└── README.md
```

---

## 📄 Funcionamiento

1. Se cargan los datos del archivo `alumnos.csv`
2. Se transforman en una lista de objetos `Alumno`
3. JasperReports usa esa lista como `JRBeanCollectionDataSource`
4. Se compila el archivo `JRXML`
5. Se genera el informe final (PDF o visor)

---

## ▶️ Ejecución

1. Clona el repositorio:
```bash
git clone https://github.com/Dootez/CreadorInformes_JasperReports.git
```
2. Abre el proyecto en IntelliJ IDEA
3. Ejecuta la clase Main
4. El informe se genera automáticamente 🎉

---
## 👤 Autor

Dootez -> 
Estudiante de Desarrollo de Aplicaciones Multiplataforma
