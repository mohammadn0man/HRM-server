###List of Restful api available on server

![img_1.png](img_1.png)

```json
{
  "info": {
    "_postman_id": "7cbf5dc1-66d6-462a-9080-0df2ff613bf7",
    "name": "HRM Server",
    "schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
  },
  "item": [
    {
      "name": "all employees",
      "request": {
        "method": "GET",
        "header": [],
        "url": {
          "raw": "http://localhost:8082/employees",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8082",
          "path": [
            "employees"
          ]
        }
      },
      "response": []
    },
    {
      "name": "get employee",
      "request": {
        "method": "GET",
        "header": [],
        "url": {
          "raw": "http://localhost:8080/employee/6",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "employee",
            "6"
          ]
        }
      },
      "response": []
    },
    {
      "name": "add employee",
      "request": {
        "method": "POST",
        "header": [],
        "body": {
          "mode": "raw",
          "raw": "{\r\n    \"employeeName\":\"emp2\",\r\n    \"location\":\"upse\",\r\n    \"email\":\"esadf@asdf.com\",\r\n    \"dateOfBirth\":\"10-12-1990\"\r\n}",
          "options": {
            "raw": {
              "language": "json"
            }
          }
        },
        "url": {
          "raw": "http://localhost:8082/addemployee",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8082",
          "path": [
            "addemployee"
          ]
        }
      },
      "response": []
    },
    {
      "name": "remove employee",
      "request": {
        "method": "DELETE",
        "header": [],
        "url": {
          "raw": "http://localhost:8080/removeemployee/2",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "removeemployee",
            "2"
          ]
        }
      },
      "response": []
    },
    {
      "name": "Edit HR cred",
      "request": {
        "method": "PUT",
        "header": [],
        "body": {
          "mode": "raw",
          "raw": "{\r\n    \"userId\": \"user1\",\r\n    \"password\": \"1111\"\r\n}",
          "options": {
            "raw": {
              "language": "json"
            }
          }
        },
        "url": {
          "raw": "http://localhost:8080/edithr/user3",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8080",
          "path": [
            "edithr",
            "user3"
          ]
        }
      },
      "response": []
    },
    {
      "name": "get all hr",
      "request": {
        "method": "GET",
        "header": [],
        "url": {
          "raw": "http://localhost:8082/hr",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8082",
          "path": [
            "hr"
          ]
        }
      },
      "response": []
    },
    {
      "name": "validate login cred",
      "request": {
        "method": "POST",
        "header": [],
        "body": {
          "mode": "raw",
          "raw": "{\r\n        \"userId\": \"user1\",\r\n        \"password\": \"1111\"\r\n    }",
          "options": {
            "raw": {
              "language": "json"
            }
          }
        },
        "url": {
          "raw": "http://localhost:8082/validatehr",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8082",
          "path": [
            "validatehr"
          ]
        }
      },
      "response": []
    },
    {
      "name": "edit employee details",
      "request": {
        "method": "PUT",
        "header": [],
        "body": {
          "mode": "raw",
          "raw": "{\r\n    \"employeeCode\": \"3\",\r\n    \"employeeName\": \"noname\",\r\n    \"location\": \"upse\",\r\n    \"email\": \"esadf@asdf.com\",\r\n    \"dateOfBirth\": \"10-12-1990\"\r\n}",
          "options": {
            "raw": {
              "language": "json"
            }
          }
        },
        "url": {
          "raw": "http://localhost:8082/editemployee/3",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8082",
          "path": [
            "editemployee",
            "3"
          ]
        }
      },
      "response": []
    },
    {
      "name": "edit emp post req",
      "request": {
        "method": "POST",
        "header": [],
        "body": {
          "mode": "raw",
          "raw": "{\r\n    \"employeeCode\": \"3\",\r\n    \"employeeName\": \"noman\",\r\n    \"location\": \"upse\",\r\n    \"email\": \"esadf@asdf.com\",\r\n    \"dateOfBirth\": \"10-12-1990\"\r\n}",
          "options": {
            "raw": {
              "language": "json"
            }
          }
        },
        "url": {
          "raw": "http://localhost:8082/editemp",
          "protocol": "http",
          "host": [
            "localhost"
          ],
          "port": "8082",
          "path": [
            "editemp"
          ]
        }
      },
      "response": []
    }
  ]
}
```