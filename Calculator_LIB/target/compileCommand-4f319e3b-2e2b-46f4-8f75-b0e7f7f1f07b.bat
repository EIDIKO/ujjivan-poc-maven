CALL C:\PROGRA~1\IBM\ACE\12.0.8.0\server\bin/mqsiprofile
CALL SET MQSI_REGISTRY="C:\Users\tonda\Desktop\NODE\ujjivan-poc-maven\Calculator_LIB\target\tmp-work-dir/config"
CALL mqsicreateworkdir "C:\Users\tonda\Desktop\NODE\ujjivan-poc-maven\Calculator_LIB\target\tmp-work-dir"
CALL SET MQSI_WORKPATH="C:\Users\tonda\Desktop\NODE\ujjivan-poc-maven\Calculator_LIB\target\tmp-work-dir/config"
CALL ibmint package --input-path "C:\Users\tonda\Desktop\NODE\ujjivan-poc-maven\Calculator_LIB\.." --output-bar-file "C:\Users\tonda\Desktop\NODE\ujjivan-poc-maven\Calculator_LIB\target\ace\Calculator_LIB-1.0.0.bar" --project Calculator_LIB --trace "C:\Users\tonda\Desktop\NODE\ujjivan-poc-maven\Calculator_LIB\target\bar-compile-trace.txt" 
