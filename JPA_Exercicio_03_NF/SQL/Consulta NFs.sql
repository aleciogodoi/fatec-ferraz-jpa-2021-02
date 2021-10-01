SELECT
 n.nr,
 n.data,
 c.nome,
 p.nome,
 i.quantidade,
 p.precoUnitario,
 i.totalItem,
 n.total
From
 Nota n 
Inner Join Nota_Item ni On (ni.Nota_NR = n.NR)
Inner Join Cliente c On (c.Id = n.CLIENTE_ID)
Inner Join Item i On (i.id = ni.itens_ID)
Inner Join Produto p ON (p.ID = i.PRODUTO_ID)
Order by NR;
