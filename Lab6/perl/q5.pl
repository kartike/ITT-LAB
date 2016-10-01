#!C:\Strawberry\perl\bin\perl.exe

use CGI qw( :standard );
print "Content-Type: text/html\n\n";

print "<html>\n";
print "<body>\n";
($s,$m,$h)=localtime(time);
print "$h:$m:$s \n";
print "</body> </html>\n";
