http://localhost:8081/api/v1/users/user
{
    "name":null,
    "email":"",
    "mobile":"",
    "gender":"",
    "age":100,
    "nationality":""
}

O/P:
{
    "nationality": "must not be blank",
    "gender": "must not be blank",
    "name": "name cannot be null",
    "mobile": "mobile number is invalid. should be 10 digit maximum",
    "email": "email size should be between 10 and 50",
    "age": "must be less than or equal to 60"
}

http://localhost:8081/api/v1/users/user
{
    "name":"Pushkar Chauhan",
    "email":"pushkarchauhan91@gmail.com",
    "mobile":"6362660412",
    "gender":"Male",
    "age":31,
    "nationality":"Indian"
}

O/P:
{
    "userId": 1,
    "name": "Pushkar Chauhan",
    "email": "pushkarchauhan91@gmail.com",
    "mobile": "6362660412",
    "gender": "Male",
    "age": 31,
    "nationality": "Indian"
}

{
    "name":"Sachin Tendulkar",
    "email":"schin@gmail.com",
    "mobile":"9826396465",
    "gender":"Male",
    "age":45,
    "nationality":"Indian"
}

{
    "userId": 2,
    "name": "Sachin Tendulkar",
    "email": "schin@gmail.com",
    "mobile": "9826396465",
    "gender": "Male",
    "age": 45,
    "nationality": "Indian"
}
http://localhost:8081/h2-console/

GET
http://localhost:8081/api/v1/users