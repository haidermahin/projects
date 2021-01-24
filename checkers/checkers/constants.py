import pygame

Width, Height = 800, 800
Rows, Cols = 8, 8
cell_size = Width//Cols

# defining some colours
red = (255 , 0 , 0)
white = (255 , 255 , 255)
black = (0 , 0 , 0)
blue = (0, 0 , 255)
grey = (128, 128 , 128)
Crown = pygame.transform.scale(pygame.image.load('resources/crown.png'), (45,25))

