#!C:\Strawberry\perl\bin\perl.exe

use CGI qw( :standard );
print "Content-Type: text/html\n\n";
foreach (sort %ENV){
print "<b>$_</b>:$ENV{$_}<br>\n";
}
