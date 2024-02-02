CALL C:\PROGRA~1\IBM\ACE\12.0.8.0\server\bin/mqsiprofile
CALL SET MQSI_REGISTRY="C:\Users\tonda\Desktop\NODE\ujjivan-poc-maven\Sum_API\target\tmp-work-dir/config"
CALL mqsicreateworkdir "C:\Users\tonda\Desktop\NODE\ujjivan-poc-maven\Sum_API\target\tmp-work-dir"
CALL SET MQSI_WORKPATH="C:\Users\tonda\Desktop\NODE\ujjivan-poc-maven\Sum_API\target\tmp-work-dir/config"
CALL ibmint package --input-path "C:\Users\tonda\Desktop\NODE\ujjivan-poc-maven\Sum_API\.." --output-bar-file "C:\Users\tonda\Desktop\NODE\ujjivan-poc-maven\Sum_API\target\ace\Sum_API-1.0.0.bar" --project Sum_API --trace "C:\Users\tonda\Desktop\NODE\ujjivan-poc-maven\Sum_API\target\bar-compile-trace.txt" 
