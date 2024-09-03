# Exeercício 096 - Função que calcula a área
# Faça um programa que tenha uma função chamada área(), que receba as dimensões de um terreno retangular (largura e comprimento) e mostre a área do terren
from time import sleep


def area(a, b):
    print(f"Sendo o lado 1 = {a} e lado 2 = {b}", end="")
    sleep(1)
    print(".", end="")
    sleep(1)
    print(".", end="")
    sleep(1)
    print(".", end=" ")
    sleep(1)
    area = a * b
    print(f"A área é {area}.")


# Programa Princiapl
print(f"{"CÁLCULO DA ÁREA":^40}")
a = int(input(f"{"Digite o valor do 1º lado: ":^40}"))
b = int(input(f"{"Digite o valor do 2º lado: ":^40}"))
print(f"{".":.^40}")
area(a, b)
