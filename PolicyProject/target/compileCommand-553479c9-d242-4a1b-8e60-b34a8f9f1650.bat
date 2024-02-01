CALL C:\PROGRA~1\IBM\ACE\12.0.8.0\server\bin/mqsiprofile
CALL SET MQSI_REGISTRY="C:\Users\tonda\Downloads\ace-maven-plugin-main\ace-maven-plugin-main\samples\SumAPI\PolicyProject\target\tmp-work-dir/config"
CALL mqsicreateworkdir "C:\Users\tonda\Downloads\ace-maven-plugin-main\ace-maven-plugin-main\samples\SumAPI\PolicyProject\target\tmp-work-dir"
CALL SET MQSI_WORKPATH="C:\Users\tonda\Downloads\ace-maven-plugin-main\ace-maven-plugin-main\samples\SumAPI\PolicyProject\target\tmp-work-dir/config"
CALL ibmint package --input-path "C:\Users\tonda\Downloads\ace-maven-plugin-main\ace-maven-plugin-main\samples\SumAPI\PolicyProject\.." --output-bar-file "C:\Users\tonda\Downloads\ace-maven-plugin-main\ace-maven-plugin-main\samples\SumAPI\PolicyProject\target\ace\PolicyProject-1.0.0.bar" --project PolicyProject --trace "C:\Users\tonda\Downloads\ace-maven-plugin-main\ace-maven-plugin-main\samples\SumAPI\PolicyProject\target\bar-compile-trace.txt" 
