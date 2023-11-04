window.onload = function(){
    document.getElementById("createBook").addEventListener("click", createBook, false);
    getBooks();
}

function createBook(){

    let author = document.querySelector("#authorInput").value;
    let title = document.querySelector("#titleInput").value;

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
                   handleActions(jsonData);
               })
               .catch(error => console.log(error));
           return false;
}

function handleActions(jsonData){
console.log(jsonData)
}


function getBooks() {
        fetch("/books")
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                var booksTable = document.querySelector("#booksTable");
                for(let i = 0;i < jsonData.length; i++){
                    booksTable.innerHTML += "<tr><td><a href='book.html?id=" + jsonData[i].id +"'>"+ jsonData[i].author + "</a></td><td>" + jsonData[i].title +
                    "</td></tr>"
                }
            }).catch(error => console.log(error));
}

