#!/bin/bash



    echo "testttt"
    OUTPUT="$(echo /data.cql:9:NoHostAvailable:  | grep '"*NoHostAvailable"*')"
    echo "${OUTPUT}"

     OUTPUT2="$(echo data.cql 26 true | grep -w 'NoHostAvailable')"
    echo "${OUTPUT2}"



[[ !  -z  ${OUTPUT}  ]] && echo "I am not zero"
[[ -z  ${OUTPUT}  ]]  && echo "I am zero"

    while [[ -n  ${OUTPUT} ]] ; do
       echo "I am while"
    done


