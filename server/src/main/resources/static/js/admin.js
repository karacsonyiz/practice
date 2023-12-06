window.onload = function(){
    document.getElementById("createBook").addEventListener("click", createBook, false);
    document.getElementById("createUser").addEventListener("click", createUser, false);
    document.getElementById("modifyBook").addEventListener("click", modifyBook, false);
    document.getElementById("booksBtn").addEventListener("click", showBooks, false);
    document.getElementById("usersBtn").addEventListener("click", showUsers, false);
    getBooks();
    getUsers();
    getPrincipal();
}

function showBooks(){
document.querySelector("#books").style = "display : block;"
document.querySelector("#users").style = "display : none;"
}

function showUsers(){
document.querySelector("#users").style = "display : block;"
document.querySelector("#books").style = "display : none;"
}

function getPrincipal() {
        fetch("/principal")
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                console.log(jsonData);
            }).catch(error => console.log(error));
}

$('#myModal').on('shown.bs.modal', function () {
  $('#myInput').trigger('focus')
})

function modifyBook(){
     let author = document.querySelector("#author").value;
     let title = document.querySelector("#title").value;
     let price = document.querySelector("#price").value;
     let id = document.querySelector("#bookId").value;

     if(!areValuesValid(author,title)){
         setModifyNotification(false);
         return;
     }
         let book = {
                        "author": author,
                        "title": title,
                        "price": price
                    }

     fetch("book/update/" + id, {
                     method: "POST",
                     headers: {
                         "Content-Type": "application/json; charset=utf-8"
                             },
                     body: JSON.stringify(book)
            }).then(function(response) {
                       return response.json();
                   })
                   .then(function(jsonData) {
                       setModifyNotification(true,jsonData);
                   })
                   .catch(error => console.log(error));
               return false;
 }

 function modifyUser(){

    let name = document.querySelector("#nameInput").value;
    let password = document.querySelector("#passwordInput").value;
    let email = document.querySelector("#emailInput").value;

    let user = {
                   "name": name,
                   "password": password,
                   "email": email
               }

     fetch("user/update/" + id, {
                     method: "POST",
                     headers: {
                         "Content-Type": "application/json; charset=utf-8"
                             },
                     body: JSON.stringify(book)
            }).then(function(response) {
                       return response.json();
                   })
                   .then(function(jsonData) {
                       setModifyNotification(true,jsonData);
                   })
                   .catch(error => console.log(error));
               return false;
 }

function setModifyNotification(isValid,jsonData){
        if(!isValid){
            document.querySelector("#modifyNotification").setAttribute("style","color : red;")
            document.querySelector("#modifyNotification").innerHTML = "Invalid input!"
        }
        if(isValid) {
            document.querySelector("#modifyNotification").setAttribute("style","color : green;")
            document.querySelector("#modifyNotification").innerHTML = "Modification Successful!";
        }
    getBooks()
}

function deleteBook(id) {
        fetch("/book/delete/" + id)
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                getBooks();
            }).catch(error => console.log(error));
}

function areValuesValid(input1,input2){
    if(input1 == "" || input2 == ""){
        return false;
    }
    return true;
}

function setCreateNotification(isValid,type){

    if(type == "User") {
            if(!isValid){
                document.querySelector("#createNotificationForUser").setAttribute("style","color : red;")
                document.querySelector("#createNotificationForUser").innerHTML = "Invalid input!"
            }
            if(isValid) {
                document.querySelector("#createNotificationForUser").setAttribute("style","color : green;")
                document.querySelector("#createNotificationForUser").innerHTML = "User Created!"
            }
    }

    if(type == "Book") {
            if(!isValid){
                document.querySelector("#createNotificationForBook").setAttribute("style","color : red;")
                document.querySelector("#createNotificationForBook").innerHTML = "Invalid input!"
            }
            if(isValid) {
                document.querySelector("#createNotificationForBook").setAttribute("style","color : green;")
                document.querySelector("#createNotificationForBook").innerHTML = "Book Created!"
            }
    }


}

function createBook(){
    let author = document.querySelector("#authorInput").value;
    let title = document.querySelector("#titleInput").value;
    let price = document.querySelector("#priceInput").value;

    if(!areValuesValid(author,title)){
        setCreateNotification(false,"Book");
        return;
    }

    let book = {
                   "author": author,
                   "title": title,
                   "price": price
               }
     fetch("createbook", {
                 method: "POST",
                 headers: {
                     "Content-Type": "application/json; charset=utf-8"
                         },
                 body: JSON.stringify(book)
        }).then(function(response) {
                   return response.json();
               })
               .then(function(jsonData) {
                   setCreateNotification(true,"Book");
                   getBooks();
               })
               .catch(error => console.log(error));
           return false;
}

