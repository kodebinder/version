GET
http://localhost:8081/productapi/api/v1/products/

POST
http://localhost:8081/productapi/api/v1/products/
{
"name":"IPhone X",
"description":"Its awesome",
"price": 1000
}

GET
http://localhost:8081/productapi/api/v1/products/1

PUT
http://localhost:8081/productapi/api/v1/products/
{
"id":1,
"name":"IPhone 14",
"description":"It's awesome",
"price": 1000.00
}

DELETE
http://localhost:8081/productapi/api/v1/products/1

Caching : Hazelcast
GET
http://localhost:8081/productapi/api/v1/products/