def isograma(cadena):
    cadena = cadena.lower()
    encontradas = set()
    for letra in cadena:
        if letra == ' ':
            continue
        if letra in encontradas:
            return False
        else:
            encontradas.add(letra)
    return True

def isograma(cadena):
    cadena = cadena.lower()
    for i in range(len(cadena)):
        letra = cadena[i]
        if letra == ' ':
            continue
        if letra in cadena[i + 1:]:
            return False
    return True

print(isograma(cadena='camino'))
print(isograma('manolo'))
print(isograma('Ricardo'))
print(isograma('a b c'))