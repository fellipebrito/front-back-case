#!/bin/bash
cd back
unicorn -D
cd ../front-spa
unicorn -p 3000 -D
cd ..
