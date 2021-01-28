#mahin haider

def printboard(board):
    number =(' 01234567890123456789')
    print(number)
    for i in range(len(number)):
        print('_', end ='')
    print()
    for i in range(len(board)):
        print('|', end = "")
        for j in range(len(board[i])):
            print(board[i][j], end = '')
        print('|', i)
    for i in range(len(number)):
        print('_', end ='')
    print('\n' + number)


board = [[' '] * 20 for i in range(20)]


def addFirstWord(board,word):
    n = len(word)
    m = len(board)
    if n > 20:
        return False
    for i in range(n):
        column = (m // 2 - n // 2) + i
        board[m//2][column] = word[i]
    return True


def checkvertical(board , word , row , col):
    if len(word) > 20 - row:
        return False
    common_letter = False
    for i in range(row, len(word) + row):
        if board[i][col] == ' ' or board[i][col] == word[i - row]:
            common_letter = True
        else:
            common_letter = False
    return common_letter


def addvertical(board , word):
    for w in range(len(word)):
        for y in range(len(board)):
            for x in range(len(board)):
                if board[y][x] == word[w] and checkvertical(board , word , y -w, x):
                    for letter in range(len(word)):
                        board[y + letter - w][x] = word[letter]
                    return True
    print('no match found for', word)
    return False


def checkhorizontal(board, word, row, col):
    if len(word) > 20 - col:
        print(word, 'beyond grid')
        return False
    if col >= 1 and board[row][col - 1] != " ":
        return False
    for i in range(col, len(word) + col):
     if board[row][i] == ' ' or (board[row][i] == word[i - col] and board[row][i - col -1] == ' ' and board[row][i - col + 1] == '  ' ):
        if board[row + 1][i]==' ' and board[row - 1][i] == ' ':
         return True
    return False


def addhorizontal(board, word):
    for w in range(len(word)):
        for row in range(len(board)):
            for col in range(len(board)):
                if board[row][col] == word[w] and checkhorizontal(board , word , row , col - w):
                    print(row, col, word, w)
                    for letter in range(len(word)):
                        board[row][col + letter - w] = word[letter]
                    return True
    print('no match found for', word)
    return False


def crossword(L):
    for i in range(len(L)):
        if i == 0:
            addFirstWord(board, L[i])
            printboard(board)
        if i % 2 == 1:
            addvertical(board , L[i])
            printboard(board)
        if i % 2 == 0  and i != 0:
            addhorizontal(board , L[i])
            printboard(board)


L = ['clowning', 'apple', 'addle', 'incline', 'plan', 'burr']

#crossword(L)
#call these functions separately
crossword(["abcdefghijklmnopqrst",
               "fffffggg",
               "ttttttttttuuuuuuuuuz",
               "yzzz",
               "qqqqqqqqqqqqqqy",
               "xxxxxxxxxaaaaaaa",
               "aaaaggg",
               "xxwwww",
               "wwwwvvvvve",
               "vvvvvvvvvvvvq",
               "mat",
               "mat",
               "make",
               "make",
               "maker",
               "remake",
               "hat",
               ])
