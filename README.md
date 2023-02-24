# Phonebook-System
This application performs CRUD functionality, it creates a new contact, fetch all created contacts from the database, get a contact by id and deletes a contacts by id. It also runs on docker.

**Technologies used**
- Kotlin
- Springboot
- Gradle
- Docker
- H2 Database
- IntelliJ IDEA

**To run this application as a docker container**
- Use the docker pull command to download the phonebook-system image from Docker Hub.

"docker pull phonebook-system"

- Use the docker run command to start a container from the phonebook-system image.

"docker run -p 8000:9090 phonebook-system"
 

**Test API on postman** : Once the container is running, you can access the Spring Boot application inside the container
 
 
 **Endpoints**
- Create contact: Post - localhost:8000/contacts
- Fetch all contacts: Get - localhost:8000/contacts
- Get contact by id: Get - localhost:8000/contacts/{id}
- Delete contact by id: - localhost:8000/contacts/{id}



 **Json body for post request**

{
    "name": "String",
    "phoneNumber": "String",
    "address": "String"
}

