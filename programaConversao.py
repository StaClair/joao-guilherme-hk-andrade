def apresentacao():
    msg = "Bem-vinda ao programa de conversão"
    print("{}{:^40}{}".format(cor['purple'], ' ❀ ' * 15, cor['reset']))
    print("{}{:^45}{}".format(cor['cyan'], msg, cor['reset']))
    print("{}{:^40}{}".format(cor['purple'], ' ❀ ' * 15, cor['reset']))


def main():
    while True:

        option = int(input(f"{cor['green']}Escolha a operação desejada:{cor['reset']}\n"
                          f"{cor['yellow']}[1] - DECIMAL ➡︎ BINÁRIO{cor['reset']}\n"
                          f"{cor['blue']}[2] - BINÁRIO ➡︎ DECIMAL{cor['reset']}\n"
                          f"{cor['yellow']}[3] - DECIMAL ➡︎ HEXADECIMAL{cor['reset']}\n"
                          f"{cor['blue']}[4] - HEXADECIMAL ➡︎ DECIMAL{ cor['reset']}\n"
                          f"{cor['yellow']}[0] - Terminar o programa{cor['reset']}\n" 
                          f"{cor['cyan']}Opção ➡︎ {cor['reset']}"))
        if option == 0:
            print(f"{cor['purple']}Programa finalizado!{cor['reset']} Até mais,{cor['reset']} {cor['blue']}Bibizela!{cor['reset']}\n"
                  f"{cor['red']}Vai dar tudo certo!{cor['reset']}")
            break

        if not switch_case(option):
            # return option
            print("Por favor, tente novamente!")


def switch_case(option):
    match option:
        case 1:
            # DECIMAL PARA BINÁRIO
            num_dec_bin = int(input("Informe um nº DECIMAL: "))
            print(f"O binário correspondente é {cor['blue']} ➡︎ {bin(num_dec_bin)[2:]} ⬅︎ {cor['reset']}")
            print("")
            return True     # Opção válida! Sair do loop!

        case 2:
            # BINÁRIO PARA DECIMAL
            num_bin_dec = input("Informe um nº BINÁRIO: ")
            print(f"O Decimal correspondente é {cor['blue']} ➡︎ {int(num_bin_dec, 2)} ⬅︎ {cor['reset']}")
            print("")
            return True     # Opção válida! Sair do loop!

        case 3:
            # DECIMAL PARA HEXADECIMAL
            num_dec_hex = int(input("Informe um nº DECIMAL ➡︎ HEXADECIMAL: "))
            print(f"O Hexadecimal correspondente é {cor["blue"]} ➡︎ {hex(num_dec_hex)[2:]} ⬅︎ {cor['reset']}")
            print("")
            return True     # Opção válida! Sair do loop!

        case 4:
            # HEXADECIMAL PARA DECIMAL
            num_hex_dec = input("Informe um nº HEXADECIMAL: ")
            print(f"O Decimal correspondente é {cor['blue']} ➡︎ {int(num_hex_dec, 16)} ⬅︎ {cor['reset']}")
            print("")
            return True     # Opção válida! Sair do loop!

        case _:
            print("Opção inválida! Por favor, tente novamente, BIELA!")
            print("")
            return False   # Opção inválida! Continuar o loop!


# Dicionário de cores
cor = {"red": "\033[31m",
       "green": "\033[32m",
       "yellow": "\033[33m",
       "blue": "\033[34m",
       "purple": "\033[35m",
       "cyan": "\033[36m",
       "white": "\033[37m",
       "reset": "\033[0m"}

if __name__ == "__main__":
    apresentacao()
    main()


