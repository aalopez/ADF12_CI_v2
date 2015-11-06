# ADF 12.1.3 en Integración Continua (CI)
Demo de un proyecto contruido con ADF 12.1.3 + Maven, que se integra en ambientes de integración continua (por ejemplo con hudson).
Actualmente todos los módulos del proyecto son compilados correctamente por el servidor de integración continua. Entre los módulos se encuentran:
- CommonCodeApp: Código Común (incuye pruebas con JUnit)
- CommonUIApp: UI Común
- CommonModelApp: Modelo Común (Entities, ViewObjects.. Incluye pruebas con JUnit para ADF BC)
- UC001-CountriesListApp: Caso de uso básico que muestra un listado de países del esquema HR
- MasterApp: Aplicación maestra que reune todos los demás módulos
