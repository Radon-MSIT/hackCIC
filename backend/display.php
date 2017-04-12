<?php
      $servername = "localhost";
      $username = "id1362768_126ankush";
      $password = "jaimatadi";
      $dbname = "id1362768_cropstock";

      // Create connection
      $conn = new mysqli($servername, $username, $password, $dbname);
      // Check connection
      if ($conn->connect_error) {
          die("Connection failed: " . $conn->connect_error);
      }

      $sql = "SELECT * FROM storagehouse";
    $result = $conn->query($sql);
    echo "storage house" . "&nbsp &nbsp " . "crop" . "&nbsp &nbsp " . "farmer" . "&nbsp &nbsp " . "quantity" . "&nbsp &nbsp " . "harvestdate" . "&nbsp &nbsp " . "expiryd date" ;
    if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
        echo "<br>" .$row["StorageHouse"] . "  " . $row["Crop"] . "  " . $row["Farmer"] . "  " . $row["Quantity"] . "  " . $row["HarvestDate"] . "  " . $row["ExpiryDate"] . "<br>" ;
    }
} else {
    echo "0 results";
}
$conn->close();
?>