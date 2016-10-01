#!C:\Strawberry\perl\bin\perl.exe

use CGI qw( :standard );
print "Content-Type: text/html\n\n";

print "<html>\n";
print "<body>\n";
print "<h2>Page Views: </h2> \n";
open (FILE, "+>>aa.txt") or die $!;
seek FILE, 0, 0;
@file_contents = <FILE>;
truncate FILE, 0;
$new = @file_contents[0];
$new++;
print FILE $new;
print $new;
close (FILE);
print "</body> </html>\n";
