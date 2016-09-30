#!C:\Perl\bin\perl.exe

use CGI qw( :standard );
print "Content-Type: text/html\n\n";

print "<html> <head>\n";
print "</head>\n";
print "<body>\n";
open FILE, "<", "aa.txt" or die $!;
$lines = <FILE>;
$lines +=1;
print FILE $lines;
close FILE;
print $lines;
print "</body> </html>\n";


