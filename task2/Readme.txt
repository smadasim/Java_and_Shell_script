Manual
======

1. Download the files from github

2. unzip task2.zip into any directory
	$ unzip task2.zip

3. ensure replaceTokens.sh under ./task2/scripts directory is given proper permission
	$ cd task2/scripts
	$ chmod 755 replaceTokens.sh

4. run the script with the below command under ./task2/scripts directory
	$ ./replaceTokens.sh ../input/index.html ../conf/test.properties ../ouput/index.html

5. verify the output file 
	$ cat ../output/index.html	 	
