#!C:\Perl\bin\perl.exe

use CGI qw( :standard );
print "Content-Type: text/html\n\n";
$name = param("name");             # Get the user's name and assign to variable
$preference = param("choice");     # Get the choice and assign to variable
print "<html> <head>\n";
print "<title>Hello, world!</title>";
print "</head>\n";
print "<body>\n";
print "<h1>Hello, world! </h1>\n";
print $name;
print $preference;
foreach (sort %ENV){
print "<b>$_</b>:$ENV{$_}<br>\n";
}
print "</body> </html>\n";
