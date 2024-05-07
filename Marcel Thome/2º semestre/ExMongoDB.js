use('MovimentacaoProduto');

db.Produto.insertMany([
    { nome: "Produto A", preco: 10, quantidade: 100, fornecedorId: 1 },
    { nome: "Produto B", preco: 20, quantidade: 150, fornecedorId: 2 },
    { nome: "Produto C", preco: 30, quantidade: 200, fornecedorId: 3 },
    { nome: "Produto D", preco: 40, quantidade: 250, fornecedorId: 4 },
    { nome: "Produto E", preco: 50, quantidade: 300, fornecedorId: 5 },
    { nome: "Produto F", preco: 60, quantidade: 350, fornecedorId: 1 },
    { nome: "Produto G", preco: 70, quantidade: 400, fornecedorId: 2 },
    { nome: "Produto H", preco: 80, quantidade: 450, fornecedorId: 3 },
    { nome: "Produto I", preco: 90, quantidade: 500, fornecedorId: 4 },
    { nome: "Produto J", preco: 100, quantidade: 550, fornecedorId: 5 }
])

db.Fornecedor.insertMany([
    { _id: 1, nome: "Fornecedor 1", cidade: "São Paulo" },
    { _id: 2, nome: "Fornecedor 2", cidade: "Rio de Janeiro" },
    { _id: 3, nome: "Fornecedor 3", cidade: "Belo Horizonte" },
    { _id: 4, nome: "Fornecedor 4", cidade: "Porto Alegre" },
    { _id: 5, nome: "Fornecedor 5", cidade: "Recife" },
    { _id: 6, nome: "Fornecedor 6", cidade: "Manaus" },
    { _id: 7, nome: "Fornecedor 7", cidade: "Curitiba" },
    { _id: 8, nome: "Fornecedor 8", cidade: "Fortaleza" },
    { _id: 9, nome: "Fornecedor 9", cidade: "Brasília" },
    { _id: 10, nome: "Fornecedor 10", cidade: "Salvador" }
])


db.Produto.updateMany({ preco: { $gt: 50 } }, { $set: { preco: 60 } })
db.Produto.updateOne({ nome: "Produto A" }, { $inc: { quantidade: 50 } })
db.Produto.updateMany({ quantidade: { $lt: 300 } }, { $mul: { preco: 1.1 } })
db.Fornecedor.updateMany({ cidade: "São Paulo" }, { $set: { cidade: "Campinas" } })
db.Fornecedor.updateMany({}, { $set: { ativo: true } })
db.Fornecedor.updateMany({ ativo: true }, { $set: { ativo: false }, $currentDate: { "lastModified": true } })


db.Produto.deleteOne({ nome: "Produto J" })
db.Produto.deleteMany({ preco: { $lt: 20 } })
db.Fornecedor.deleteOne({ nome: "Fornecedor 10" })
db.Fornecedor.deleteMany({ cidade: "Recife" })

db.Produto.find({ $and: [{ preco: { $gte: 30 } }, { quantidade: { $lte: 300 } }] })
db.Fornecedor.find({ $or: [{ cidade: "São Paulo" }, { cidade: "Rio de Janeiro" }] })

db.Produto.find()
db.Fornecedor.find()