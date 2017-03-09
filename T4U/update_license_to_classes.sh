#!/bin/bash

#HOW TO USE: give as parameter to this script the path to the folder under which all classes also in sub-directories will have replaced licenses
#keep the __license__body__ and __license__ markers to enable future fast replacement
#if not, update the awk statement

#but use name of subdirectory you want to start with names, without "." in path, otherwise the "find" can get confused
#so for example go with bash ./apply_license.sh FOLDER_NAME, where you assume is ./FOLDER_NAME

function replace_license(){

LICENSE_TEXT="* __license__ = EULA currently in development. Current terms of usage below.
* __license_body__ We grant the right to use this software and create derivative work based on it for all non-commercial non-profit education purposes. 
* __license_body__ 
* __license_body__ For any commercial-related or profit-related usage of this software please contact 
* __license_body__ Hong-Linh Truong truong@dsg.tuwien.ac.at
* __license_body__ 
* __license_body__ Warranty:
* __license_body__ The software is provided \"AS IS\", without warranty of any kind, express or implied,
* __license_body__ including but not limited to the warranties of merchantability, fitness for a
* __license_body__ particular purpose and noninfringement. in no event shall the authors or copyright
* __license_body__ holders be liable for any claim, damages or other liability, whether in an action of
* __license_body__ contract, tort or otherwise, arising from, out of or in connection with the software or
* __license_body__ the use or other dealings in the software."

   file=./$1
   echo "Replacing License in $file"
   #so. if first word on line after * is  __license__, it adds the new content which we have. For all next lines which have as old __license_body__, we ignore them
   #this means we replace the license_body easy with one script next time
   awk -v text="$LICENSE_TEXT" -v file_name=$file"_tmp" '{ if ( match($2,"__license_body__")){next;}else if (match($2,"__license__") ) {print text > file_name }else{print $0 > file_name} fflush(file_name)}' $file 
   rm $file
   mv $file"_tmp" $file
}

#must export function to exec with find
export -f replace_license
 
echo "Searching for files in $1"
find $1 -regextype posix-extended -regex "[./\(\)a-zA-Z0-9 ]*\.java" -exec bash -c 'replace_license {}' \; 


