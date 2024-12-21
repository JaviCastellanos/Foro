@echo off

:: Navegar al directorio del proyecto
cd /d "C:\Users\jc_68\Downloads\ALURA\ENTREGABLE 3\foro-hub"
pause

:: Limpiar compilaciones previas (opcional)
echo Limpiando compilaciones previas...
mvn clean
pause

:: Compilar el proyecto
echo Compilando el proyecto...
mvn install
if errorlevel 1 (
    echo Error en la compilación.
    pause
    exit /b 1
)
pause

:: Ejecutar el proyecto
echo Ejecutando el proyecto...
mvn spring-boot:run
pause

:: Mantener la ventana abierta
cmd /k