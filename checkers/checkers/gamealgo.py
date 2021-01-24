import pygame
from .constants import red, white , black , Rows , Cols , blue , cell_size
from .grid import Grid


class Game:
    def __init__(self, win):
        self._init()
        self.win = win

    def update(self):
        self.grid.draw(self.win)
        self.draw_valid_moves(self.valid_moves)
        pygame.display.update()

    def _init(self):
        self.selected = None
        self.grid = Grid()
        self.turn = red
        self.valid_moves = {}

    def winner(self):
        return self.grid.winner()

    def reset(self):
        self._init()

    def select(self, row, col):
        if self.selected:
            result = self.move(row, col)
            if not result:
                self.selected = None
                self.select(row, col)

        piece = self.grid.get_piece(row, col)
        if piece != 0 and piece.color == self.turn:
            self.selected = piece
            self.valid_moves = self.grid.get_valid_moves(piece)
            return True

        return False

    def move(self, row, col):
        piece = self.grid.get_piece(row, col)
        if self.selected and piece == 0 and (row, col) in self.valid_moves:
            self.grid.move(self.selected, row, col)
            skipped = self.valid_moves[(row, col)]
            if skipped:
                self.grid.remove(skipped)
            self.switch_turn()
        else:
            return False

        return True

    def draw_valid_moves(self, moves):
        for move in moves:
            row, col = move
            pygame.draw.circle(self.win, blue,
                               (col * cell_size + cell_size // 2, row * cell_size + cell_size // 2), 15)

    def switch_turn(self):
        self.valid_moves = {}
        if self.turn == red:
            self.turn = white
        else:
            self.turn = red
