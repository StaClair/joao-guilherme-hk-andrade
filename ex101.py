# Exercício 101 - Funções para Votação
# Crie um programa que tenha uma função chamada voto() que vai receber como parâmetro o ano de nascimento de uma pessoa, retornando um valor literal indicando se uma pessoa tem voto NEGADO, OPCIONAL e OBRIGATÓRIO nas eleições.
from datetime import datetime


def voto(ano):
    idade = datetime.today().year - ano
    if idade < 16:
        return "NÃO VOTA"
    elif 16 <= idade < 18 or idade > 65:
        return "VOTO OPCIONAL"
    else:        
        return "VOTO OBRIGATÓRIO"


ano = int(input("Em que ano você nasceu? "))
print(f"Com {datetime.today().year - ano}: {voto(ano)}")
