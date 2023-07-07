POST
http://localhost:9095/api/v1/products/product
{
"name":"IPhone 13 Mini",
"description":"Awesome Phone",
"price":1000.0,
"couponCode":"SUPERSALE"
}

GET
http://localhost:9095/api/v1/coupons/coupon/SUPERSALE

O/P:
{
"id": 1,
"code": "SUPERSALE",
"discount": 10.000,
"expDate": "12/12/2023"
}