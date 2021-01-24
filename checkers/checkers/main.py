import pygame
from checkers.constants import Width, Height, cell_size , black , grey
from checkers.gamealgo import Game

FPS = 60
screen = pygame.display.set_mode((Width, Height))
pygame.display.set_caption("Checkers Tutorial")


def get_row_col_frommouse(pos):
    x , y = pos
    row = y // cell_size
    col = x // cell_size
    return row , col



def main_event():
    bool = True
    clock = pygame.time.Clock()
    game = Game(screen)

    while bool:
        clock.tick(FPS)

        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                bool = False

            if event.type == pygame.MOUSEBUTTONDOWN:
                position = pygame.mouse.get_pos()
                row, col = get_row_col_frommouse(position)
                game.select(row, col)





        game.update()





    pygame.quit()

main_event()