from fastapi import FastAPI

app = FastAPI()

clientes = [
    {"id": 1, "nome": "Joseffe", "idade": 34, "email": "joseffe@gmail.com"},
    {"id": 2, "nome": "Natan", "idade": 22, "email": "natan@nates.com"},
    {"id": 3, "nome": "Maria Julia", "idade": 18, "email": "maryjane@gmail.com"},
    {"id": 4, "nome": "Lucas", "idade": 15, "email": "luquinhas@gmail.com"},
    {"id": 5, "nome": "João", "idade": 22, "email": "jonyblade@gmail.com"}
]

@app.get("/home")
def home():
    return "Nossa API está funcionando!"

@app.get("/quantidade")
def quantidadeClientes():
    return "{clientes : " + str(len(clientes)) + "}"

@app.get("/clientes")
def getClientes():
    return clientes

@app.get("/clientes/{idCliente}")
def getClientes(idCliente: int):
    return clientes[idCliente-1]