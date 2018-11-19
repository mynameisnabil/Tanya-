<?php
include "koneksi.php";
$sql = "SELECT * FROM siswa";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
        echo "id: " . $row["id"]. " - Name: " . $row["nama_siswa"]. " " . $row["umur"]. "<br>";
    }
} else {
    echo "0 results";
}
?>