function createUser(){
    let name = document.querySelector("#nameInput").value;
    let password = document.querySelector("#passwordInput").value;
    let email = document.querySelector("#emailInput").value;

    if(!areValuesValid(name,password)){
        setCreateNotification(false,"User");
      return;
    }

    let user = {
                   "name": name,
                   "password": password,
                   "email": email
               }
     fetch("createuser", {
                 method: "POST",
                 headers: {
                     "Content-Type": "application/json; charset=utf-8"
                         },
                 body: JSON.stringify(user)
        }).then(function(response) {
                   return response.json();
               })
               .then(function(jsonData) {
                   setCreateNotification(true,"User");
                   getBooks();
               })
               .catch(error => console.log(error));
           return false;
}

function getBooks() {
        fetch("/books")
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                fillBookTable(jsonData);
            }).catch(error => console.log(error));
}

function getUsers() {
        fetch("/users")
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                fillUserTable(jsonData);
                console.log(jsonData);
            }).catch(error => console.log(error));
}

function fillBookTable(jsonData){
        const booksTable = document.querySelector("#booksTable");
        booksTable.innerHTML = "";
        for(let i = 0;i < jsonData.length; i++){
            tr = createRowForBooks(jsonData[i]);
            booksTable.appendChild(tr);
        }
}

function fillUserTable(jsonData){
        const usersTable = document.querySelector("#usersTable");
        usersTable.innerHTML = "";
        for(let i = 0;i < jsonData.length; i++){
            tr = createRowForUsers(jsonData[i]);
            usersTable.appendChild(tr);
        }
}

function createRowForUsers(row){
        let tr = document.createElement("tr");
        let nameTd = document.createElement("td");
        nameTd.innerHTML = row.name;
        tr.appendChild(nameTd);
        let emailTd = document.createElement("td");
        emailTd.innerHTML = row.email;
        tr.appendChild(emailTd);
        let enabledTd = document.createElement("td");
        enabledTd.innerHTML = row.enabled;
        tr.appendChild(enabledTd);
        let roleTd = document.createElement("td");
        roleTd.innerHTML = row.role;
        tr.appendChild(roleTd);
        let buttonTd = document.createElement("td");
        let deleteBtn = document.createElement("button");
        deleteBtn.setAttribute("id",row.id);
        deleteBtn.setAttribute("class","delete btn btn-danger rounded-pill px-3 mr-2");
        deleteBtn.setAttribute("style","background-color: #dc3545;");
        deleteBtn.addEventListener("click", function(){deleteUser(row.id);}, false);
        deleteBtn.innerHTML = "Delete";
        buttonTd.appendChild(deleteBtn);
        let editBtn = document.createElement("button");
        editBtn.setAttribute("id",row.id);
        editBtn.setAttribute("class","edit btn btn-warning rounded-pill px-3 mr-2");
        editBtn.setAttribute("style","background-color: #ffc107;");
        editBtn.innerHTML = "Edit";
        editBtn.addEventListener("click", function(){getUser(row.id);}, false);
        buttonTd.appendChild(editBtn);
        tr.appendChild(buttonTd);
        return tr;
}

function deleteUser(){
console.log("delete");

}

function getUser(){
console.log("get");
}


function createRowForBooks(row){
        let tr = document.createElement("tr");
        let authorTd = document.createElement("td");
        authorTd.innerHTML = row.author;
        tr.appendChild(authorTd);
        let titleTd = document.createElement("td");
        titleTd.innerHTML = row.title;
        tr.appendChild(titleTd);
        let priceTd = document.createElement("td");
        priceTd.innerHTML = row.price;
        tr.appendChild(priceTd);
        let buttonTd = document.createElement("td");
        let deleteBtn = document.createElement("button");
        deleteBtn.setAttribute("id",row.id);
        deleteBtn.setAttribute("class","delete btn btn-danger rounded-pill px-3 mr-2");
        deleteBtn.setAttribute("style","background-color: #dc3545;");
        deleteBtn.addEventListener("click", function(){deleteBook(row.id);}, false);
        deleteBtn.innerHTML = "Delete";
        buttonTd.appendChild(deleteBtn);
        let editBtn = document.createElement("button");
        editBtn.setAttribute("id",row.id);
        editBtn.setAttribute("class","edit btn btn-warning rounded-pill px-3 mr-2");
        editBtn.setAttribute("style","background-color: #ffc107;");
        editBtn.innerHTML = "Edit";
        editBtn.setAttribute("data-toggle","modal");
        editBtn.setAttribute("data-target","#modifyModal");
        editBtn.addEventListener("click", function(){getBook(row.id);}, false);
        let idContainer = document.createElement("p");
        idContainer.setAttribute("style","display:none;");
        buttonTd.appendChild(editBtn);
        tr.appendChild(buttonTd);
        return tr;
}

function getBook(id) {
        fetch("/book/" + id)
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                console.log(jsonData);
                fillModal(jsonData);
            }).catch(error => console.log(error));
}

function fillModal(jsonData){
    document.querySelector("#bookId").value = jsonData.id;
    document.querySelector("#author").value = jsonData.author;
    document.querySelector("#title").value = jsonData.title;
    document.querySelector("#price").value = jsonData.price;
}

