from pydantic import BaseModel

class Altor(BaseModel):
    id: int
    nome: str
    email: str
    telefone: str
    bio: str