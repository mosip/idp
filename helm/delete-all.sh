#!/bin/bash

# deletes Idp services in correct order
## Usage: ./delete-all.sh [kubeconfig]

if [ $# -ge 1 ] ; then
  export KUBECONFIG=$1
fi

ROOT_DIR=`pwd`

declare -a module=("redis"
                   "idp"
                   )

echo Installing IDP services

for i in "${module[@]}"
do
  cd $ROOT_DIR/"$i"
  ./delete.sh
done

echo All IDP services deleted sucessfully.
