#!/bin/bash
ps aux | grep 'unicorn' | awk '{print $2}' | xargs sudo kill -9
