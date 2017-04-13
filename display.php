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
    echo "<h4>" . "<strong>" . "<pre>" . "Storage House" . "\t" . "Crop" . "\t" . "Farmer Name" . "\t" . "Quantity" . "\t" . "Harvest Date" . "\t" . "Expiry Date" . "</spre>" . "</strong>" . "</h4>" . "<br>" . "<hr>" . "<br>" ;
    if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
        echo "<p>" . "<pre>" .$row["StorageHouse"] . "\t" . $row["Crop"] . "\t" . $row["Farmer"] . "\t\t" . $row["Quantity"] . "\t" ;
        echo "\t" . $row["HarvestDate"] . "\t" . $row["ExpiryDate"] . "</pre>" . "</p>" ;
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
