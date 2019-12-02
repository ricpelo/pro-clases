def pasa_pasa(numeros):
    ultimo = numeros[0] % 10
    numeros[0] = int(numeros[0] / 10)
    numeros[1] = numeros[1] * 10 + ultimo

def invierte(numeros):
    while numeros[0] != 0:
        print(numeros)
        pasa_pasa(numeros)
    print(numeros)
