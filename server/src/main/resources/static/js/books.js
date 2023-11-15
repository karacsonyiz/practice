window.onload = function(){
    document.getElementById("createBook").addEventListener("click", createBook, false);
    document.getElementById("modifyBook").addEventListener("click", modifyBook, false);
    getBooks();
    getUsers();
    getPrincipal();

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
console.log("a")
    let author = document.querySelector("#author").value;
    let title = document.querySelector("#title").value;
    let id = document.querySelector("#bookId").value;

    if(!areValuesValid(author,title)){
        setModifyNotification(false);
        return;
    }
        let book = {
                       "author": author,
                       "title": title
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

function setModifyNotification(isValid,jsonData){
console.log(jsonData)
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

function areValuesValid(author,title){
    if(author == "" || title == ""){
        return false;
    }
    return true;
}

function setCreateNotification(isValid){
    if(!isValid){
        document.querySelector("#createNotification").setAttribute("style","color : red;")
        document.querySelector("#createNotification").innerHTML = "Invalid input!"
    }
    if(isValid) {
        document.querySelector("#createNotification").setAttribute("style","color : green;")
        document.querySelector("#createNotification").innerHTML = "Book Created!"
    }
}

function createBook(){
    let author = document.querySelector("#authorInput").value;
    let title = document.querySelector("#titleInput").value;

    if(!areValuesValid(author,title)){
        setCreateNotification(false);
        return;
    }

    console.log(author)
    console.log(title)

    let book = {
                   "author": author,
                   "title": title
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
                   setCreateNotification(true);
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
                fillTable(jsonData);
            }).catch(error => console.log(error));
}

function getUsers() {
        fetch("/users")
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                console.log(jsonData);
            }).catch(error => console.log(error));
}

function fillTable(jsonData){
        const booksTable = document.querySelector("#booksTable");
        booksTable.innerHTML = "";
        for(let i = 0;i < jsonData.length; i++){
            tr = createRow(jsonData[i]);
            booksTable.appendChild(tr);
        }
}

function createRow(row){
        let tr = document.createElement("tr");
        let authorTd = document.createElement("td");
        authorTd.innerHTML = row.author;
        tr.appendChild(authorTd);
        let titleTd = document.createElement("td");
        titleTd.innerHTML = row.title;
        tr.appendChild(titleTd);
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
}

