#!C:\Strawberry\perl\bin\perl.exe

use CGI qw( :standard );
print "Content-Type: text/html\n\n";
$name = param("name");             # Get the user's name and assign to variable
@greet = ('Yola, ','Lola, ','Pola, ','Cola, ');     # Get the choice and assign to variable
print "<html>\n";
print "<body>\n";
print $greet[int(rand(3))];
print $name;
print "</body> </html>\n";
