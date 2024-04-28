<!DOCTYPE html>
<html>
<head>
    <title>Crear nueva denuncia</title>
</head>
<body>

<form action="insertar.php" method="post">
    <label for="tipo_denuncia">Tipo de denuncia:</label><br>
    <input type="text" id="tipo_denuncia" name="tipo_denuncia"><br>
    <label for="descripcion">Descripción:</label><br>
    <textarea id="descripcion" name="descripcion"></textarea><br><br>
    <label for="fecha">Fecha:</label><br>
    <input type="text" id="fecha" name="fecha"><br>
    <label for="encargado_denuncia">Encargado de denuncia:</label><br>
    <input type="text" id="encargado_denuncia" name="encargado_denuncia"><br>
    <label for="codigo">Código:</label><br>
    <input type="text" id="codigo" name="codigo"><br>
    <input type="submit" value="Guardar">
</form>

<form action="insertar.php" method="post">
    <label for="nombre_denunciante">Nombre:</label><br>
    <input type="text" id="nombre_denunciante" name="nombre_denunciante"><br>
    <label for="identidad">Identidad:</label><br>
    <textarea id="identidad" name="identidad"></textarea><br><br>
    <label for="telefono">Teléfono:</label><br>
    <textarea id="telefono" name="telefono"></textarea><br><br>
    <label for="domicilio">Domicilio:</label><br>
    <textarea id="domicilio" name="domicilio"></textarea><br><br>
    <label for="sexo">Sexo:</label><br>
    <textarea id="sexo" name="sexo"></textarea><br><br>
    <input type="submit" value="Guardar">
</form>

<form action="insertar.php" method="post">
    <label for="nombre_denunciado">Nombre:</label><br>
    <input type="text" id="nombre_denunciado" name="nombre_denunciado"><br>
    <label for="domicilio_denunciado">Domicilio:</label><br>
    <textarea id="domicilio_denunciado" name="domicilio_denunciado"></textarea><br><br>
    <label for="sexo_denunciado">Sexo:</label><br>
    <textarea id="sexo_denunciado" name="sexo_denunciado"></textarea><br><br>
    <input type="submit" value="Guardar">
</form>

<form action="insertar.php" method="post">
    <label for="nombre_evidencia">Nombre:</label><br>
    <input type="text" id="nombre_evidencia" name="nombre_evidencia"><br>
    <label for="identidad_evidencia">Identidad:</label><br>
    <textarea id="identidad_evidencia" name="identidad_evidencia"></textarea><br><br>
    <label for="telefono_evidencia">Teléfono:</label><br>
    <textarea id="telefono_evidencia" name="telefono_evidencia"></textarea><br><br>
    <label for="domicilio_evidencia">Domicilio:</label><br>
    <textarea id="domicilio_evidencia" name="domicilio_evidencia"></textarea><br><br>
    <label for="sexo_evidencia">Sexo:</label><br>
    <textarea id="sexo_evidencia" name="sexo_evidencia"></textarea><br><br>
    <input type="submit" value="Guardar">
</form>

<?php
// Datos de conexión a la base de datos
$host = 'localhost';
$dbname = 'postgres poo';
$username = 'postgres';
$password = '123';

try {
    $pdo = new PDO("pgsql:host=$host;dbname=$dbname", $username, $password);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

    // Obtener los datos del formulario y realizar la inserción en la base de datos
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $stmt = $pdo->prepare("INSERT INTO tabla (tipo_de_denuncia, descripcion, fecha, encargado_de_denuncia, codigo) 
                               VALUES (:tipo_de_denuncia, :descripcion, :fecha, :encargado_de_denuncia, :codigo)");
        $stmt->bindParam(':tipo_de_denuncia', $_POST['tipo_denuncia']);
        $stmt->bindParam(':descripcion', $_POST['descripcion']);
        $stmt->bindParam(':fecha', $_POST['fecha']);
        $stmt->bindParam(':encargado_de_denuncia', $_POST['encargado_denuncia']);
        $stmt->bindParam(':codigo', $_POST['codigo']);
        $stmt->execute();

        echo "Datos insertados correctamente.";
    }
} catch(PDOException $e) {
    echo "Error al insertar los datos: " . $e->getMessage();
}
?>
</body>
</html>
