<html>
<head>
  <link rel="stylesheet" type="text/css" href="css/disp.css">
  <meta name="viewport" content="width=device-width, user-scalable=no" />
</head>
<body>
  <div class="container">
    <form id="contact">
    <div class="bgimg">
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
    echo "<strong>" . "<pre>" . "Storage House" . "    " . "Crop" . "    " . "Farmer Name" . "    " . "Quantity" . "    " . "Harvest Date" . "    " . "Expiry Date" . "</pre>" . "</strong>" ;
    if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
        echo "<pre>" .$row["StorageHouse"] . " " . $row["Crop"] . " " . $row["Farmer"] . " " . $row["Quantity"] . " " . $row["HarvestDate"] . " " . $row["ExpiryDate"] . "</pre>" ;
    }
} else {
    echo "0 results";
}
$conn->close();
?>
<br>
</div>
</body>
</html>
