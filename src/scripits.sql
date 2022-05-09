CREATE TRIGGER recife 
ON Orders 
FOR INSERT AS
IF (SELECT COUNT(*) FROM INSERTED Orders 
WHERE ShipCity = 'Recife' AND ShipCountry != 'Brazil') > 0
BEGIN 
	PRINT 'Cidade não pertence a esse país'
	ROLLBACK TRANSACTION 
END

GO

--todas os pedidos internacionais enviados para o Brasil, onde  o frete é > 500
CREATE PROC pedidosbrazil AS
SELECT * FROM Orders o
JOIN Customers c ON o.ShipCountry != c.Country 
WHERE c.Country = 'Brazil' AND o.Freight > 500

GO 

CREATE PROC sp AS
SELECT * FROM customers
WHERE country = 'Brazil'