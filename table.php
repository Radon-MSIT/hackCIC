<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  <meta name="viewport" content="width=device-width, user-scalable=no" />
</head>
<body>
<div class="container">
  <?php
 // list all the table in database
 $result = mysql_query("show tables");
 // show all the field with type, lenght,description of a specific table
 $result = mysql_query("DESCRIBE table_name");
 // show a specific tables row
 $result = mysql_query("SELECT * FROM table_name");
 if (mysql_num_rows($result)>0){
 $r = mysql_fetch_array($result,MYSQL_ASSOC);
 $table="<table><tr>";
 $firstLine="<tr>";
 foreach ($r as $k => $v){
   $table .="<td>".$k."</td>";
   $firstLine .="<td>".$v."</td>";
 }
 $table.="</tr>".$firstLine."</tr>";
 while($r = mysql_fetch_array($result,MYSQL_ASSOC)){
   $table.="<tr>";
   foreach($r as $k => $v)
     $table.="<td>".$v."</td>";
   $table.="</tr>";
 }
  $table .="</table>";
 echo $table;
}
?>
</div>

<hr>
</body>
</html>
