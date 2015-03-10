#!/bin/bash
cd back
unicorn -D
cd ../front
unicorn -p 3000 -D
cd ..
