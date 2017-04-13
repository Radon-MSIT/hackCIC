<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="css/main.css">
  <meta name="viewport" content="width=device-width, user-scalable=no" />
</head>
<body>
<div class="container">
  <form id="contact" action="newstock.php" method="post">
    <div class="bgimg"><h3 align="center">

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
      $sh = $_POST["sh"];
      $crop = $_POST["crop"];
      $fname = $_POST["fname"];
      $qty = $_POST["qty"];
      $hd = $_POST["hd"];
      $ed = $_POST["ed"];
      $sql = "INSERT INTO storagehouse(StorageHouse, Crop, Farmer, Quantity, HarvestDate, ExpiryDate)
      VALUES ('$sh', '$crop' , '$fname', '$qty', '$hd', '$ed')";

      if ($conn->query($sql) === TRUE) {
          echo "New record created successfully";
      } else {
          echo "Error: " . $sql . "<br>" . $conn->error;
      }

      $conn->close();
      ?>



    </h3>
   </div>

  </form>
</div>

	<p id="container"> hello </p>
</body>
</html>
