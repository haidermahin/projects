import pygame
from .constants import red,white,cell_size,grey , black, Crown
class Piece:

    padding = 7
    border = 2

    def __init__(self , row , col , color):
        self.row = row
        self.col = col
        self.color = color
        self.king = False

        self.x = 0
        self.y = 0
        self.find_pos()

    def find_pos(self):
        self.x = (cell_size * self.col) + cell_size //2
        self.y = (cell_size * self.row) + cell_size //2

    def set_king(self):
        self.king = True

    def draw_piece(self, screen):
        radius = cell_size//2 - self.padding
        pygame.draw.circle(screen, self.color, (self.x, self.y), radius)
        if self.king:
            screen.blit(Crown, (self.x - Crown.get_width() //2, self.y - Crown.get_height()//2)) # we use blit to put somethinhg on screen

    def move(self , row , col):
        self.row = row
        self.col = col
        self.find_pos()


