POST
http://localhost:9095/api/v1/coupons/coupon
{
"code":"SUPERSALE",
"discount":10.0,
"expDate":"12/12/2023"
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