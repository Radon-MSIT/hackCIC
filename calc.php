<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="css/main.css">
  <meta name="viewport" content="width=device-width, user-scalable=no" />
</head>
<body>
<div class="container">
  <form id="contact" action="newstock.php" method="post">
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

$cr = $_POST["crop"];
$qt = $_POST["qty"];
$ar = $_POST["area"];

$sql = "SELECT * FROM costcalc WHERE cropname = '$cr'" ;
$result = $conn->query($sql);
if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()){
        $ab=$row["pesta"];
        $bb=$row["insta"];
        $cb=$row["ferta"];
        $db=$row["seeda"];
     }
} else {
    echo "0 results";
}

echo "<h2>" . "Billing" . "</h2>";
echo "<br>";
echo "<strong>" . "<pre>" . "Domain" . "\t\t" . "Rate" . "\t" . "Quantity" . "  " . "Expenditure" . "</pre>" . "</strong>";
echo "<pre>" . "Pesticides" . "\t" . $ab . "\t" . $ar . "\t  " . ($ab*$ar) . "</pre>";
echo "<pre>" . "Insecticides" . "\t" . $bb . "\t" . $ar . "\t  " . ($bb*$ar) . "</pre>";
echo "<pre>" . "Fertilizers" . "\t" . $cb . "\t" . $ar . "\t  " . ($cb*$ar) . "</pre>";
echo "<pre>" . "Seeds \t" . "\t" . $db . "\t" . $qt . "\t  " . ($db*$ar) . "</pre>";
echo "<br>";
echo "--------------------------------------------------------------------------";
echo "<pre>" . "<br>" . "Total" . "\t\t\t" . "</pre>" ;
echo ($ab*$ar) + ($bb*$ar) + ($cb*$ar) + ($db*$qt);
$conn->close();
?>
</div>

</form>
</div>

<p id="container"> hello </p>
</body>
</html>
