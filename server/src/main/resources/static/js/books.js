window.onload = function(){
    getBooks();
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