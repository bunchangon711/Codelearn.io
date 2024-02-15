def amendTheSentence(s):
    sentenceSplit = [*s]
    i = 0
    while i < len(sentenceSplit):
        if str(sentenceSplit[i]).isupper():
            sentenceSplit[i] = str(sentenceSplit[i]).lower()
            if i != 0:
                sentenceSplit.insert(i, ' ')
        i += 1
    s = "".join(sentenceSplit)
    return str(s)

sentence = input()
print(amendTheSentence(sentence))