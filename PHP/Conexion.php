<?php
$servername = "server_denuncias";
$username = "postgres"; 
$password = "123";     
$dbname = "postgres poo";


$conn = new mysqli($servername, $username, $password, $dbname);


if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
echo "Connected successfully";
?>

<!DOCTYPE html>
<html>
<head>
    <title>Registro de Demanda - Confirmación</title>
    <link rel="stylesheet" type="text/css" href="estilos.css">
</head>
<body>
    <h1>Demanda Registrada Exitosamente</h1>
    <div class="confirmacion">
        <?php
        // Verificar si se ha enviado el formulario
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            // Mostrar los datos ingresados
            echo "<h2>Datos del Demandante</h2>";
            echo "Nombre: " . $_POST["demandanteNombre"] . "<br>";
            echo "Apellido: " . $_POST["demandanteApellido"] . "<br>";
            echo "DNI: " . $_POST["demandanteDni"] . "<br>";

            echo "<h2>Datos del Demandado</h2>";
            echo "Nombre: " . $_POST["demandadoNombre"] . "<br>";
            echo "Apellido: " . $_POST["demandadoApellido"] . "<br>";
            echo "DNI: " . $_POST["demandadoDni"] . "<br>";

            echo "<h2>Información del Delito</h2>";
            echo "Nombre del Delito: " . $_POST["delitoNombre"] . "<br>";
            echo "Descripción: " . $_POST["delitoDescripcion"] . "<br>";
            echo "Gravedad: " . $_POST["delitoGravedad"] . "<br>";
            echo "Fecha del Delito: " . $_POST["fecha"] . "<br>";
        } else {
            // Si no se ha enviado el formulario, redirigir al formulario de registro
            header("Location: formulario.html");
            exit();
        }
        ?>
    </div>
</body>
</html>


