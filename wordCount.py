#!/usr/bin/python
file = open(r"D:\comp280\CISCO\CISCOCHALLENGE\newfile.txt", "r+")
wordcount={}
for word in file.read().split():
    if word not in wordcount:
        wordcount[word] = 1
    else:
        wordcount[word] += 1
for k,v in wordcount.items():
    print (k, v)
