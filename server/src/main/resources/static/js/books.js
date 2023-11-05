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
                   getBooks();
               })
               .catch(error => console.log(error));
           return false;
}

function getBooks() {
        var booksTable = document.querySelector("#booksTable");
        booksTable.innerHTML = "";
        fetch("/books")
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                for(let i = 0;i < jsonData.length; i++){
                    let btn = document.createElement("button");
                    btn.setAttribute("id",jsonData[i].id);
                    booksTable.innerHTML += "<tr><td><a href='book.html?id=" + jsonData[i].id +"'>"+ jsonData[i].author + "</a></td><td>" + jsonData[i].title +
                    "  <button class='edit' id="+ jsonData[i].id +">Szerkeszt</button><button class='delete' id="+ jsonData[i].id +">Töröl</button></td></tr>";
                }
            }).catch(error => console.log(error));
}

