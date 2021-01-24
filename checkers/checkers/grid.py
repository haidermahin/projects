import pygame
from .constants import black, white, red, blue, Cols, Rows, cell_size, grey
from .piece import Piece

class Grid:
    def __init__(self):
        self.grid = []
        self.red_left = self.white_left = 12
        self.red_kings = self.white_kings = 0
        self.make_board()

    def draw_squares(self, win):
        win.fill(grey)
        for row in range(Rows):
            for col in range(row % 2, Cols, 2):
                pygame.draw.rect(win, black, (row * cell_size, col * cell_size, cell_size, cell_size))

    def move(self, piece, row, col):
        self.grid[piece.row][piece.col], self.grid[row][col] = self.grid[row][col], self.grid[piece.row][piece.col]
        piece.move(row, col)

        if row == Rows - 1 or row == 0:
            piece.set_king()
            if piece.color == white:
                self.white_kings += 1
            else:
                self.red_kings += 1

    def get_piece(self, row, col):
        return self.grid[row][col]

    def make_board(self):
        for row in range(Rows):
            self.grid.append([])
            for col in range(Cols):
                if col % 2 == ((row + 1) % 2):
                    if row < 3:
                        self.grid[row].append(Piece(row, col, white))
                    elif row > 4:
                        self.grid[row].append(Piece(row, col, red))
                    else:
                        self.grid[row].append(0)
                else:
                    self.grid[row].append(0)

    def draw(self, win):
        self.draw_squares(win)
        for row in range(Rows):
            for col in range(Cols):
                piece = self.grid[row][col]
                if piece != 0:
                    piece.draw_piece(win)

    def remove(self, pieces):
        for piece in pieces:
            self.grid[piece.row][piece.col] = 0
            if piece != 0:
                if piece.color == red:
                    self.red_left -= 1
                else:
                    self.white_left -= 1

    def winner(self):
        if self.red_left <= 0:
            return white
        elif self.white_left <= 0:
            return red

        return None

    def get_valid_moves(self, piece):
        moves = {}
        left = piece.col - 1
        right = piece.col + 1
        row = piece.row

        if piece.color == red or piece.king:
            moves.update(self._traverse_left(row - 1, max(row - 3, -1), -1, piece.color, left))
            moves.update(self._traverse_right(row - 1, max(row - 3, -1), -1, piece.color, right))
        if piece.color == white or piece.king:
            moves.update(self._traverse_left(row + 1, min(row + 3, Rows), 1, piece.color, left))
            moves.update(self._traverse_right(row + 1, min(row + 3, Rows), 1, piece.color, right))

        return moves

    def _traverse_left(self, start, stop, step, color, left, skipped=[]):
        moves = {}
        last = []
        for r in range(start, stop, step):
            if left < 0:
                break

            current = self.grid[r][left]
            if current == 0:
                if skipped and not last:
                    break
                elif skipped:
                    moves[(r, left)] = last + skipped
                else:
                    moves[(r, left)] = last

                if last:
                    if step == -1:
                        row = max(r - 3, 0)
                    else:
                        row = min(r + 3, Rows)
                    moves.update(self._traverse_left(r + step, row, step, color, left - 1, skipped=last))
                    moves.update(self._traverse_right(r + step, row, step, color, left + 1, skipped=last))
                break
            elif current.color == color:
                break
            else:
                last = [current]

            left -= 1

        return moves

    def _traverse_right(self, start, stop, step, color, right, skipped=[]):
        moves = {}
        last = []
        for r in range(start, stop, step):
            if right >= Cols:
                break

            current = self.grid[r][right]
            if current == 0:
                if skipped and not last:
                    break
                elif skipped:
                    moves[(r, right)] = last + skipped
                else:
                    moves[(r, right)] = last

                if last:
                    if step == -1:
                        row = max(r - 3, 0)
                    else:
                        row = min(r + 3, Rows)
                    moves.update(self._traverse_left(r + step, row, step, color, right - 1, skipped=last))
                    moves.update(self._traverse_right(r + step, row, step, color, right + 1, skipped=last))
                break
            elif current.color == color:
                break
            else:
                last = [current]

            right += 1

        return moves