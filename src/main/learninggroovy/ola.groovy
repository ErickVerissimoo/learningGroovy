static main(args) {
    println ola()
    erick =new  pessoa()
    erick.nome = "erickk"
    println erick.nome
    objetos = [5, 1 , 21, 11]
    for(element in objetos)
    println element
}

def ola()
{
    return "ola mundoo"
}

class pessoa{
    def nome
}