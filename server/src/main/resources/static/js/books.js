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
        fetch("/books")
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                fillTable(jsonData);
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
        let link = document.createElement("a");
        link.setAttribute("href","book.html?id="+row.id);
        link.innerHTML = row.author;
        authorTd.appendChild(link);
        tr.appendChild(authorTd);
        let titleTd = document.createElement("td");
        titleTd.innerHTML = row.title;
        tr.appendChild(titleTd);
        let deleteBtn = document.createElement("button");
        deleteBtn.setAttribute("id",row.id);
        deleteBtn.setAttribute("class","delete");
        deleteBtn.innerHTML = "Töröl";
        tr.appendChild(deleteBtn);
        let editBtn = document.createElement("button");
        editBtn.setAttribute("id",row.id);
        editBtn.setAttribute("class","edit");
        editBtn.innerHTML = "Módosít";
        tr.appendChild(editBtn);
        return tr;
}

