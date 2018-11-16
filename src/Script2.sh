#!/bin/bash

touch log2.txt
echo "Delete old log? [n/Y]"
read input
if [ "$input" == "Y" ]
then
who > log2.txt
else
who >> log2.txt
fi
ip addr show >> log2.txt
