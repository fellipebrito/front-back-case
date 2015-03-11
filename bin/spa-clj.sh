#!/bin/bash
cd back-clj
nohup lein ring server-headless 8080  >/dev/null 2>&1 &
cd ../front-spa
unicorn -p 3000 -D
cd ..
