# HospitalApp

To add patient:
 API:http://localhost:8080/hospital/patients
 method:post
 Request format:
 {
  "patients": [{
    "name": "Ram",
    "age": 23,
    "weight": 65,
    "height": 167
  },
    {
      "name": "Shyam",
      "age": 28,
      "weight": 82,
      "height": 174
    },
    {
      "name": "John",
      "age": 33,
      "weight": 55,
      "height": 160
    },
    {
      "name": "Bob",
      "age": 41,
      "weight": 90,
      "height": 172
    }
  ]
}
Repsonse: JSON

API:http://localhost:8080/hospital/patients
method:post
response: JSON
